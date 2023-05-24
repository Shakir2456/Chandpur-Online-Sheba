package com.cadpur.cadpurnlineseba;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.airbnb.lottie.LottieAnimationView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.ArrayList;
import java.util.HashMap;

public class blood_donnar extends AppCompatActivity {

    //Initializ Variable
    TextView pageTitle;
    ListView bloodDonnarListView;

    //Initializ Array
    HashMap<String,String>hashMap=new HashMap<>();
    public static ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>lowearList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>sinour_secchasebi=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>sadarList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>muksudpurList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>kasiyaniList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>tungiparaList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>kotaliparaList=new ArrayList<>();



    public static String TITEL="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donnar);

        //Find variable
        bloodDonnarListView=findViewById(R.id.bloodDonnarListView);
        pageTitle=findViewById(R.id.pageTitle);

        pageTitle.setText(TITEL);




        //Creat Lowayer List***************************************************
        createLowyer_list("আবু হেনা মোসত্মফা কামাল","(দেওয়ানী)","01716236583");
        createLowyer_list("শীঘ্রই আসছে","(দেওয়ানী)","শীঘ্রই আসছে");

        lowearList=new ArrayList<>();
        //******************************************************************************



        //Create Narail Sador_list *************************************
        createSadar_list("শীঘ্রই আসছে","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");

        sadarList=new ArrayList<>();
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create Lohagara_list*******************************************
        createMuksudpur_list("শহিদুল ইসলাম আতিক)","(স্বেচ্ছাসেবী)","01636222849");
        createMuksudpur_list("আজিজুর রহমান মুছা)","(স্বেচ্ছাসেবী)","01301090408");
        createMuksudpur_list("রবিউল ইসলাম)","(স্বেচ্ছাসেবী)","01985768948");
        createMuksudpur_list("ইমামুল ইসলাম)","(স্বেচ্ছাসেবী)","01940556752");
        createMuksudpur_list("শহিদুল ইসলাম)","(স্বেচ্ছাসেবী)","01636222849");
        createMuksudpur_list("রবিউল ইসলাম)","(স্বেচ্ছাসেবী)","01985768948");
        createMuksudpur_list("ইমামুল ইসলাম)","(স্বেচ্ছাসেবী)","01940556752");
        createMuksudpur_list("হুসাইন আহমেদ রাজ)","(স্বেচ্ছাসেবী)","01941464745");
        createMuksudpur_list("এনামুল গাজী)","(স্বেচ্ছাসেবী)","01980860399");
        createMuksudpur_list("মুস্তাফিজুর রহমান রাব্বি)","(স্বেচ্ছাসেবী)","01402906862");
        createMuksudpur_list("পলাশ বিশ্বাস)","(স্বেচ্ছাসেবী)","01924081490");
        createMuksudpur_list("নাঈম ইসলাম)","(স্বেচ্ছাসেবী)","01910382586");
        createMuksudpur_list("ইমামুল ইসলাম)","(স্বেচ্ছাসেবী)","01940556752");
        createMuksudpur_list("তিত্ত ঘোষ)","(স্বেচ্ছাসেবী)","01323450150");
        createMuksudpur_list("প্রান্ত ঘোষ)","(স্বেচ্ছাসেবী)","01761393037");
        createMuksudpur_list("আব্দুল কাদের মন্ডল)","(স্বেচ্ছাসেবী)","01953171392");



        muksudpurList=new ArrayList<>();

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create kaliya_list*****************************************************
        createKasiyani_list(" সাব্বির)","(স্বেচ্ছাসেবী)","01798-632310");
        createKasiyani_list("আব্দুল্লাহ)","(স্বেচ্ছাসেবী)","01968-686000");
        createKasiyani_list(" রব্বানি)","(স্বেচ্ছাসেবী)","01998-623602");
        createKasiyani_list("লাবিদ)","(স্বেচ্ছাসেবী)","01601-300701");
        createKasiyani_list("রিদয়)","(স্বেচ্ছাসেবী)","+880 1925-317450");
        createKasiyani_list("কাব্য)","(স্বেচ্ছাসেবী)","+880 1917-414795");

