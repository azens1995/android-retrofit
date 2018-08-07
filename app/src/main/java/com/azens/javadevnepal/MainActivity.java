package com.azens.javadevnepal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.azens.javadevnepal.api.GituhubUserClient;
import com.azens.javadevnepal.api.ServiceGenerator;
import com.azens.javadevnepal.model.JavaDeveloper;
import com.azens.javadevnepal.model.JavaDeveloperResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        GituhubUserClient client = ServiceGenerator.createService(GituhubUserClient.class);

        Call<JavaDeveloperResponse> call = client.getUser();
        call.enqueue(new Callback<JavaDeveloperResponse>() {
            @Override
            public void onResponse(Call<JavaDeveloperResponse> call, Response<JavaDeveloperResponse> response) {
                List<JavaDeveloper> users = response.body().getJavaDevelopers();
                recyclerView.setAdapter(new JavaDeveloperAdapter(users,MainActivity.this));
            }

            @Override
            public void onFailure(Call<JavaDeveloperResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error :(", Toast.LENGTH_SHORT).show();

            }
        });




    }
}
