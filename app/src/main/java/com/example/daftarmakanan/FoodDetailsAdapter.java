package com.example.daftarmakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodDetailsAdapter extends RecyclerView.Adapter<FoodDetailsAdapter.ViewHolder> {

    private List<FoodDetailsItem> listItems;
    Context context;

    public FoodDetailsAdapter(List<FoodDetailsItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_details_desain, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final FoodDetailsItem detailsItem = listItems.get(position);

        String judul = detailsItem.getJudul();
        String deskripsi = detailsItem.getDeskripsi();

        holder.mjudul.setText(judul);
        holder.mdeskripsi.setText(deskripsi);
        Picasso.with(context).load(detailsItem.getGambar()).into(holder.mgambar);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mjudul;
        public ImageView mgambar;
        public TextView mdeskripsi;
        public RecyclerView mrecyclerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mjudul = itemView.findViewById(R.id.judul_makanan);
            mgambar = itemView.findViewById(R.id.gambar_makanan);
            mdeskripsi = itemView.findViewById(R.id.intruksi_makanan);
        }
    }
}
