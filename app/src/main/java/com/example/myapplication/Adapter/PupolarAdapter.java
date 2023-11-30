package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.myapplication.Domain.PopularDomain;
import com.example.myapplication.R;

import java.util.ArrayList;

public class PupolarAdapter extends RecyclerView.Adapter<PupolarAdapter.viewholder> {
    ArrayList<PopularDomain> items;
    Context context;

    public PupolarAdapter(ArrayList<PopularDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public PupolarAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_pup_list,parent,false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PupolarAdapter.viewholder holder, int position) {
    holder.titleTxt.setText(items.get(position).getTitle());
    holder.feeTxt.setText(items.get(position).getPrice()+"원");
    holder.scoreTxt.setText(""+items.get(position).getScore());

    int drawableResourceId=holder.itemView.getResources().getIdentifier(items.get(position).getPicUrl(),
            "drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30,30,0,0))
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        TextView titleTxt,feeTxt,scoreTxt;
        ImageView pic;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt= itemView.findViewById(R.id.titleTxt);
            feeTxt = itemView.findViewById(R.id.feeTxt);
            scoreTxt= itemView.findViewById(R.id.scoreTxt);
            pic= itemView.findViewById(R.id.pic);
        }
    }
}
