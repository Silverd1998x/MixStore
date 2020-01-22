package com.example.mixstore.Activity.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mixstore.Activity.Adapter.Quang_Cao_Adapter;
import com.example.mixstore.Activity.Model.Quangcao;
import com.example.mixstore.Activity.Service.APIService;
import com.example.mixstore.Activity.Service.Dataservice;
import com.example.mixstore.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Quang_Cao extends Fragment {

    ViewPager viewpagerquangcao;
    Quang_Cao_Adapter quang_cao_adapter;
    Runnable runnable;
    Handler handler;
    int currentItem;

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_quang_cao,container,false);
        viewpagerquangcao = (ViewPager) view.findViewById(R.id.viewpagerquangcao);
        GetData();
        return view;
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<Quangcao>> callback = dataservice.GetDataQuangCao();
        callback.enqueue(new Callback<List<Quangcao>>() {
            @Override
            public void onResponse(Call<List<Quangcao>> call, Response<List<Quangcao>> response) {
                ArrayList<Quangcao> mangquangcao = (ArrayList<Quangcao>) response.body();
                quang_cao_adapter = new Quang_Cao_Adapter(getActivity(), mangquangcao);
                viewpagerquangcao.setAdapter(quang_cao_adapter);

                handler = new Handler();
                runnable = new Runnable() {
                    @Override
                    public void run() {
                        currentItem = viewpagerquangcao.getCurrentItem();
                        currentItem++;
                        if (currentItem >= viewpagerquangcao.getAdapter().getCount()) {
                            currentItem = 0;
                        }
                        viewpagerquangcao.setCurrentItem(currentItem, true);
                        handler.postDelayed(runnable, 4500);
                    }
                };
                handler.postDelayed(runnable, 4500);
            }

            @Override
            public void onFailure(Call<List<Quangcao>> call, Throwable t) {

            }
        });
    }
}
