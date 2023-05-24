package com.cadpur.cadpurnlineseba;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class About extends AppCompatActivity {

    //initaliz variable
    RelativeLayout rate_us;
    LinearLayout email,phone;
    CardView cardView_parent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Find variable
        rate_us=findViewById(R.id.rate_us);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        cardView_parent=findViewById(R.id.cardView_parent);

        //Animation for cardView_parent
        YoYo.with(Techniques.ZoomInUp).duration(1500).repeat(0).playOn(cardView_parent);


        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail=new Intent(Intent.ACTION_VIEW, Uri.parse("shafidbaraktaz@gmail.com"));
                startActivity(mail);

            }
        });


        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phone =new Intent(Intent.ACTION_DIAL,Uri.parse("tel:01531641015"));
                startActivity(phone);
            }
        });







    }





    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



}