import com.uberall.locations.transformers.LocationOutputTransformer

// Place your Spring DSL code here
beans = {
    genericRestService(com.uberall.locations.util.GenericRestService){

    }
    locationOutputTransformer(LocationOutputTransformer){

    }
    locationImpl(com.uberall.locations.services.LocationImpl){
       // genericRestService = ref("com.uberall.locations.util.GenericRestService")
        //locationOutputTransformer = ref('com.uberall.locations.transformers.LocationOutputTransformer')
       // size=int
    }






    }
