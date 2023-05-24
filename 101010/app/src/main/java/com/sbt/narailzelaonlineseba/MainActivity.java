package com.cadpur.cadpurnlineseba;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.airbnb.lottie.LottieAnimationView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    private static final String ONESIGNAL_APP_ID = "" +
            "";

    public RewardedAd mRewardedAd;
    public final String TAG = "MainActivity";


    
    //Initialize Veriable
    ImageSlider imageSlider;
    LottieAnimationView lottieCall;
    GridView gridView;




    //Array for GridView
    HashMap<String,String>hashMap=new HashMap<>();
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();

    //ArrayList for image slider
    ArrayList<SlideModel> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


///////////////////////////////////rewoded ads suru

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917",
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.

                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Toast.makeText(MainActivity.this, "নড়াইল জেলা অনলাইন সেবা অ্যাপ্লিকেশনে স্বাগতম", Toast.LENGTH_SHORT).show();

                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.

                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.

                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.

                                mRewardedAd = null;
                            }
                        });
                    }

                });
        ///////////////////////////////////rewoded ads sesh





        //Start onCreate**********************************************
        //*************************************************************
        //**************************************************************

        //Find variable
        imageSlider=findViewById(R.id.image_slider);
        gridView=findViewById(R.id.gridView);
        lottieCall=findViewById(R.id.lottieCall);



        //create image slider***************
        imageList.add(new SlideModel(R.drawable.seba,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder1,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder2,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder3,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder4,ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(imageList);
        //**************************************************

       

        //Make Gride Item**********************************
        makeItem(R.drawable.zelartortho,"জেলার তথ্য");
        makeItem(R.drawable.live_tv,"লাইভ টিভি");
        makeItem(R.drawable.news,"খবর");
        makeItem(R.drawable.blood_donation,"ব্লাড ডোনার");
        makeItem(R.drawable.hospital,"হাসপাতাল");
        makeItem(R.drawable.firetruck,"ফায়ার সার্ভিস");
        makeItem(R.drawable.ambulance,"এ্যাম্বুলেন্স");
        makeItem(R.drawable.help_desk,"হেল্প লাইন");
        makeItem(R.drawable.police,"থানা পুলিশ");
        makeItem(R.drawable.doctor,"ডাক্তার");
        makeItem(R.drawable.online,"ই-সেবা");
        makeItem(R.drawable.aingibi,"আইনজীবী");
        makeItem(R.drawable.bus_station,"বাস টিকেট");
        makeItem(R.drawable.rail,"রেল সেবা");
        makeItem(R.drawable.reporter,"সাংবাদিক");
        makeItem(R.drawable.biddut,"পল্লি বিদ্যুৎ");
        makeItem(R.drawable.restaurant,"রেস্টুরেন্ট");
        makeItem(R.drawable.hotel1,"হোটেল");
        makeItem(R.drawable.dorsonio_istan,"দর্শনীয় স্থান");
        makeItem(R.drawable.taining_enter,"প্রশিক্ষণ কেন্দ্র");
        makeItem(R.drawable.pdf,"পিডিএফ বই");
        makeItem(R.drawable.online_seba,"উপজেলা পরিসধ সেবা");
        makeItem(R.drawable.online_seba,"ইউনিয়ন পরিসধ");
        makeItem(R.drawable.developer,"About Us");

        //***************************************************************



        MyAdapter myAdapter=new MyAdapter();
        gridView.setAdapter(myAdapter);

        //LottieCall for Top Lay
        lottieCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:999"));
                startActivity(call);
            }
        });



    }
    //End onCreate**********************************************
    //*************************************************************
    //**************************************************************





    //Create Method for Grid Item
    private void makeItem(int drawable,String itemTitle){
        hashMap=new HashMap<>();
        hashMap.put("image",String.valueOf(drawable));
        hashMap.put("title",itemTitle);
        arrayList.add(hashMap);
    }
    //*********************************************



