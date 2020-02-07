package com.example.practicaunonavigation.rest.service;

import com.example.practicaunonavigation.rest.constants.ApiConstants;
import com.example.practicaunonavigation.rest.model.Owner;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {


    @GET(ApiConstants.GITHUB_USER_ENDPOINT)
    Call<Owner> getOwner(@Path("owner") String owner);

    @GET(ApiConstants.GITHUB_FOLLOWERS_ENDPOINT)
    Call<List<Owner>> getOwnerFollowers(@Path("owner") String owner);
}

