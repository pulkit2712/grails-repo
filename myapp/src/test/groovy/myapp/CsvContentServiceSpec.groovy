package myapp

import com.uberall.locations.services.LocationImpl
import grails.testing.mixin.integration.Integration
import grails.testing.services.ServiceUnitTest
import grails.web.servlet.mvc.GrailsParameterMap
import org.grails.datastore.gorm.bootstrap.support.InstanceFactoryBean
import org.grails.plugins.testing.GrailsMockHttpServletRequest
import spock.lang.Specification

import java.util.stream.Collectors

@Integration(applicationClass = Application.class)
class CsvContentServiceSpec extends Specification implements ServiceUnitTest<CsvContentService>{
    def locationImpl
    CsvContentService c
    static doWithSpring = {
        locationImpl(LocationImpl)
    }

    def setup() {
        c=new CsvContentService()
        c.locationImpl=locationImpl
        // locationImpl = applicationContext.getBean("locationImpl")
    }

    def cleanup() {
    }

    void "test content"() {


        def s=c.getContentType()


        expect:"fix me"
        s.equals("text/csv;charset=UTF-8")
    }
    void "test data"() {
        GrailsMockHttpServletRequest request = new GrailsMockHttpServletRequest()
        request.setParameter("size","50")
        request.setParameter("content","csv")


        def params=new GrailsParameterMap([:], request)
        def lines=c.getData(params)


        expect:
        lines!=null
    }
}
