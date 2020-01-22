package com.example.mixstore.Activity.Service;

public class APIService {

    private static String base_url = "http://unwifely-elbow.000webhostapp.com/sever/";

    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
