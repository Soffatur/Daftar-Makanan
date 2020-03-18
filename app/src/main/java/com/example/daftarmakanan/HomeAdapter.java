package com.example.daftarmakanan;

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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<HomeItem> listItems;
    private Context context;

    public HomeAdapter(List<HomeItem> listItem, Context context) {
        this.listItems = listItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.dashboard_desain, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final HomeItem homeItem = listItems.get(position);

        String judul = homeItem.getJudul();

        holder.mjudul.setText(judul);
        Picasso.with(context).load(homeItem.getGambar()).into(holder.mgambar);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FoodCategory.class);
                intent.putExtra("judul", homeItem.getJudul());
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mjudul = itemView.findViewById(R.id.judulkategori);
            mgambar = itemView.findViewById(R.id.gambarkategori);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
