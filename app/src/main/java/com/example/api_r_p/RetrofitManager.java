package com.example.api_r_p;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitManager {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        return retrofit;
    }

}