        kasiyaniList=new ArrayList<>();
        //>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create Lahuriya_list*********************************************
        createTungipara_list("মোঃ ফারুক শেখ)","(স্বেচ্ছাসেবী)","+8801939129453");
        createTungipara_list("মোঃ নয়ন)","(স্বেচ্ছাসেবী)","+8801962453545");
        createTungipara_list("মোঃ বাহারুল)","(স্বেচ্ছাসেবী)","+8801312714178");
        createTungipara_list("মোঃ সাব্বির)","(স্বেচ্ছাসেবী)","+8801991580311");
        createTungipara_list("মোঃ নাছির)","(স্বেচ্ছাসেবী)","+880144234849");
        tungiparaList=new ArrayList<>();
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create Etna_list****************************************
        createKotalipara_list("আজগর সিকদার(এডমিন)","(স্বেচ্ছাসেবী)","01910344573");
        createKotalipara_list("সাহারিয়া সৌরভ","(স্বেচ্ছাসেবী)","01811857940");
        createKotalipara_list("মোঃ আরিফ শরীফ","(স্বেচ্ছাসেবী)","01710396187");
        createKotalipara_list("দীন ইসলাম","(স্বেচ্ছাসেবী)","01303858265");
        createKotalipara_list("রানা আহমেদ","(স্বেচ্ছাসেবী)","01910222002");
        createKotalipara_list("মোঃ নুর আলম শেখ  ","(স্বেচ্ছাসেবী)","01944522302");
        createKotalipara_list("সুজন","(স্বেচ্ছাসেবী)","01988678107");
        createKotalipara_list("রাব্বু","(স্বেচ্ছাসেবী)","01778012502");
        createKotalipara_list("সিজান শরীফ","(স্বেচ্ছাসেবী)","01918858701");
        createKotalipara_list("রাব্বি ভুঁইয়া","(স্বেচ্ছাসেবী)","01964472419");
        createKotalipara_list("রিয়াজুল ইসলাম","(স্বেচ্ছাসেবী)","01988981512");


        //Create Sinour_secchasebi_list***********************************
        createSenior_secchasebiList("মোঃ শফিদ বারাক তাজ","(স্বেচ্ছাসেবী)","01994846415");
        createSenior_secchasebiList("মোঃ ফারুক শেখ","(স্বেচ্ছাসেবী)","+8801939129453");
        createSenior_secchasebiList("সর্না","(স্বেচ্ছাসেবী)","+880 1648-916544 ");
        createSenior_secchasebiList("আজগর সিকদার","(স্বেচ্ছাসেবী)","01910344573");
        createMuksudpur_list("শহিদুল ইসলাম আতিক)","(স্বেচ্ছাসেবী)","01636222849");
        createMuksudpur_list("আজিজুর রহমান মুছা)","(স্বেচ্ছাসেবী)","01301090408");
        sinour_secchasebi=new ArrayList<>();
        //*********************************************************





        MyAdapter myAdapter=new MyAdapter();
        bloodDonnarListView.setAdapter(myAdapter);




    }
    //onCreate End Here>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //Create Lowyer_list Method**********************************
    private void createLowyer_list(String itemName,String tvAdress,String contactNumbar){
        hashMap=new HashMap<>();
        hashMap.put("name",itemName);
        hashMap.put("catagory",tvAdress);
        hashMap.put("numbar",contactNumbar);
        lowearList.add(hashMap);
    }



    //Create Narail SadarList Method****************************
    private void createSadar_list(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        sadarList.add(hashMap);
    }


    //Create Muksudpur_list Method****************************
    private void createMuksudpur_list(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        muksudpurList.add(hashMap);
    }


    //Create Kasiyani_list Method****************************
    private void createKasiyani_list(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        kasiyaniList.add(hashMap);
    }

    //Create Tungipara_list Method****************************
    private void createTungipara_list(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        tungiparaList.add(hashMap);
    }

    //Create Digoliya_list Method****************************
    private void createDigoliya_list(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        tungiparaList.add(hashMap);
    }

    //Create Kotalipara_list Method****************************
    private void createKotalipara_list(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        kotaliparaList.add(hashMap);
    }


    //Create sinour_list Method****************************
    private void createSenior_secchasebiList(String name,String catagory,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("catagory",catagory);
        hashMap.put("numbar",numbar);
        sinour_secchasebi.add(hashMap);
    }





    //Create MyAdapter*******************************
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
            View myView=inflater.inflate(R.layout.blood_donnar_list,parent,false);

            LottieAnimationView call_lottie =myView.findViewById(R.id.call_lottie);
            ShimmerTextView itemName=myView.findViewById(R.id.itemName);
            ShimmerTextView tvAdress=myView.findViewById(R.id.tvAdress);
            ShimmerTextView contactNumbar=myView.findViewById(R.id.contactNumbar);
            ShimmerTextView message=myView.findViewById(R.id.message);
            CardView careView=myView.findViewById(R.id.careView);

            //shimmer effect
            Shimmer shimmer=new Shimmer();
            //shimmer.start(itemName);
            //shimmer.start(tvAdress);
            //shimmer.start(contactNumbar);
            shimmer.start(message);
            //>>>>>>>>>>>>>>>>>>>>>>>>>>

            //Get String from arrayList
            hashMap=arrayList.get(position);
            String sItemName=hashMap.get("name");
            String sTvAdress=hashMap.get("catagory");
            String sContactNumbar=hashMap.get("numbar");

            itemName.setText(sItemName);
            tvAdress.setText(sTvAdress);
            contactNumbar.setText(sContactNumbar);

            //Animation for CardView
            YoYo.with(Techniques.ZoomInUp).duration(900).repeat(0).playOn(careView);

            call_lottie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent call=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+sContactNumbar));
                    startActivity(call);
                }
            });

            message.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent sms =new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:"+contactNumbar.getText().toString()));
                    startActivity(sms);
                }
            });


            return myView;
        }
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


}