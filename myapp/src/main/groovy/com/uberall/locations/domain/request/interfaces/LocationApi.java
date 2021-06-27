package com.uberall.locations.domain.request.interfaces;
import com.uberall.locations.domain.response.pojos.UberAPIResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface LocationApi {

    @GET("/api/locations")
    Call<UberAPIResponse> getLocations(@Query("max") String max,@Query("status") String status,@Query("offset") String offset,@Query("businessId") String businessId);

}
