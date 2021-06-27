package com.uberall.locations.response;

import com.uberall.locations.domain.response.pojos.OpeningHour;
import com.uberall.locations.response.MapResponse;

import java.util.List;

public class LocationMapResponse implements MapResponse
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreetAndStreetNo() {
        return streetAndStreetNo;
    }

    public void setStreetAndStreetNo(String streetAndStreetNo) {
        this.streetAndStreetNo = streetAndStreetNo;
    }

    public List<OpeningHour> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(List<OpeningHour> openingHours) {
        this.openingHours = openingHours;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    String city;
    String zip;
    public String streetAndStreetNo;
    List<OpeningHour> openingHours;
    String keywords;
    public double lat;
    public double lng;


}
