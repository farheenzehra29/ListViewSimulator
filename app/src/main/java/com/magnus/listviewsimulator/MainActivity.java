package com.magnus.listviewsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    int [] images={R.drawable.brazil_flag,R.drawable.canada_flag,
            R.drawable.germany_flag,R.drawable.india_flag,R.drawable.usa_flag};
    String[] names={"Brazil","Canada","Germany","India","USA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ListView listView=findViewById(R.id.listView);
       CustomAdapter customAdapter=new CustomAdapter();
       listView.setAdapter(customAdapter);



    }



    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.listview_layout,null);

            ImageView imageView=view.findViewById(R.id.flagImage);
            TextView  flagName=view.findViewById(R.id.flagName);
            imageView.setImageResource(images[i]);
            flagName.setText(names[i]);
            return view;
        }
    }



}
