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
        createLowyer_list("এডভোকেট এইচ এম হেলাল উদ্দিন","মজিদ ভিলা (২য় তলা)","01712771190");
        createLowyer_list("এডভোকেট মাসুদ প্রধানীয়া","সৌদিয়া সিটি(২য় তলা)","01726740652");

        lowearList=new ArrayList<>();
        //******************************************************************************



        //Create Narail Sador_list *************************************
        createSadar_list("শীঘ্রই আসছে","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");

        sadarList=new ArrayList<>();
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create Lohagara_list*******************************************
        createMuksudpur_list("শীঘ্রই আসছে)","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");
        createMuksudpur_list("শীঘ্রই আসছে)","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");





        muksudpurList=new ArrayList<>();

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create kaliya_list*****************************************************
        createKasiyani_list(" শীঘ্রই আসছে)","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");
        createKasiyani_list(" শীঘ্রই আসছে)","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");


        kasiyaniList=new ArrayList<>();
        //>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create Lahuriya_list*********************************************
        createTungipara_list("শীঘ্রই আসছে)","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");
        createTungipara_list("শীঘ্রই আসছে)","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");

        tungiparaList=new ArrayList<>();
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //Create Etna_list****************************************
        createKotalipara_list("শীঘ্রই আসছে","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");
        createKotalipara_list("শীঘ্রই আসছে","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");



        //Create Sinour_secchasebi_list***********************************
        createSenior_secchasebiList("শীঘ্রই আসছে","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");
        createSenior_secchasebiList("শীঘ্রই আসছে","(স্বেচ্ছাসেবী)","শীঘ্রই আসছে");

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