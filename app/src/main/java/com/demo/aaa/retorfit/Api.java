package com.demo.aaa.retorfit;

import com.demo.aaa.retorfit.Model.Model;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by aaa on 3/13/18.
 */

public class Api {
    private static final String url = "https://movesync-qa.dcsg.com/";

    public static PostService postService = null;

    public static PostService getPostService() {
        if (postService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService {

        @GET("dsglabs/mobile/api/venue/")
        Call<Model> getPostList();
    }

}
