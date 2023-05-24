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
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Upozila extends AppCompatActivity {

    TextView pageTitle;

    GridView gridView;
    HashMap<String,String>hashMap=new HashMap<>();
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();

    public static String TITLE="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upozila);

        gridView=findViewById(R.id.gridView);
        pageTitle=findViewById(R.id.pageTitle);


        //Make Item>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        makeItem(R.drawable.blood_donation,"নড়াইল সদর");
        makeItem(R.drawable.blood_donation,"লোহাগড়া");
        makeItem(R.drawable.blood_donation,"কালিয়া");
        makeItem(R.drawable.blood_donation,"লাহুড়িয়া");
        makeItem(R.drawable.blood_donation,"ইতনা");
        makeItem(R.drawable.sinior,"সিনিয়ার সেচ্ছাসেবী");


        MyAdapter myAdapter=new MyAdapter();
        gridView.setAdapter(myAdapter);
        pageTitle.setText(TITLE);


    }


    //Create method for Item>>>>>>>>>>>>>>>>>>>>>>>>>
    private void makeItem(int drawable,String itemTitle){
        hashMap=new HashMap<>();
        hashMap.put("image",String.valueOf(drawable));
        hashMap.put("title",itemTitle);
        arrayList.add(hashMap);
    }

    //Create MyAdapter>>>>>>>>>>>>>>>>>>>>>>>>>>>
    class MyAdapter extends BaseAdapter{

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
            View myView=inflater.inflate(R.layout.grid_item,viewGroup,false);

            ImageView itemImage=myView.findViewById(R.id.itemImage);
            ShimmerTextView itemTitle=myView.findViewById(R.id.itemTitle);
            Shimmer shimmer=new Shimmer();
            CardView serviceItem=myView.findViewById(R.id.serviceItem);

            shimmer.start(itemTitle);
            YoYo.with(Techniques.ZoomInUp).duration(1000).repeat(0).playOn(serviceItem);

            hashMap=arrayList.get(position);
            String simage=hashMap.get("image");
            String title=hashMap.get("title");

            int image=Integer.parseInt(simage);

            itemImage.setImageResource(image);
            itemTitle.setText(""+title);


            serviceItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (itemTitle.getText().toString().contains("নড়াইল সদর")){
                        blood_donnar.arrayList= blood_donnar.sadarList;
                        startActivity(new Intent(Upozila.this, blood_donnar.class));
                        blood_donnar.TITEL="যেকোনো রক্তের প্রয়োজনে ফোন করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("লোহাগড়া")){
                        blood_donnar.arrayList= blood_donnar.muksudpurList;
                        startActivity(new Intent(Upozila.this, blood_donnar.class));
                        blood_donnar.TITEL="যেকোনো রক্তের প্রয়োজনে ফোন করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("কালিয়া")){
                        blood_donnar.arrayList= blood_donnar.kasiyaniList;
                        startActivity(new Intent(Upozila.this, blood_donnar.class));
                        blood_donnar.TITEL="যেকোনো রক্তের প্রয়োজনে ফোন করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("লাহুড়িয়া")){
                        blood_donnar.arrayList= blood_donnar.tungiparaList;
                        startActivity(new Intent(Upozila.this, blood_donnar.class));
                        blood_donnar.TITEL="যেকোনো রক্তের প্রয়োজনে ফোন করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("ইতনা")){
                        blood_donnar.arrayList= blood_donnar.kotaliparaList;
                        startActivity(new Intent(Upozila.this, blood_donnar.class));
                        blood_donnar.TITEL="যেকোনো রক্তের প্রয়োজনে ফোন করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("সিনিয়ার সেচ্ছাসেবী")){
                        blood_donnar.arrayList= blood_donnar.sinour_secchasebi;
                        startActivity(new Intent(Upozila.this, blood_donnar.class));
                        blood_donnar.TITEL="যেকোনো মানবিক কাজের জন্য ফোন করুন।";
                    }

                }
            });



            return myView;
        }
    }




}