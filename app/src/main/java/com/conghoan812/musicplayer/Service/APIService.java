package com.conghoan812.musicplayer.Service;

public class APIService {
    private static String base_url = "https://nguyenconghoan08012002.000webhostapp.com/Server/";
    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
