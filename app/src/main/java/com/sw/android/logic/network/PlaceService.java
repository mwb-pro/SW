package com.sw.android.logic.network;



import com.sw.android.SunnyWeatherApplication;
import com.sw.android.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlaceService {
    @GET("v2/place?token="+ SunnyWeatherApplication.TOKEN+"&lang=zh_CN")
    Call<PlaceResponse> searchPlaces(@Query("query") String query);
}
