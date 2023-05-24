package com.cadpur.cadpurnlineseba;

import android.app.Activity;
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
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;
import com.cadpur.cadpurnlineseba.Activity.VideoPlayer;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    private static final String ONESIGNAL_APP_ID = "" +
            "";



    
    //Initialize Veriable
    ImageSlider imageSlider;
    LottieAnimationView lottieCall;
    GridView gridView;
    boolean isLoading;
    private boolean clickedESheba=false;
    private boolean bloodDonorClicked=false;
    private boolean resTurentClicked=false;
    private boolean busTiketClicked=false;
    private boolean realSebaClicked=false;
    private boolean dockTorClicked=false;
    private boolean dorsonioIstanClicked=false;
    private boolean khoborClicked=false;
    private boolean prosikhonClicked=false;
    private boolean fireSarviceClicked=false;
    private boolean thanaPolishClicked=false;
    private boolean ambuLenceClicked=false;
    private boolean polliBidutClicked=false;
    private boolean helpLineClicked=false;
    private boolean hasPatalClicked=false;
    private boolean hoTelClicked=false;
    private boolean ainJibiClicked=false;
    private boolean sangBadikClicked=false;
    private boolean aboUtClicked=false;
    private boolean zelarTorthoClicked=false;
    private boolean liveTVClicked=false;
    private boolean pdfBookClicked=false;
    private boolean upozelaPorisodClicked=false;
    private boolean unionPorisodClicked=false;
    private boolean bimanClicked=false;
    private boolean isButtonClicked=false;




    //Array for GridView
    HashMap<String,String>hashMap=new HashMap<>();
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();

    //ArrayList for image slider
    ArrayList<SlideModel> imageList = new ArrayList<>();
    private RewardedAd rewardedAd;

    // AdMob Rewarded Video Ad Id
    private String AdId = "ca-app-pub-4534665054941565/4425033078";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        loadRewardedAd();







        //Start onCreate**********************************************
        //*************************************************************
        //**************************************************************

        //Find variable
        imageSlider=findViewById(R.id.image_slider);
        gridView=findViewById(R.id.gridView);
        lottieCall=findViewById(R.id.lottieCall);



        //create image slider***************
        imageList.add(new SlideModel(R.drawable.chadpur,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder01,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder02,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder03,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.silder04,ScaleTypes.CENTER_CROP));
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
        makeItem(R.drawable.biman,"বিমান সেবা");
        makeItem(R.drawable.reporter,"সাংবাদিক");
        makeItem(R.drawable.biddut,"পল্লি বিদ্যুৎ");
        makeItem(R.drawable.restaurant,"রেস্টুরেন্ট");
        makeItem(R.drawable.hotel1,"হোটেল");
        makeItem(R.drawable.dorsonio_istan,"দর্শনীয় স্থান");
        makeItem(R.drawable.taining_enter,"প্রশিক্ষণ কেন্দ্র");
        makeItem(R.drawable.pdf,"পিডিএফ বই");
        makeItem(R.drawable.online_seba,"উপজেলা পরিষদ সেবা");
        makeItem(R.drawable.online_seba,"ইউনিয়ন পরিষদ");
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
    private void loadRewardedAd() {
        if (rewardedAd == null) {
            AdRequest adRequest = new AdRequest.Builder().build();
            RewardedAd.load(this, getString(R.string.ad_unit_id), adRequest, new RewardedAdLoadCallback() {
                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                            // Handle the error.
                            rewardedAd = null;
                        }

                        @Override
                        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                            MainActivity.this.rewardedAd = rewardedAd;
                        }
                    });
        }
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
                        if (rewardedAd!=null&&!clickedESheba){
                            showVideoAds(clickedESheba);
                        }
                        startActivity(new Intent(MainActivity.this,E_Seba.class));
                    }
                    else if (itemTitle.getText().toString().contains("ব্লাড ডোনার")){
                        if (rewardedAd!=null&&!bloodDonorClicked){
                            showVideoAds(bloodDonorClicked);
                        }
                        startActivity(new Intent(MainActivity.this, Upozila.class));
                        Upozila.TITLE="আপনার ঠিকানা সিলেক্ট করুন।";
                    }
                    else if (itemTitle.getText().toString().contains("রেস্টুরেন্ট")){
                        if (rewardedAd!=null&&!resTurentClicked){
                            showVideoAds(resTurentClicked);
                        }
                        Browser.url="https://www.foodpanda.com.bd/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("বাস টিকেট")){
                        if (rewardedAd!=null&&!busTiketClicked){
                            showVideoAds(busTiketClicked);
                        }
                        Browser.url="https://www.shohoz.com/bus-tickets";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("রেল সেবা")){
                        if (rewardedAd!=null&&!realSebaClicked){
                            showVideoAds(realSebaClicked);
                        }
                        Browser.url="https://eticket.railway.gov.bd/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("ডাক্তার")){
                        if (rewardedAd!=null&&!dockTorClicked){
                            showVideoAds(dockTorClicked);
                        }
                        Browser.url="https://prethibi.com/2021/01/07/doctor-list-in-chandpur/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("দর্শনীয় স্থান")){
                        if (rewardedAd!=null&&!dorsonioIstanClicked){
                            showVideoAds(dorsonioIstanClicked);
                        }
                        Browser.url="https://bangla.tourtoday.com.bd/category/tourist-spots-in-chittagong/chandpur-tour/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("খবর")){
                        if (rewardedAd!=null&&!khoborClicked){
                            showVideoAds(khoborClicked);
                        }
                        startActivity(new Intent(MainActivity.this,Newslist.class));
                    }
                    else if (itemTitle.getText().toString().contains("প্রশিক্ষণ কেন্দ্র")){
                        if (rewardedAd!=null&&!prosikhonClicked){
                            showVideoAds(prosikhonClicked);
                        }
                        Browser.url="https://zerotoheroinstitute.com/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("ফায়ার সার্ভিস")){
                        if (rewardedAd!=null&&!fireSarviceClicked){
                            showVideoAds(fireSarviceClicked);
                        }
                        FireService.arrayList=FireService.fireseviceList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="চাঁদপুর জেলা ফায়ার সার্ভিস";
                    }
                    else if (itemTitle.getText().toString().contains("থানা পুলিশ")){
                        if (rewardedAd!=null&&!thanaPolishClicked){
                            showVideoAds(thanaPolishClicked);
                        }
                        FireService.arrayList=FireService.pulishList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="চাঁদপুর জেলা পুলিশ";
                    }
                    else if (itemTitle.getText().toString().contains("এ্যাম্বুলেন্স")){
                        if (rewardedAd!=null&&!ambuLenceClicked){
                            showVideoAds(ambuLenceClicked);
                        }
                        Browser.url="https://dactarachen.com/en/ambulance";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("পল্লি বিদ্যুৎ")){
                        if (rewardedAd!=null&&!polliBidutClicked){
                            showVideoAds(polliBidutClicked);
                        }
                        FireService.arrayList=FireService.polliBidyutList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="চাঁদপুর জেলা পল্লিবিদ্যুৎ";
                    }
                    else if (itemTitle.getText().toString().contains("হেল্প লাইন")){
                        if (rewardedAd!=null&&!helpLineClicked){
                            showVideoAds(helpLineClicked);
                        }
                        FireService.arrayList=FireService.helpLineList;
                        startActivity(new Intent(MainActivity.this,FireService.class));
                        FireService.TITLE="বিনামূল্যে জরুরী সেবা পেতে ফোন করুন";
                    }
                    else if (itemTitle.getText().toString().contains("হাসপাতাল")){
                        if (rewardedAd!=null&&!hasPatalClicked){
                            showVideoAds(hasPatalClicked);
                        }
                        Browser.url="https://findoutadoctor.blogspot.com/2018/07/chandpur-hospital-list-phone-location.html";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("হোটেল")){
                        if (rewardedAd!=null&&!hoTelClicked){
                            showVideoAds(hoTelClicked);
                        }
                        Browser.url="https://www.tripadvisor.com/Hotels-g1202565-Chandpur_Chittagong_Division-Hotels.html";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                    else if (itemTitle.getText().toString().contains("আইনজীবী")){
                        if (rewardedAd!=null&&!ainJibiClicked){
                            showVideoAds(ainJibiClicked);
                        }
                        blood_donnar.TITEL="প্যানেল আইনজীবীদের চাঁদপুর জেলা তালিকা";
                        blood_donnar.arrayList= blood_donnar.lowearList;
                        startActivity(new Intent(MainActivity.this, blood_donnar.class));
                    }
                    else if (itemTitle.getText().toString().contains("সাংবাদিক")){
                        if (rewardedAd!=null&&!sangBadikClicked){
                            showVideoAds(sangBadikClicked);
                        }
                        startActivity(new Intent(MainActivity.this,sangbadik.class));
                    }
                    else if (itemTitle.getText().toString().contains("About Us")){
                        if (rewardedAd!=null&&!aboUtClicked){
                            showVideoAds(aboUtClicked);
                        }
                        startActivity(new Intent(MainActivity.this,About.class));
                    }
                    else if (itemTitle.getText().toString().contains("জেলার তথ্য")){
                        if (rewardedAd!=null&&!zelarTorthoClicked){
                            showVideoAds(zelarTorthoClicked);
                        }
                        Intent intent=new Intent(MainActivity.this, VideoPlayer.class);
                        intent.putExtra("comingFrom","DistrictNews");
                        startActivity(intent);                    }
                    else if (itemTitle.getText().toString().contains("লাইভ টিভি")){
                        if (rewardedAd!=null&&!liveTVClicked){
                            showVideoAds(liveTVClicked);
                        }
                        Intent intent=new Intent(MainActivity.this, VideoPlayer.class);
                        intent.putExtra("comingFrom","LiveTV");
                        startActivity(intent);
                    }
                    else if (itemTitle.getText().toString().contains("পিডিএফ বই")){
                        if (rewardedAd!=null&&!pdfBookClicked){
                            showVideoAds(pdfBookClicked);
                        }
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("উপজেলা পরিষদ সেবা")){
                        if (rewardedAd!=null&&!upozelaPorisodClicked){
                            showVideoAds(upozelaPorisodClicked);
                        }
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("ইউনিয়ন পরিষদ")){
                        if (rewardedAd!=null&&!unionPorisodClicked){
                            showVideoAds(unionPorisodClicked);
                        }
                        startActivity(new Intent(MainActivity.this,New_come.class));
                    }
                    else if (itemTitle.getText().toString().contains("বিমান সেবা")){
                        if (rewardedAd!=null&&!bimanClicked){
                            showVideoAds(bimanClicked);
                        }
                        Browser.url="https://www.biman-airlines.com/";
                        startActivity(new Intent(MainActivity.this,Browser.class));
                    }
                }
            });



            return myView;
        }
    }

    private void showVideoAds(boolean isButtonClicked) {
        rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdShowedFullScreenContent() {
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        rewardedAd = null;
                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {
                        rewardedAd = null;
                        MainActivity.this.loadRewardedAd();
                    }
                });
        Activity activityContext = MainActivity.this;
        rewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                    @Override
                    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                        MainActivity.this.isButtonClicked=true;
                    }
                });
        if (this.isButtonClicked){
            isButtonClicked=this.isButtonClicked;
            this.isButtonClicked=false;
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
