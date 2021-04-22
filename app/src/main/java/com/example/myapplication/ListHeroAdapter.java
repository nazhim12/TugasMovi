package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//import recyclerAdapter.RecyclerViewClickListener;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ViewHolder> {

    private List<Hero> heros;
    private RecyclerViewClickListener listener;

    public ListHeroAdapter(List<Hero> heros, RecyclerViewClickListener listener) {
        this.heros = heros;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_hero, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hero hero = heros.get(position);
        holder.ivPhoto.setImageResource(hero.getPhoto());
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());

    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);

    }
    @Override
    public int getItemCount() {
        return heros.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView ivPhoto;
        TextView tvName, tvDetail;
        Button Bdetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.iv_hero);
            tvName = itemView.findViewById(R.id.tv_hero_name);
            tvDetail = itemView.findViewById(R.id.tv_hero_detail);
            Bdetail = itemView.findViewById(R.id.btn_detail);
            Bdetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v,getAdapterPosition());

        }
    }
}
