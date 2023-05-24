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

public class Hotel extends AppCompatActivity {

    //initaliz variable
    ListView hotelListView;
    TextView title;
    //initaliz arrayList
    HashMap<String,String>hashMap=new HashMap<>();
    public static ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>hotelList=new ArrayList<>();
    public static ArrayList<HashMap<String,String>>hospitalList=new ArrayList<>();

    public static String TITLE="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        hotelListView=findViewById(R.id.hotelLIstView);
        title=findViewById(R.id.title);




        //Create Hospital List************************************
        createHospitalList("২৫০ শয্যা বিশিষ্ট জেনারেল হাসপাতাল","নড়াইল সদর"," +880 1703-860586");
        createHospitalList("১০০ শয্যা বিশিষ্ট উপজেলা স্বাস্থ্য কমপ্লেক্স","লোহাগড়া ","+88 01819232091");
        createHospitalList("১০০ শয্যা বিশিষ্ট উপজেলা স্বাস্থ্য কমপ্লেক্স","কালিয়া ","+88 01717190364");
        createHospitalList("পুলিশ হাসপাতাল নড়াইল (এমআই সেন্টার)","নড়াইল","+880 1781-351316");
        createHospitalList("মল্লিক ডায়াগনস্টিক সেন্টার","নড়াইল","+880 1716-221488");
        createHospitalList("ডাক্তার স্পেশালাইজড হসপিটাল লি.","লোহাগড়া","01793605462");

        hospitalList=new ArrayList<>();
        //****************************************************


        //Create Hotel List*********************************
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");
        crateHotelList("শীঘ্রই আসছে","শীঘ্রই আসছে","শীঘ্রই আসছে");

        hotelList=new ArrayList<>();
        //**************************************************


        //Create Union List*********************************




        MyAdapter myAdapter=new MyAdapter();
        hotelListView.setAdapter(myAdapter);
        title.setText(TITLE);



    }//onCreate End>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    //Create Hospital List Method**************
    private void createHospitalList(String name,String adress,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("adress",adress);
        hashMap.put("numbar",numbar);
        hospitalList.add(hashMap);
    }


    //Create Hotel List Method**************
    private void crateHotelList(String name,String adress,String numbar){
        hashMap=new HashMap<>();
        hashMap.put("name",name);
        hashMap.put("adress",adress);
        hashMap.put("numbar",numbar);
        hotelList.add(hashMap);
    }


    //Create MyAdapter*****************************

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

            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView=inflater.inflate(R.layout.hospital_list,parent,false);

            ShimmerTextView hotelName=myView.findViewById(R.id.hotelName);
            ShimmerTextView hotelAdrss=myView.findViewById(R.id.hotelAdress);
            ShimmerTextView hotel_numbar=myView.findViewById(R.id.hotel_numbar);
            LottieAnimationView call_lottie=myView.findViewById(R.id.call_lottie);
            CardView cardView=myView.findViewById(R.id.cardView);

            Shimmer shimmer=new Shimmer();
            //shimmer.start(hotelName);
            shimmer.start(hotelAdrss);
            //shimmer.start(hotel_numbar);

            //Animation for CardView
            YoYo.with(Techniques.ZoomInUp).duration(900).repeat(0).playOn(cardView);


            //get String from arrayList
            hashMap=arrayList.get(position);
            String name=hashMap.get("name");
            String adress=hashMap.get("adress");
            String numbar=hashMap.get("numbar");

            hotelName.setText(name);
            hotelAdrss.setText(adress);
            hotel_numbar.setText(numbar);


            call_lottie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent call=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+numbar));
                    startActivity(call);

                }
            });


            return myView;
        }
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



}