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
        hashMap.put("name","শীঘ্রই আসছে");
        hashMap.put("cetegory","(শীঘ্রই আসছে)");
        hashMap.put("channel","শীঘ্রই আসছে");
        hashMap.put("nambar","শীঘ্রই আসছে");
        arrayList.add(hashMap);
        //**********************************************


        //make list*****************************
        hashMap=new HashMap<>();
        hashMap.put("name","শীঘ্রই আসছে");
        hashMap.put("cetegory","(শীঘ্রই আসছে)");
        hashMap.put("channel","শীঘ্রই আসছে");
        hashMap.put("nambar","শীঘ্রই আসছে");
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