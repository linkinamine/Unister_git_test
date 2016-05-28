package com.unister.gitquery.Network.Response;

import com.unister.gitquery.Pojo.Repository;

import java.util.List;

public class GitResponse {

    List<Repository> items;

    /**
     *
     * @return List<Repository>
     */
    public List<Repository> getRepoData() {
        return items;
    }
}