//**********MyAdapter Start here**********************************
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


                    if (itemTitle.getText().toString().contains("ই-সেবা")){

                        startActivity(new Intent(MainActivity.this,E_Seba.class));
                    }
                    else if (itemTitle.getText().toString().contains("ব্লাড ডোনার")){
                        startActivity(new Intent(MainActivity.this, Upozila.class));
                        Upozila.TITLE="আপনার ঠিকানা সিলেক্ট করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("রেস্টুরেন্ট")){
                        Browser.url="https://www.foodpanda.com.bd/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("বাস টিকেট")){
                        Browser.url="https://www.shohoz.com/bus-tickets";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("রেল সেবা")){
                        Browser.url="https://eticket.railway.gov.bd/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("ডাক্তার")){
                        Browser.url="https://www.helpmecovid.com/bd/khulna/narail/hospital/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("দর্শনীয় স্থান")){
                        Browser.url="https://bangla.tourtoday.com.bd/category/tourist-spots-in-khulna/narail-tour/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("খবর")){
                        startActivity(new Intent(MainActivity.this,Newslist.class));
                    }
                    else if (itemTitle.getText().toString().contains("প্রশিক্ষণ কেন্দ্র")){
                        Browser.url="https://zerotoheroinstitute.com/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("ফায়ার সার্ভিস")){
                        FireService.arrayList=FireService.fireseviceList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="নড়াইল জেলা ফায়ার সার্ভিস";
                    }
                    else if (itemTitle.getText().toString().contains("থানা পুলিশ")){
                        FireService.arrayList=FireService.pulishList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="নড়াইল জেলা পুলিশ";
                    }
                    else if (itemTitle.getText().toString().contains("এ্যাম্বুলেন্স")){
                        FireService.arrayList=FireService.ambulenceList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="নড়াইল জেলা এ্যাম্বুলেন্স সার্ভিস";
                    }
                    else if (itemTitle.getText().toString().contains("পল্লি বিদ্যুৎ")){
                        FireService.arrayList=FireService.polliBidyutList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="নড়াইল জেলা পল্লিবিদ্যুৎ";
                    }
                    else if (itemTitle.getText().toString().contains("হেল্প লাইন")){
                        FireService.arrayList=FireService.helpLineList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="বিনামূল্যে জরুরী সেবা পেতে ফোন করুন";
                    }
                    else if (itemTitle.getText().toString().contains("হাসপাতাল")){
                        Hotel.arrayList=Hotel.hospitalList;
                        startActivity(new Intent(MainActivity.this,Hotel.class));
                        Hotel.TITLE="নড়াইল জেলা সরকারি বেসরকারি হাসপাতাল সমূহ";
                    }
                    else if (itemTitle.getText().toString().contains("হোটেল")){
                        Hotel.arrayList=Hotel.hotelList;
                        startActivity(new Intent(MainActivity.this,Hotel.class));
                        Hotel.TITLE="নড়াইল জেলা সদর হোটেল ও আবাসন";
                    }
                    else if (itemTitle.getText().toString().contains("আইনজীবী")){
                        blood_donnar.TITEL="প্যানেল আইনজীবীদের নড়াইল জেলা তালিকা";
                        blood_donnar.arrayList= blood_donnar.lowearList;
                        startActivity(new Intent(MainActivity.this, blood_donnar.class));
                    }
                    else if (itemTitle.getText().toString().contains("সাংবাদিক")){
                        startActivity(new Intent(MainActivity.this,sangbadik.class));
                    }
                    else if (itemTitle.getText().toString().contains("About Us")){
                        startActivity(new Intent(MainActivity.this,About.class));
                    }
                    else if (itemTitle.getText().toString().contains("জেলার তথ্য")){
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("লাইভ টিভি")){
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("পিডিএফ বই")){
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("উপজেলা পরিসধ সেবা")){
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("ইউনিয়ন পরিসধ")){
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }











                }
            });



            return myView;
        }
    }
    //***************End of MyAdapter************************************



//********onBackPressed Start here******************************************
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {

        // When landing in home screen

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {

                Toast.makeText(getBaseContext(), "Press again to exit",
                        Toast.LENGTH_SHORT).show();
            }

            mBackPressed = System.currentTimeMillis();




    } // end of onBackpressed method

    //#############################################################################################


   



}
