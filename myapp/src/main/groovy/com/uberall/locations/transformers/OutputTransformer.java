package com.uberall.locations.transformers;

import com.uberall.locations.domain.response.pojos.UberAPIResponse;
import com.uberall.locations.response.MapResponse;

import java.util.List;

public interface OutputTransformer {

    public List<MapResponse> transform(UberAPIResponse input);
}
