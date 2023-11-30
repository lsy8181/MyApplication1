package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.PupolarAdapter;
import com.example.myapplication.Domain.PopularDomain;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPupolar;

    private RecyclerView recyclerViewPupolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        initRecyclerView2();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("티셔츠","최고급 신규 소재를 이용한 모시깽이","pic1",15,4.0,500));
        items.add(new PopularDomain("시계","최고급 신규 소재를 이용한 모시깽이","pic2",20,5.0,200));
        items.add(new PopularDomain("3","최고급 신규 소재를 이용한 모시깽이","pic3",2,2.5,150));
        items.add(new PopularDomain("4","최고급 신규 소재를 이용한 모시깽이","pic4",34,4.0,2000));

        recyclerViewPupolar=findViewById(R.id.view1);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar=new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }
    private void initRecyclerView2() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("티셔츠","최고급 신규 소재를 이용한 모시깽이","pic1",15,4.0,500));
        items.add(new PopularDomain("시계","최고급 신규 소재를 이용한 모시깽이","pic2",20,5.0,200));
        items.add(new PopularDomain("3","최고급 신규 소재를 이용한 모시깽이","pic3",2,2.5,150));
        items.add(new PopularDomain("4","최고급 신규 소재를 이용한 모시깽이","pic4",34,4.0,2000));

        recyclerViewPupolar=findViewById(R.id.view2);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar=new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }
}