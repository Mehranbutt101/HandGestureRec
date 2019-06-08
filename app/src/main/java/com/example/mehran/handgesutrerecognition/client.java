package com.example.mehran.handgesutrerecognition;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface client {
    @GET("home")
    Call<MyResponse> home();

    @Multipart
    @POST("predict")
    Call<Prediction> uploadFile(@Part MultipartBody.Part file, @Part("image") RequestBody name);

}
