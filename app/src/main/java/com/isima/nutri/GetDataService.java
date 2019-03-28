package com.isima.nutri;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetDataService {
    @GET("{id}")
    Call<Produit> getProduit(@Path("id") String id);
}
