package com.example.myup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private List<Bean> upData = new ArrayList<>();

    ViewPager2 viewPager2;

    private LinearLayout linearLayout;
    private ImageView imageView , imageCurrent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        for (int i = 0; i < 10; i++) {
            Bean bean = new Bean();
            bean.setName("up" + (i+1));
            upData.add(bean);
            //bean.setHead();
        }

//        ListView listView=findViewById(R.id.lv);
//        listView.setAdapter(new MyAdapter(upData,this));
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.e("leo", "onItemClick: "+position );
//
//            }
//        });


        RecyclerView recyclerView = findViewById(R.id.rv);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 10);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyRecycleAdapter myRecycleAdapter = new MyRecycleAdapter(upData, this);


           myRecycleAdapter.setRecycleItemClickListener(new MyRecycleAdapter.OnRecycleItemClickListener() {
            @Override
            //点击viewpager的监听

            public void onRecycleItemClickListener(int position) {
                Log.e("leo", "onRecycleItemClickListener: " + position);
                Bundle bundle=new Bundle();
                bundle.putInt("position",position);
                BlankFragment blankFragment=new BlankFragment();
                blankFragment.setArguments(bundle);
                changeTab(position);
            }
        });
        recyclerView.setAdapter(myRecycleAdapter);


        initPager();
        //initTabView();
    }

    private void initTabView() {
        linearLayout=findViewById(R.id.llayout);
        linearLayout.setOnClickListener(this);
        imageView=findViewById(R.id.iv);

        imageView.setSelected(true);
    }

    private void initPager() {
        viewPager2 = findViewById(R.id.viewpager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(BlankFragment.newInstance("动态简介", ""));
        fragments.add(BlankFragment.newInstance("动态简介", ""));
        fragments.add(BlankFragment.newInstance("动态简介", ""));
        fragments.add(BlankFragment.newInstance("动态简介", ""));
        fragments.add(BlankFragment.newInstance("动态简介", ""));
        fragments.add(BlankFragment.newInstance("动态简介", ""));
        fragments.add(BlankFragment.newInstance("动态简介", ""));

        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),
                getLifecycle(), fragments);
        viewPager2.setAdapter(myFragmentPagerAdapter);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
//滑动监听
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                changeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    private void changeTab(int position) {
        imageCurrent.setSelected(false);
        switch (position) {

        }
        }

        @Override
        public void onClick (View v){

        }
}