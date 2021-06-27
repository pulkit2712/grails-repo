package myapp

import grails.core.support.GrailsConfigurationAware
import grails.gorm.transactions.Transactional

import java.util.stream.Collectors

import static org.springframework.http.HttpStatus.OK
import grails.config.Config

@Transactional(readOnly = true)
class StoreLocationController  {

    static mapping = {
        autowire true
    }
    def csvContentService
    def jsonContentService
    def xmlContentService
    def locationImpl
    def list() {
//service for new content can be added
        switch(params.content) {
            case "xml":
            respond xmlContentService.getData(params), formats: ['xml']
                break
            case "json":
                respond jsonContentService.getData(params) ,formats: ['json']
            break
            case "csv":
                def outs = response.outputStream
                response.status = OK.value()
                response.contentType = csvContentService.getContentType()
                def headers=csvContentService.getHeaders()
                headers.each({ it -> response.setHeader(it.key, it.value) })
                csvContentService.getData(params).each {  line -> outs <<"${line}\n"}
                outs.flush()
                outs.close()
            break
            default:
            respond  locationImpl.getLocation(params.size,params.status,params.offset,params.businessid),formats: ['json']
        }


    }


}
