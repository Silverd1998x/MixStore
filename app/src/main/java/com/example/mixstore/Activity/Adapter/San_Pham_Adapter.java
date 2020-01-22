package com.example.mixstore.Activity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mixstore.Activity.Model.Sanpham;
import com.example.mixstore.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class San_Pham_Adapter extends RecyclerView.Adapter<San_Pham_Adapter.ViewHoler> {
    Context context;
    ArrayList<Sanpham> sanphamArrayList;

    public San_Pham_Adapter(Context context, ArrayList<Sanpham> sanphamArrayList) {
        this.context = context;
        this.sanphamArrayList = sanphamArrayList;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_san_pham,parent,false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        Sanpham sanpham = sanphamArrayList.get(position);
        holder.textviewtensanpham.setText(sanpham.getTenmathang());
        holder.textviewgiasanpham.setText(sanpham.getGiamathang());
        Picasso.with(context).load(sanpham.getHinhanhmathang()).into(holder.imageviewsanpham);
    }

    @Override
    public int getItemCount() {
        return sanphamArrayList.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder{
        ImageView imageviewsanpham;
        TextView textviewtensanpham, textviewgiasanpham;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            imageviewsanpham = itemView.findViewById(R.id.imageviewsanpham);
            textviewtensanpham = itemView.findViewById(R.id.textviewtensanpham);
            textviewgiasanpham = itemView.findViewById(R.id.textviewgiasanpham);
        }
    }
}
