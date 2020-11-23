package com.example.weatherapp.RetroFit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("weather?appid=e2398e46f96d17e27ce2d69ffd2a2e3f&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);
}
