package com.azens.javadevnepal.api;

import com.azens.javadevnepal.model.JavaDeveloperResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Azens Eklak on 8/7/18.
 */
public interface GituhubUserClient {
    @GET("search/users?q=language:android+location:nepal")
    Call<JavaDeveloperResponse> getUser();
}
