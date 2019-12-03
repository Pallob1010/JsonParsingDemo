package com.project.jsonparsingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Adapters.CustomRecyclerView;
import ModelClass.RecievedData;
import NetworkConnection.ApiClient;
import NetworkConnection.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomRecyclerView adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.click);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiService apiService=ApiClient.getobject().create(ApiService.class);
                Call<ArrayList<RecievedData>>call=apiService.getAll();

                call.enqueue(new Callback<ArrayList<RecievedData>>() {
                    @Override
                    public void onResponse(Call<ArrayList<RecievedData>> call, Response<ArrayList<RecievedData>> response) {
                        adapter=new CustomRecyclerView(response.body(),MainActivity.this);
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<ArrayList<RecievedData>> call, Throwable t) {

                    }
                });

            }
        });



    }
}
