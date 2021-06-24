package myapp

import grails.core.support.GrailsConfigurationAware
import grails.gorm.transactions.Transactional

import java.util.stream.Collectors

import static org.springframework.http.HttpStatus.OK
import grails.config.Config

@Transactional(readOnly = true)
class StoreLocationController implements GrailsConfigurationAware {
	static responseFormats = ['json', 'xml']
    String csvMimeType

    String encoding
    static mapping = {
        autowire true
    }
    def locationImpl
    def list() {
//new content can be added
        switch(params.content) {
            case "xml":
            respond locationImpl.getLocation(params.size,params.status,params.offset,params.businessid), formats: ['xml']
                break
            case "json":
                respond  locationImpl.getLocation(params.size,params.status,params.offset,params.businessid),formats: ['json']
            break
            case "csv":
                final String filename = 'location.csv'
                def lines = locationImpl.getLocation(params.size,params.status,params.offset,params.businessid).findAll().collect {it-> [it.city, it.keywords, it.lat, it.lng, it.name, it.openingHours.stream().map({ k -> k.toString() }).collect(Collectors.joining("||")), it.streetAndStreetNo, it.zip].join(',') } as List<String>;

                def outs = response.outputStream
                response.status = OK.value()
                response.contentType = "${csvMimeType};charset=${encoding}";
                response.setHeader "Content-disposition", "attachment; filename=${filename}"
                def header = "city,keywords,lat,lan,name,openingHours,street&number,zip"
                outs <<"${header}\n"
                lines.each { String line -> outs <<"${line}\n"}

                outs.flush()
                outs.close()
            break
            default:
            respond  locationImpl.getLocation(params.size,params.status,params.offset,params.businessid),formats: ['json']
        }


    }

    @Override
    void setConfiguration(Config co) {
        csvMimeType = co.getProperty('grails.mime.types.csv', String, 'text/csv')
        encoding = co.getProperty('grails.converters.encoding', String, 'UTF-8')

    }
}
