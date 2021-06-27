package com.uberall.locations.domain.response.pojos;
public class OpeningHour{
    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getFrom1() {
        return from1;
    }

    public void setFrom1(String from1) {
        this.from1 = from1;
    }

    public String getTo1() {
        return to1;
    }

    public void setTo1(String to1) {
        this.to1 = to1;
    }

    public int dayOfWeek;
    public String from1;
    public String to1;

    @Override
    public String toString() {
        return "{\"dayOfWeek\":"+dayOfWeek+"  \"from1\":\""+from1+"\" \"to1\":\""+to1+"\"}";
    }
}