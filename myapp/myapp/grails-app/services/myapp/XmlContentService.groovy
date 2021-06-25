package myapp

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class XmlContentService implements ContentService {

    def locationImpl

    @Override
    def getData(GrailsParameterMap params) {
        return locationImpl.getLocation(params.size,params.status,params.offset,params.businessid)
    }
}
