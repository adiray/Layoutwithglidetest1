package com.example.dell.layoutwithglidetest1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Created by DELL on 11/17/2017.
 */

public class myadapter extends RecyclerView.Adapter<myvh> {

    Context context;
    ArrayList<single_element> datasource = new ArrayList<>();


    @Override
    public myvh onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_recycler_element,parent,false);
        return new myvh(v);
    }

    @Override
    public void onBindViewHolder(myvh holder, int position) {

        holder.myvhimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,Main2Activity.class);
                context.startActivity(intent);

            }
        });

        Glide.with(context).load(datasource.get(position).getImg()).apply(RequestOptions.noTransformation()).into(holder.myvhimg);
        //.override(200,200).centerCrop()
       // Glide.with(context).load(datasource.get(position).getImg()).apply(RequestOptions.fitCenterTransform()).into(holder.myvhimg);

    }

    public myadapter(Context context, ArrayList<single_element> datasource) {
        this.context = context;
        this.datasource = datasource;
    }

    @Override
    public int getItemCount() {
        return datasource.size();
    }
}
