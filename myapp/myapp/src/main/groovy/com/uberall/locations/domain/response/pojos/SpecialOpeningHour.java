package com.uberall.locations.domain.response.pojos;
public class SpecialOpeningHour{
    private String date;
    private String from1;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    private String to1;
}