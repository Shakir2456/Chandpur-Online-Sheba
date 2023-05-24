package com.cadpur.cadpurnlineseba;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class sangbadik extends AppCompatActivity {

    ListView listView;
    HashMap<String,String>hashMap=new HashMap<>();
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangbadik);

        listView=findViewById(R.id.listView);




        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মো: পিকুল আলম।");
        hashMap.put("cetegory","(উপজেলা প্রতিনিধি।)");
        hashMap.put("channel","দৈনিক সকালের সময়");
        hashMap.put("nambar","+880 1943651222");
        arrayList.add(hashMap);
        //**********************************************


        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মোঃ আজিজুর বিশ্বাস");
        hashMap.put("cetegory","(ক্রাইম রিপোর্টার,ব্যবস্থাপনা সম্পাদক)");
        hashMap.put("channel","জাতীয় দৈনিক গণতদন্ত পত্রিকা,আমিন টেলিভিশন,দৈনিক প্রবাহ পত্রিকা");
        hashMap.put("nambar","+8801920281787");
        arrayList.add(hashMap);
        //**********************************************

        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","শরিফুল ইসলাম বাবলু");
        hashMap.put("cetegory","(সম্পাদক প্রকাশক)");
        hashMap.put("channel","নড়াইল নিউজ ২৪");
        hashMap.put("nambar","+8801303058757");
        arrayList.add(hashMap);
        //**********************************************

        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মোঃ সাজ্জাদ হোসেন");
        hashMap.put("cetegory","(ক্রাইম রিপোর্টার)");
        hashMap.put("channel","সম্পাদক:দৈনিক সত্যের কন্ঠ");
        hashMap.put("nambar","+8801909230219");
        arrayList.add(hashMap);
        //**********************************************

        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মো: সাব্বির জমাদ্দার");
        hashMap.put("cetegory","(স্টাফ রির্পোটার, প্রচার সম্পাদক)");
        hashMap.put("channel","দৈনিক সত্যের কন্ঠ)");
        hashMap.put("nambar","+8801909230219");
        arrayList.add(hashMap);
        //**********************************************


        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মো: শরিফুল মোল্লা");
        hashMap.put("cetegory","(লোহাগড়া উপজেলা প্রতিনিধি)");
        hashMap.put("channel","দৈনিক সত্যের কন্ঠ");
        hashMap.put("nambar","+8801914380849");
        arrayList.add(hashMap);
        //**********************************************


        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","এস.এম জহুরুল হক (মিলু)");
        hashMap.put("cetegory","(লোহাগড়া (নড়াইল) প্রতিনিধি)");
        hashMap.put("channel","আজকের পত্রিকা");
        hashMap.put("nambar","01925441954");
        arrayList.add(hashMap);
        //**********************************************

        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মো: রাসেল মোল্লা");
        hashMap.put("cetegory","(লোহাগড়া উপজেলা প্রতিনিধি)");
        hashMap.put("channel","দৈনিক সত্যের কন্ঠ");
        hashMap.put("nambar","+8801311798742");
        arrayList.add(hashMap);
        //**********************************************

        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","সাদ্দাম হোসেন জনি");
        hashMap.put("cetegory","(লোহাগড়া উপজেলা প্রতিনিধি, নড়াইল জেলা প্রতিনিধি)");
        hashMap.put("channel","রেড টাইমস, দৈনিক সত্যের কন্ঠ");
        hashMap.put("nambar","+8801760109483");
        arrayList.add(hashMap);
        //**********************************************



        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","মান্নু মিয়া");
        hashMap.put("cetegory","(সভাপতি লোহাগড়া শাখা)");
        hashMap.put("channel","বাংলাদেশ স্বাস্থ এন্ড পরিবেশ মানবাধিকার সাংবাদিক সোসাইটি");
        hashMap.put("nambar","+88 01790933490");
        arrayList.add(hashMap);
        //**********************************************





        MyAdapter myAdapter=new MyAdapter();
        listView.setAdapter(myAdapter);



    }//onCreate End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    //Create MyAdapter>>>>>>>>>>>>>>>>>>>>>>>>
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
        public View getView(int position, View view, ViewGroup viewGroup) {

            LayoutInflater inflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView=inflater.inflate(R.layout.sangbadik_list,viewGroup,false);

            TextView name=myView.findViewById(R.id.name);
            TextView category=myView.findViewById(R.id.category);
            TextView channel=myView.findViewById(R.id.channel);
            TextView numbar=myView.findViewById(R.id.nambar);

            hashMap=arrayList.get(position);
            String sname=hashMap.get("name");
            String scategory=hashMap.get("cetegory");
            String schannel=hashMap.get("channel");
            String snambar=hashMap.get("nambar");

            name.setText(sname);
            category.setText(scategory);
            channel.setText(schannel);
            numbar.setText(snambar);


            return myView;
        }
    }



}