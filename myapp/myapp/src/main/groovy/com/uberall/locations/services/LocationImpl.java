package com.uberall.locations.services;

import com.uberall.locations.domain.request.interfaces.LocationApi;
import com.uberall.locations.domain.response.pojos.UberAPIResponse;
import com.uberall.locations.response.MapResponse;
import com.uberall.locations.transformers.LocationOutputTransformer;
import com.uberall.locations.util.GenericRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class LocationImpl implements LocationService {

    @Autowired
    LocationOutputTransformer t;

    @Autowired
    GenericRestService genericRestService;



    @Override
    public List<MapResponse> getLocation(String size,String status,String offset,String businessId) throws IOException {
        List<MapResponse> rsp=null;
        LocationApi locApi= genericRestService.creatClient("http://sandbox.uberall.com",LocationApi.class,"aGQZ9qMJmh2QOWGmuNw0RhZvPcN4Lmt4FUFdIc4ltf6d0Bopeq2IuhyGB3ihr1P9");
        UberAPIResponse res =locApi.getLocations(size,status,offset,businessId).execute().body();
        //LocationOutputTransformer t= factory.getTransformer("LOCATION");
        rsp= t.transform(res);
        return rsp;
    }
}
