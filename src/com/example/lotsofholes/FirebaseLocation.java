package com.example.lotsofholes;


public class FirebaseLocation {

    private String lon, lat;

    public String getLon() {
	return lon;
    }

    public void setLon(String lon) {
	this.lon = lon;
    }

    public String getLat() {
	return lat;
    }

    public void setLat(String lat) {
	this.lat = lat;
    }

    public FirebaseLocation(String lon, String lat) {
	this.lon = lon;
	this.lat = lat;
    }



}
