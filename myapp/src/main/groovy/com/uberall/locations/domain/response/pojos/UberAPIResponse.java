package com.uberall.locations.domain.response.pojos;

public class UberAPIResponse {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    private String status;
    private Response response;

}
