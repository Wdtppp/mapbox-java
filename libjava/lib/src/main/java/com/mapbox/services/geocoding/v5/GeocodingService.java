package com.mapbox.services.geocoding.v5;

import com.mapbox.services.geocoding.v5.models.GeocodingResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by antonio on 1/30/16.
 */
public interface GeocodingService {

    @GET("/geocoding/v5/{dataset}/{query}.json")
    Call<GeocodingResponse> geocode(
            @Path("dataset") String dataset,
            @Path("query") String query,
            @Query("access_token") String accessToken,
            @Query("proximity") String proximity,
            @Query("types") String types);

}