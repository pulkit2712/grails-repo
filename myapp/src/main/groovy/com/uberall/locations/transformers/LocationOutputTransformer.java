package com.uberall.locations.transformers;

import com.uberall.locations.domain.response.pojos.Location;
import com.uberall.locations.domain.response.pojos.UberAPIResponse;
import com.uberall.locations.response.LocationMapResponse;
import com.uberall.locations.response.MapResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class LocationOutputTransformer implements OutputTransformer  {


    public List<MapResponse> transform(UberAPIResponse input){
        List<MapResponse> resplist =new ArrayList();
        for(Location loc:input.getResponse().getLocations()){
            LocationMapResponse res =new LocationMapResponse();
            res.setName(loc.getName());
            res.setCity(loc.getCity());
            res.setKeywords(loc.getKeywords().stream().map(k->k.toString()).collect(Collectors.joining(",")));
            res.setLat(loc.getLat());
            res.setLng(loc.getLng());
            res.setStreetAndStreetNo(loc.getStreetAndNumber());
            res.setZip(loc.getZip());
            res.setOpeningHours(loc.getOpeningHours());

            resplist.add(res);
        }

      return resplist;



    }


}
