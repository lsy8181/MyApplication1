package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Domain.PopularDomain;
import com.example.myapplication.R;
import com.example.myapplication.helper.ManagmentCart;

public class DetailActivity extends AppCompatActivity {

    private Button addToCartBtn;
    private TextView titleTxt, feeTxt, descriptionTxt,reviewTxt,scoreTxt;
    private ImageView picItem,backBtn;
    private PopularDomain objecet;
    private int numberOrder=1;
    private ManagmentCart managmentCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        initView();
        getBundle();
    }

    private void getBundle() {
        objecet=(PopularDomain) getIntent().getSerializableExtra("object");
        int drawableResourceId=this.getResources().getIdentifier(objecet.getPicUrl(),"drawable",this.getPackageName());

        //Glide.with(this)
    }

    private void initView(){
    addToCartBtn=findViewById(R.id.addToCartBtn);
    feeTxt=findViewById(R.id.priceTxt);
    titleTxt=findViewById(R.id.titleTxt);
    descriptionTxt=findViewById(R.id.discriptionTxt);
    picItem=findViewById(R.id.itemPic);
    reviewTxt=findViewById(R.id.reviewTxt);
    scoreTxt=findViewById(R.id.scoreTxt);
    backBtn=findViewById(R.id.backBtn);
    }
}