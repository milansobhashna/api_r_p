package com.example.api_r_p;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RequestInterface {
    @POST("test_post.php")
    @FormUrlEncoded
    Call<String> data(@Field("u_name") String name);
}
