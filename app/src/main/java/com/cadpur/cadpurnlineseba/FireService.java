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
        create_fireList("উপ-সহকারী পরিচালক","০১৭১৮-৭৮৩৫৫৯");
        create_fireList("সিনিয়র স্টেশন অফিসার","০১৭২০-১৭১৬৬৫");
        create_fireList("স্টেশন অফিসার","০১৬৭৪-৮৭৮৩৪৩");
        create_fireList("স্টেশন অফিসার","০১৭২৫১৬৬৬৮৫");
        create_fireList("ফায়ার স্টেশন","999");
        fireseviceList=new ArrayList<>();
        //********************************************************


        //create_pulishList****************************
        create_pulishList("জেলা প্রশাসক ও জেলা ম্যাজিস্ট্রেট","০১৭৩০০৬৭০৫০");
        create_pulishList("পুলিশ সুপার","০১৩২০-১১৫৯০০");
        create_pulishList("অতিরিক্ত পুলিশ সুপার (প্রশাসন ও অর্থ)","০১৩২০-১১৫৯০২");
        create_pulishList("হাইমচর থানার ডিউটি অফিসার","০১৩২০-১১৬১৫৮");
        create_pulishList("কচুয়া অফিসার্স ইনচার্জ","০১৩২০১১৬১০১");
        create_pulishList("শাহরাস্তি অফিসার ইনচার্জ","০১৩২০-১১৬০৭৫");
        pulishList=new ArrayList<>();
        //*********************************************************



        //create_pulishList****************************
        create_polliBidyutList("জেনারেল ম্যানেজার","০১৭৬৯৪০০০১৬");
        create_polliBidyutList("ডিজিএম (কচুয়া জোনাল অফিস)","০১৭৬৯৪০০০৯৭");
        create_polliBidyutList("ডিজিএম (কারিগরী)","০১৭৭৭৭৮৪৪৫৪");
        create_polliBidyutList("ডিজিএম (শাহরাস্তি জোনাল অফিস)","০১৭৬৯৪০০০৯৯");
        create_polliBidyutList("এজিএম (প্রশাসন), সদর দপ্তর","০১৭৬৯৪০০৩৩০");
        create_polliBidyutList("এজিএম(ওএন্ডএম), সাচার সাব-জোনাল অফিস","০১৭৬৯৪০৭৬০৬");
        create_polliBidyutList("জেনারেল ম্যানেজার","০৮৪১-৬৫১১১");
        create_polliBidyutList("ডেপুটি জেনারেল ম্যানেজার- ফরিদগঞ্জ জোনাল অফিস","০১৭৬৯৪০০০৯৫");
        create_polliBidyutList("ডেপুটি জেনারেল ম্যানেজার, মতলব উত্তর জোনাল অফিস","০১৭৬৯৪০০১০০");
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

        createAmbulenceList("শীঘ্রই আসছে","শীঘ্রই আসছে");
        createAmbulenceList("শীঘ্রই আসছে","শীঘ্রই আসছে");
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