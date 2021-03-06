package myapp

import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

import javax.servlet.http.HttpServletResponse
import java.util.stream.Collectors

import static org.springframework.http.HttpStatus.OK

@Transactional
class CsvContentService implements ContentService  {
    def locationImpl
    def HeaderMap = [
            'Content-disposition' : 'attachment; filename=location.csv'
    ]
    String csvHeader="city,keywords,lat,lan,name,openingHours,street&number,zip"

    def getData(GrailsParameterMap params) {
        def lines =[]

        lines=locationImpl.getLocation(params.size,params.status,params.offset,params.businessid).findAll().collect {it-> [it.city, it.keywords, it.lat, it.lng, it.name, it.openingHours.stream().map({ k -> k.toString() }).collect(Collectors.joining("||")), it.streetAndStreetNo, it.zip].join(',') } as List<String>
        lines.add(0,csvHeader);
        return lines
    }


    def getContentType() {
        return "text/csv;charset=UTF-8"
    }

    def getHeaders(){
        return HeaderMap
    }
}
