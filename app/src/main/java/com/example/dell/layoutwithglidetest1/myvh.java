package com.example.dell.layoutwithglidetest1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by DELL on 11/17/2017.
 */

public class myvh extends RecyclerView.ViewHolder {

    ImageView myvhimg;

    public myvh(View itemView) {
        super(itemView);
        myvhimg = itemView.findViewById(R.id.singleimg);
    }
}
