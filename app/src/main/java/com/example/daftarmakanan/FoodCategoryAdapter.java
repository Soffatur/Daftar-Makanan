package com.example.daftarmakanan;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodCategoryAdapter extends RecyclerView.Adapter<FoodCategoryAdapter.ViewHolder> {

    private List<FoodCategoryItem> listItems;
    private Context context;

    public FoodCategoryAdapter(List<FoodCategoryItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_category_desain, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final FoodCategoryItem foodItem = listItems.get(position);

        String judul = foodItem.getJudul();

        holder.mjudul.setText(judul);
        Picasso.with(context).load(foodItem.getGambar()).into(holder.mgambar);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FoodDetails.class);
                intent.putExtra("detail", foodItem.getId());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mjudul;
        public ImageView mgambar;
        public LinearLayout linearLayout;

        public ViewHolder(View v) {
            super(v);
            mjudul = v.findViewById(R.id.kategori_judul_makanan);
            mgambar = v.findViewById(R.id.kategori_gambar_makanan);
            linearLayout = v.findViewById(R.id.linearLayout_kategori);
        }
    }
}
