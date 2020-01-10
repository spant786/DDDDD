package com.example.facebook160250.network;

import com.example.facebook160250.model.Login;
import com.example.facebook160250.model.Post;
import com.example.facebook160250.model.PostResponse;
import com.example.facebook160250.model.Register;
import com.example.facebook160250.model.Response;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitApi {

    @POST("auth/login")
    Call<List<Response>> login(@Body Login user);

    @Multipart
    @POST("addpost")
    Call<List<PostResponse>> addpost(@Header("Authorization") String token,
                                     @Part("caption") RequestBody caption,
                                     @Part MultipartBody.Part file
                                     );
    @POST("getposts")
    Call<List<Post>> getPost(@Header("Authorization") String token);


    @POST("auth/register")
    Call<List<Response>> register(@Body Register register);

}
