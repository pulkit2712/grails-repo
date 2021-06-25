import com.uberall.locations.domain.response.pojos.OpeningHour
import com.uberall.locations.response.LocationMapResponse
import com.uberall.locations.transformers.LocationOutputTransformer
import grails.rest.render.xml.XmlRenderer

// Place your Spring DSL code here
beans = {
    genericRestService(com.uberall.locations.util.GenericRestService){

    }
    locationOutputTransformer(LocationOutputTransformer){

    }
    locationImpl(com.uberall.locations.services.LocationImpl){
        baseURL=grailsApplication.config."uberAll.baseurl"
        token = grailsApplication.config."uberAll.token"

    }

    locationMapResponseRenderer(XmlRenderer, LocationMapResponse) {
        excludes = ['class']
    }
    openingHourRenderer(XmlRenderer, OpeningHour) {
        excludes = ['class']
    }






    }
