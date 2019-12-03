package com.project.jsonparsingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import ModelClass.RecievedData;
import NetworkConnection.ApiClient;
import NetworkConnection.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiService apiService=ApiClient.getobject().create(ApiService.class);
        Call<List<RecievedData>>call=apiService.getAll();

        call.enqueue(new Callback<List<RecievedData>>() {
            @Override
            public void onResponse(Call<List<RecievedData>> call, Response<List<RecievedData>> response) {


            }

            @Override
            public void onFailure(Call<List<RecievedData>> call, Throwable t) {

            }
        });


    }
}
