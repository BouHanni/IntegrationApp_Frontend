package com.isima.nutri;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {

    private GetDataService api;

    public GetDataService getProduitApi() {
        return api;
    }

    private ApiHelper() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:8080//products/").addConverterFactory(GsonConverterFactory.create()).build();
        api = retrofit.create(GetDataService.class);
    }

    private static volatile ApiHelper instance;


    public static synchronized ApiHelper getInstance() {
        if (instance == null) {
            instance = new ApiHelper();
        }
        return instance;
    }
}
