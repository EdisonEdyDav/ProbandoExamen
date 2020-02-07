package com.example.practicaunonavigation.rest.adapter;

import com.example.practicaunonavigation.rest.constants.ApiConstants;
import com.example.practicaunonavigation.rest.model.Owner;
import com.example.practicaunonavigation.rest.service.GitHubService;

import java.util.List;

import retrofit2.Call;

public class GitHubAdapter extends BaseAdapter implements GitHubService {

    private GitHubService gitHubService;

    public GitHubAdapter() {
        super(ApiConstants.BASE_GITHUB_URL);
        gitHubService = createService(GitHubService.class);
    }

    @Override
    public Call<Owner> getOwner(String owner) {
        return gitHubService.getOwner(owner);
    }

    @Override
    public Call<List<Owner>> getOwnerFollowers(String owner) {
        return gitHubService.getOwnerFollowers(owner);
    }
}
