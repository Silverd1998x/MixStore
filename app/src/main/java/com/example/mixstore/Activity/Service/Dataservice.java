package com.example.mixstore.Activity.Service;

import com.example.mixstore.Activity.Model.Quangcao;
import com.example.mixstore.Activity.Model.Sanpham;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {

    @GET("quangcao.php")
    Call<List<Quangcao>> GetDataQuangCao();

    @GET("sanpham.php")
    Call<List<Sanpham>> GetSanPham();
}
