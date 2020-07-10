package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView timelineRycycleView;
    ArrayList<String> timeDatas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timelineRycycleView = findViewById(R.id.timelineRecycleView);
        timelineRycycleView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        timeDatas = new ArrayList<>();
        TimeLineAdapter timelineAdapter = new TimeLineAdapter(this,timeDatas);
        timelineRycycleView.setAdapter(timelineAdapter);
    }
}