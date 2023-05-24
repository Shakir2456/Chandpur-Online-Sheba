package com.cadpur.cadpurnlineseba;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;
import java.util.HashMap;

public class Newslist extends AppCompatActivity {

    ListView newsListView;
    HashMap <String,String>hashMap=new HashMap<>();
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newslist);

        newsListView=findViewById(R.id.newsListView);

        //Make NewsList
        createList(R.drawable.chandpurnews);
        createList(R.drawable.doiniksomoyerbani7starpress);
        createList(R.drawable.chandpursomoy);
        createList(R.drawable.chandpurreport);
        createList(R.drawable.prothomalo);
        createList(R.drawable.somokal);
        createList(R.drawable.jagonews24);
        createList(R.drawable.jugantor);
        createList(R.drawable.chandpurtimes);
        //**********************************************


        MyAdapter myAdapter=new MyAdapter();
        newsListView.setAdapter(myAdapter);

    }//onCreate End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //CreateList****************
    private void createList(int drawable){
        hashMap=new HashMap<>();
        hashMap.put("image",String.valueOf(drawable));
        arrayList.add(hashMap);
    }
    //****************************************

    //Create MyAdapter**********************

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView=inflater.inflate(R.layout.news_list,parent,false);

            ImageView newsCover=myView.findViewById(R.id.newsCover);
            CardView newsItem=myView.findViewById(R.id.newsItem);


            hashMap=arrayList.get(position);

            String cImage=hashMap.get("image");
            int image=Integer.parseInt(cImage);
            newsCover.setImageResource(image);

            //Animation for newsItem
            YoYo.with(Techniques.ZoomInUp).duration(900).repeat(0).playOn(newsItem);

            newsItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position==0){
                        Browser.url="https://chandpurnews.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));

                    }
                    else if (position==1){
                        Browser.url="https://www.doiniksomoyerbani7starpress.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));
                    }
                    if (position==2){
                        Browser.url="https://chandpursomoy.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));

                    }
                    if (position==3){
                        Browser.url="https://www.chandpurreport.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));

                    }
                    if (position==4){
                        Browser.url="https://www.prothomalo.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));

                    }
                    else if (position==5){
                        Browser.url="https://samakal.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));
                    }

                    else if (position==6){
                        Browser.url="https://www.jagonews24.com/bangladesh/rajshahi/natore";
                        startActivity(new Intent(Newslist.this,Browser.class));
                    }

                    else if (position==7){
                        Browser.url="https://www.jugantor.com/country-news/rajshahi/natore";
                        startActivity(new Intent(Newslist.this,Browser.class));
                    }
                    else if (position==8){
                        Browser.url="https://en.chandpurtimes.com/";
                        startActivity(new Intent(Newslist.this,Browser.class));
                    }


                }
            });

            return myView;
        }
    }

}