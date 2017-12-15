package com.example.dell.layoutwithglidetest1;

import android.util.Log;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by DELL on 11/17/2017.
 */

public class arrayfiller {



    public ArrayList<Integer> filler() {

        ArrayList<Integer> rawimg = new ArrayList<>();
        rawimg.add(R.raw.baggloves);
        rawimg.add(R.raw.bicycle);
        rawimg.add(R.raw.baggloves2);
        rawimg.add(R.raw.blender1);
        rawimg.add(R.raw.cleats2);
        rawimg.add(R.raw.cowboyhat2);
        rawimg.add(R.raw.cowboyhat3);
        rawimg.add(R.raw.eqaulizer2);
        rawimg.add(R.raw.equalizer);
        rawimg.add(R.raw.fridge);
        rawimg.add(R.raw.galaxy2);
        rawimg.add(R.raw.galaxy3);
        rawimg.add(R.raw.guitar);
        rawimg.add(R.raw.guitar2);
        rawimg.add(R.raw.nikon);
        rawimg.add(R.raw.nikon3);
        rawimg.add(R.raw.oven4);
        rawimg.add(R.raw.pc);
        rawimg.add(R.raw.pots);
        rawimg.add(R.raw.xbox2);
        rawimg.add(R.raw.sewingmachine2);
        rawimg.add(R.raw.waterdispenser);
        rawimg.add(R.raw.sewingmachine4);

       return rawimg;
    }


    public ArrayList<single_element> createdata (){

        ArrayList<single_element> prodata = new ArrayList<>();
        ArrayList<Integer> predata = new ArrayList<>();

        predata = filler();
        Integer i = 0;
        int size = predata.size();
        String istring;

        for(i = 0 ;i < size; i++){

            single_element holder = new single_element(predata.get(i));
            prodata.add(holder);
            istring = i.toString();
            Log.d("datain", "createdata: an element created "+istring);

        }

        return prodata;
    }


    ArrayList<single_element> getdata = createdata();

    public ArrayList<single_element> getGetdata() {
        return getdata;
    }
}
