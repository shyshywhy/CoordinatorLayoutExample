package com.mymoney.haiyangtan.coordinatorlayoutexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Class> data = new ArrayList<>();
        data.add(Test1Activity.class);
        data.add(Test2Activity.class);
        MyAdapter adapter = new MyAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}
