package com.cadpur.cadpurnlineseba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

import com.airbnb.lottie.LottieAnimationView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.cadpur.cadpurnlineseba.R;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.ArrayList;
import java.util.HashMap;

public class FireService extends AppCompatActivity {

    //initaliz variable
    TextView pageTitle;
    ListView fireListView;
    //Array
    HashMap<String,String>hashMap=new HashMap<>();
    public static ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>fireseviceList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>pulishList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>polliBidyutList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>helpLineList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>ambulenceList=new ArrayList<>();


    public static String TITLE=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_service);

        //Find variable
        fireListView=findViewById(R.id.fireListView);
        pageTitle=findViewById(R.id.pageTitle);

        pageTitle.setText(""+TITLE);


        //create_fireserviceList**********************
        create_fireList("উপ-সহকারী পরিচালক নড়াইল","01740567363");
        create_fireList("স্টেশন অফিসার নড়াইল","01912283990");
        create_fireList("স্টেশন অফিসার লোহাগড়া", "01749373860");
        create_fireList("স্টেশন অফিসার কালিয়া","01720944805");
        create_fireList("ফায়ার স্টেশন","999");
        fireseviceList=new ArrayList<>();
        //********************************************************


        //create_pulishList****************************
        create_pulishList("জেলা প্রশাসক ও জেলা ম্যাজিস্ট্রেট নড়াইল ","01715082947");
        create_pulishList("ডিউটি অফিসার র্র্যাব ","01914325021");
        create_pulishList("ক্রাইম প্রিভেশন কোম্পানী-৩ ","0421-67799");
        create_pulishList("পুলিশ সুপার নড়াইল ","01320146100");
        create_pulishList("অতিরিক্ত পুলিশ সুপার,নড়াইল ","01320146102");
        create_pulishList("এডিশনাল এসপি নড়াইল","01320146144");
        create_pulishList("ওসি নড়াইল সদর থানা","01713374206");
        create_pulishList("অফিসার ইনচার্জ লোহাগড়া থানা","01713374208");
        create_pulishList("অফিসার ইনচার্জ কালিয়া  থানা","01320146195");
        pulishList=new ArrayList<>();
        //*********************************************************



        //create_pulishList****************************
        create_polliBidyutList("নড়াইল সদর অভিযোগ কেন্দ্ৰ,নড়াইল","01796401299");
        create_polliBidyutList("লক্ষীপাশা অভিযোগ কেন্দ্র","01796401300");
        create_polliBidyutList("কালিয়া অভিযোগ কেন্দ্র","01796401301");
        create_polliBidyutList("চাচুড়ী অভিযোগ কেন্দ্র","01796401302");
        create_polliBidyutList("গোবরা অভিযোগ কেন্দ্র","01796401303");
        create_polliBidyutList("বড়দিয়া এরিয়া অফিস","01796401304");
        create_polliBidyutList("মানিকগঞ্জ অভিযোগ কেন্দ্র","01796401305");
        create_polliBidyutList("পাজারখালী অভিযোগ কেন্দ্র","01796401306");
        polliBidyutList=new ArrayList<>();
        //*********************************************************


        //create_HelpLineList****************************
        creatHelpLine("জাতীয় জরুরী সেবা","999");
        creatHelpLine("জরুরী হট লাইন","16575");
        creatHelpLine("নারী ও শিশু নির্যাতন প্রতিরোধ","109");
        creatHelpLine("শিশুর সহয়তায় ফোন","1098");
        creatHelpLine("জাতীয় তথ্য ও সেবা","333");
        creatHelpLine("সরকারি আইনি সেবা","16430");
        creatHelpLine("সরকারি আইনি সেবা","16430");
        creatHelpLine("দুদক","106");
        creatHelpLine("দুর্যোগের আগাম বার্তা","1090");
        creatHelpLine("ভুমি সেবা","16122");
        helpLineList=new ArrayList<>();
        //*********************************************************


        //create_HelpLineList****************************

        createAmbulenceList("হাজী এ্যাম্বুলেন্স সার্ভিস","01716236584");
        createAmbulenceList("আনিস এ্যাম্বুলেন্স সার্ভিস","01799739898");
        createAmbulenceList("খায়রুল এ্যাম্বুলেন্স সার্ভিস","01914275952");
        createAmbulenceList("মুন্সি এ্যাম্বুলেন্স সার্ভিস","01717770852");
        createAmbulenceList("সিকদার এ্যাম্বুলেন্স সার্ভিস","01713260042");
        createAmbulenceList("২৪ ঘণ্টা এ্যাম্বুলেন্স সার্ভিস","01911125156");
        createAmbulenceList("নড়াইল পপুলার এ্যাম্বুলেন্স সার্ভিস","01926011168 ");
        createAmbulenceList("অনলাইন এ্যাম্বুলেন্স সার্ভিস","01627669222");
        ambulenceList=new ArrayList<>();
        //*********************************************************



        MyAdapter myAdapter=new MyAdapter();
        fireListView.setAdapter(myAdapter);


    }//onCreate End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    //Create FireList Method*******************
    private void create_fireList(String stetation_name,String stetation_numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",stetation_name);
        hashMap.put("numbar",stetation_numbar);
        fireseviceList.add(hashMap);
    }


    //Create PulishList Method*******************
    private void create_pulishList(String stetation_name,String stetation_numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",stetation_name);
        hashMap.put("numbar",stetation_numbar);
        pulishList.add(hashMap);
    }


    //Create PolliBidyut Method*******************
    private void create_polliBidyutList(String stetation_name,String stetation_numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",stetation_name);
        hashMap.put("numbar",stetation_numbar);
        polliBidyutList.add(hashMap);
    }


    //Create HelpLine Method*******************
    private void creatHelpLine(String stetation_name,String stetation_numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",stetation_name);
        hashMap.put("numbar",stetation_numbar);
        helpLineList.add(hashMap);
    }


    //Create Ambulence Method*******************
    private void createAmbulenceList(String stetation_name,String stetation_numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",stetation_name);
        hashMap.put("numbar",stetation_numbar);
        ambulenceList.add(hashMap);
    }




    //Creat MyAdapter******************************
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
            View myView=inflater.inflate(R.layout.fireservice_list,viewGroup,false);

            ShimmerTextView stName=myView.findViewById(R.id.stetationName);
            ShimmerTextView stNumbar=myView.findViewById(R.id.stetationNumbar);
            LottieAnimationView call_lottie=myView.findViewById(R.id.call_lottie);
            CardView cardView=myView.findViewById(R.id.cardView);

            Shimmer shimmer=new Shimmer();
            //shimmer.start(stName);
            //shimmer.start(stNumbar);

            //Animation for CardView
            YoYo.with(Techniques.ZoomInUp).duration(900).repeat(0).playOn(cardView);


            //get String from ArrayList
            hashMap=arrayList.get(position);
            String sName=hashMap.get("name");
            String sNumbar=hashMap.get("numbar");

            stName.setText(""+sName);
            stNumbar.setText(""+sNumbar);

            call_lottie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent call=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+sNumbar));
                    startActivity(call);

                }
            });



            return myView;
        }
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



}