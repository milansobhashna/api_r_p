package com.example.api_r_p;

public class ApiClass {

    public ApiClass() {
    }

    public static final String BASE_URL = "https://mutable-villages.000webhostapp.com/";

    public static RequestInterface getAPIService() {

        return RetrofitManager.getClient(BASE_URL).create(RequestInterface.class);
    }
}
