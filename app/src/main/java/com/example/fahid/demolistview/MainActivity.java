package com.example.fahid.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model>modelList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modelList=new ArrayList<>();
        listView= (ListView) findViewById(R.id.listview);
        modelList.add(new Model("Shakib Khan","Dhaka",R.drawable.br2) );
        modelList.add(new Model("Josim","Khulna",R.drawable.br3));
        modelList.add(new Model("deb","kolkata",R.drawable.br4));
        modelList.add(new Model("Bean","india",R.drawable.br5));
        modelList.add(new Model("poka","india",R.drawable.br6));
        modelList.add(new Model("opu","india",R.drawable.br7));
        modelList.add(new Model("mahi","india",R.drawable.br8));
        modelList.add(new Model("pori","india",R.drawable.br9));
        modelList.add(new Model("isita","india",R.drawable.br10));
        Myadapter adapter=new Myadapter(this,R.layout.list_item,modelList);
        listView.setAdapter(adapter);

    }
}
