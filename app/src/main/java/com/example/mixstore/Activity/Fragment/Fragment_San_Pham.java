package com.example.mixstore.Activity.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mixstore.Activity.Adapter.San_Pham_Adapter;
import com.example.mixstore.Activity.Model.Sanpham;
import com.example.mixstore.Activity.Service.APIService;
import com.example.mixstore.Activity.Service.Dataservice;
import com.example.mixstore.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_San_Pham extends Fragment {

    View view;
    TextView textviewxemthem;
    RecyclerView recyclerviewsanpham;
    San_Pham_Adapter san_pham_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_san_pham,container,false);
        textviewxemthem = view.findViewById(R.id.textviewxemthemsanpham);
        recyclerviewsanpham = view.findViewById(R.id.recyclerviewsanpham);
        GetData();
        return view;
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<Sanpham>> callbback = dataservice.GetSanPham();
        callbback.enqueue(new Callback<List<Sanpham>>() {
            @Override
            public void onResponse(Call<List<Sanpham>> call, Response<List<Sanpham>> response) {
                ArrayList<Sanpham> sanphamArrayList = (ArrayList<Sanpham>) response.body();
                san_pham_adapter = new San_Pham_Adapter(getActivity(),sanphamArrayList);
                recyclerviewsanpham.setLayoutManager(new GridLayoutManager(getActivity(),2));
                recyclerviewsanpham.setAdapter(san_pham_adapter);
            }

            @Override
            public void onFailure(Call<List<Sanpham>> call, Throwable t) {

            }
        });
    }
}
