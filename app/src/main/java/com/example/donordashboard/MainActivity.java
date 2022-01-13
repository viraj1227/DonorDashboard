package com.example.donordashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView card_home;
    CardView card_location;
    CardView card_profile;
    CardView card_about;
    CardView card_status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card_home = findViewById(R.id.donor_card_home);
        card_location = findViewById(R.id.donor_card_location);
        card_profile = findViewById(R.id.donor_card_profile);
        card_about = findViewById(R.id.donor_card_about);
        card_status=findViewById(R.id.donor_card_Status);

        card_home.setOnClickListener(this);
        card_location.setOnClickListener(this);
        card_profile.setOnClickListener(this);
        card_about.setOnClickListener(this);
        card_status.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.donor_card_home:
                i = new Intent(this,Home.class);
                startActivity(i);
                break;
            case R.id.donor_card_location:
                i = new Intent(this,Donor_Location.class);
                startActivity(i);
                break;
            case R.id.donor_card_profile:
                i = new Intent(this,Donor_Profile.class);
                startActivity(i);
                break;
            case R.id.donor_card_Status:
                i = new Intent(this,Donor_StatusFeed.class);
                startActivity(i);
                break;
            case R.id.donor_card_about:
                i = new Intent(this,Donor_About_us.class);
                startActivity(i);
                break;
        }
    }
}