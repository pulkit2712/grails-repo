package com.uberall.locations.services;

import com.uberall.locations.response.MapResponse;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface LocationService {

    public List<MapResponse> getLocation(String size,String status,String offset,String businessId) throws Exception;
}
