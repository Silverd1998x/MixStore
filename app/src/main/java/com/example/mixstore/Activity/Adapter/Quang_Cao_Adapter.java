package com.example.mixstore.Activity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.mixstore.Activity.Model.Quangcao;
import com.example.mixstore.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Quang_Cao_Adapter extends PagerAdapter {
    Context context;
    ArrayList<Quangcao> quangcaoArrayList;

    public Quang_Cao_Adapter(Context context, ArrayList<Quangcao> quangcaoArrayList) {
        this.context = context;
        this.quangcaoArrayList = quangcaoArrayList;
    }

    @Override
    public int getCount() {
        return quangcaoArrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_quang_cao,null);

        ImageView imageviewquagcao = view.findViewById(R.id.imageviewquangcao);
        Picasso.with(context).load(quangcaoArrayList.get(position).getHinhquangcao()).into(imageviewquagcao);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
