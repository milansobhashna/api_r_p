package com.example.api_r_p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.UserData;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private RequestInterface requestInterface;
    String name = "dev";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestInterface = ApiClass.getAPIService();
        SendData(name);
    }

    private void SendData(String name) {

        requestInterface.data(name).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d("testuser", response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("milan", String.valueOf(t));
            }
        });

    }

}
