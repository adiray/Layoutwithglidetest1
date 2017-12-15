package com.example.dell.layoutwithglidetest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ArrayList <single_element> thesource = new ArrayList<>();
    arrayfiller myarrayfiller = new arrayfiller();
    Toolbar mytb ;
   // RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2,1);
    // layoutManager.setGapStrategy(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thesource = myarrayfiller.createdata();
        imageView = findViewById(R.id.topimage);
        RecyclerView myrecview = findViewById(R.id.recview);
        myrecview.setHasFixedSize(true);
        mytb = (Toolbar) findViewById(R.id.mytb);
        setSupportActionBar(mytb);






        myrecview.setLayoutManager(new StaggeredGridLayoutManager(2,1));
        RecyclerView.Adapter myadapter = new myadapter(this,thesource);
        myrecview.setAdapter(myadapter);
       Glide.with(this).load(R.raw.galaxy3).apply(RequestOptions.noTransformation()).into(imageView);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_bar_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case (R.id.refresh):
                Toast.makeText(this, "refresh selected", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.profile):
                Toast.makeText(this, "Profile selected", Toast.LENGTH_SHORT).show();
                break;


            case (R.id.account):
                Toast.makeText(this, "Account selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }


}
