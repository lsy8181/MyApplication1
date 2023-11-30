package com.example.myapplication.helper;

import android.content.Context;
import android.widget.Toast;

import com.example.myapplication.Adapter.PupolarAdapter;
import com.example.myapplication.Domain.PopularDomain;

import java.util.ArrayList;

public class ManagmentCart {
    private Context context;
    private TinyDB tinyDB;

    public ManagmentCart(Context context) {
        this.context = context;
    }

    public void insertFood(PopularDomain item){
        ArrayList<PopularDomain> listpop=getListCart();
        boolean existAlready = false;
        int n=0;
        for (int i=0; i<listpop.size(); i++){
            if (listpop.get(i).getTitle().equals(item.getTitle())){
                existAlready = true;
                n=1;
                break;
            }
        }
        if(existAlready){
            listpop.get(n).setNumberInCart(item.getNumberInCart());
        }else {
            listpop.add(item);
        }
        tinyDB.putListObject("CartList",listpop);
        Toast.makeText(context, "카트에 담겼습니다.", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<PopularDomain>getListCart(){
        return tinyDB.getListObject("CartList");
    }
}
