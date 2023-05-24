package com.cadpur.cadpurnlineseba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.cadpur.cadpurnlineseba.R;

import java.util.ArrayList;
import java.util.HashMap;

public class E_Seba extends AppCompatActivity {
    ListView listView;
    HashMap<String,String>hashMap=new HashMap<>();
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eseba);

        listView=findViewById(R.id.listView);


        //Create E-service List********************************
        creatList(R.drawable.education_cover,"সকল বোর্ড রেজাল্ট");
        creatList(R.drawable.passport_cover,"সকল ধরনের পাসপোর্ট সেবা");
        creatList(R.drawable.nidbd_cover,"NID / ভোটার আইডি কার্ড সকল সেবা");
        creatList(R.drawable.jonmo_abedon,"নতুন জন্মনিবন্ধন এর জন্য আবেদন");
        creatList(R.drawable.jonmo_abedon,"জন্মনিবন্ধন তথ্য অনুসন্ধান করুন");
        creatList(R.drawable.jonmo_abedon,"জন্ম তথ্য সংশোধনের জন্য আবেদন");
        creatList(R.drawable.vat_left_logo,"সকল ধরনের ভ্যাট সেবা");
        creatList(R.drawable.mygov,"এক ঠিকানায় সকল সরকারি সেবা");
        creatList(R.drawable.daraz_cover,"Daraz Online Sopping");
        //*****************************************************************






        MyAdapter myAdapter=new MyAdapter();
        listView.setAdapter(myAdapter);


    }
    //onCreate End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //***Create List Method***********
    private void creatList(int drawable,String list_title){
        hashMap=new HashMap<>();
        hashMap.put("title",list_title);
        hashMap.put("title_cover",String.valueOf(drawable));
        arrayList.add(hashMap);
    }



    //************************************



    //*****Create MyAdapter**********************
    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
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
            LayoutInflater inflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView=inflater.inflate(R.layout.e_service_item,viewGroup,false);

            TextView list_title=myView.findViewById(R.id.list_title);
            ImageView itemCover=myView.findViewById(R.id.itemCover);
            CardView listItem=myView.findViewById(R.id.listItem);

            hashMap=arrayList.get(i);
            String itemTitle=hashMap.get("title");
            String sCover=hashMap.get("title_cover");
            int coverItem=Integer.parseInt(sCover);

            itemCover.setImageResource(coverItem);
            list_title.setText(itemTitle);

            //Animation for ListItem
            YoYo.with(Techniques.ZoomInUp).duration(900).repeat(0).playOn(listItem);


            listItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (list_title.getText().toString().contains("Daraz Online")){
                        Browser.url="https://www.daraz.com.bd/";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("সকল বোর্ড রেজাল্ট")){
                        Browser.url="https://eboardresults.com/v2/home";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("সকল ধরনের পাসপোর্ট সেবা")){
                        Browser.url="https://www.epassport.gov.bd/landing";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("নতুন জন্মনিবন্ধন এর জন্য আবেদন")){
                        Browser.url="https://bdris.gov.bd/br/application";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("জন্মনিবন্ধন তথ্য অনুসন্ধান করুন")){
                        Browser.url="https://everify.bdris.gov.bd/UDRNVerification";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("জন্ম তথ্য সংশোধনের জন্য আবেদন")){
                        Browser.url="https://bdris.gov.bd/br/correction";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("NID / ভোটার আইডি কার্ড সকল সেবা")){
                        Browser.url="https://services.nidw.gov.bd/nid-pub/register-account/";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("সকল ধরনের ভ্যাট সেবা")){
                        Browser.url="https://vat.gov.bd/sap/bc/ui5_ui5/sap/zmcf_pri/index.html#/Welcome";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }
                    else if (list_title.getText().toString().contains("NID / ভোটার আইডি কার্ড সকল সেবা")){
                        Browser.url="https://www.mygov.bd/";
                        startActivity(new Intent(E_Seba.this,Browser.class));
                    }





                }
            });


            return myView;
        }
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


}