package com.uberall.locations.services;

import com.uberall.locations.domain.request.interfaces.LocationApi;
import com.uberall.locations.domain.response.pojos.UberAPIResponse;
import com.uberall.locations.response.MapResponse;
import com.uberall.locations.transformers.LocationOutputTransformer;
import com.uberall.locations.util.GenericRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;
import java.util.stream.Collectors;



@Component
public class LocationImpl implements LocationService {

    @Autowired
    LocationOutputTransformer t;

    @Autowired
    GenericRestService genericRestService;

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    String baseURL;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    String token;



    @Override
    public List<MapResponse> getLocation(String size,String status,String offset,String businessId) throws IOException {
        List<MapResponse> rsp=null;

        if("ALL".equalsIgnoreCase(size)){
            rsp =getAllLocations();
        }else {
            LocationApi locApi = genericRestService.creatClient(baseURL, LocationApi.class, token);
            UberAPIResponse res = locApi.getLocations(size, status, offset, businessId).execute().body();
            //LocationOutputTransformer t= factory.getTransformer("LOCATION");
            rsp = t.transform(res);
        }

        return rsp;
    }


    public List<MapResponse> getAllLocations()throws IOException{
        List<MapResponse> resp=new ArrayList<>();
        LocationApi locApi= genericRestService.creatClient("http://sandbox.uberall.com",LocationApi.class,"aGQZ9qMJmh2QOWGmuNw0RhZvPcN4Lmt4FUFdIc4ltf6d0Bopeq2IuhyGB3ihr1P9");
        UberAPIResponse res =locApi.getLocations(null,null,null,null).execute().body();
        int count =res.getResponse().getCount();
        int recordPerPage=res.getResponse().getMax();
        int page =1;
        resp.addAll(t.transform(res));
        List<CompletableFuture<List<MapResponse>>> futures = new ArrayList();
        while(page<count){


            int finalPage = page;
            futures.add(CompletableFuture.supplyAsync(()->{
                List<MapResponse> pageRes=null;
                try {
                    pageRes= t.transform(getAll(finalPage));

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return pageRes;
            }));
             page=page+recordPerPage;
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRunAsync(() -> System.out.println("Request Execution Completed")).join();
        futures.stream().parallel().forEach(c-> {
            try {
                List<MapResponse> m= (List<MapResponse>) c.get();
                if(m!=null)
                    resp.addAll(m);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });





        return resp;



    }


     UberAPIResponse getAll(int page) throws IOException {
        LocationApi locApi= genericRestService.creatClient("http://sandbox.uberall.com",LocationApi.class,"aGQZ9qMJmh2QOWGmuNw0RhZvPcN4Lmt4FUFdIc4ltf6d0Bopeq2IuhyGB3ihr1P9");
        return locApi.getLocations(null,null,String.valueOf(page),null).execute().body();
    }
}
