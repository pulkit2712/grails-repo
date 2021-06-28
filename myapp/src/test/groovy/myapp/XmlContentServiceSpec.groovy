package myapp

import com.uberall.locations.services.LocationImpl
import grails.testing.mixin.integration.Integration
import grails.testing.services.ServiceUnitTest
import grails.web.servlet.mvc.GrailsParameterMap
import org.grails.plugins.testing.GrailsMockHttpServletRequest
import spock.lang.Specification
@Integration(applicationClass = Application.class)
class XmlContentServiceSpec extends Specification implements ServiceUnitTest<XmlContentService>{
    def locationImpl
    XmlContentService c
    static doWithSpring = {
        locationImpl(LocationImpl)
    }
    def setup() {
        c=new XmlContentService()
        c.locationImpl=locationImpl
    }

    def cleanup() {
    }

    void "test data"() {
        GrailsMockHttpServletRequest request = new GrailsMockHttpServletRequest()
        request.setParameter("size","50")
        request.setParameter("content","xml")


        def params=new GrailsParameterMap([:], request)
        def lines=c.getData(params)


        expect:
        lines!=null
    }
}
