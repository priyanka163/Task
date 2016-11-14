package com.example.bridgelabz.task;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.bridgelabz.task.adapter.PageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TabLayout mTablayout;
    ViewPager mViewPager;
    List<String> title;
    String [] ref ={"Hike", "Gmail","FaceBook","whatsApp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mTablayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager =(ViewPager)findViewById(R.id.view_pager);

//setSupportActionBar(mToolbar);

        title=new ArrayList<>();
        for (int i = 0; i <ref.length ; i++) {


           title.add(ref[i]);

        }
        PageAdapter adapter=new PageAdapter(getSupportFragmentManager(),title);
        mViewPager.setAdapter(adapter);
        mTablayout.setupWithViewPager(mViewPager);

    }
}
