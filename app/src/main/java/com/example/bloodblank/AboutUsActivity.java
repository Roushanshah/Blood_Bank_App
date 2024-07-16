package com.example.bloodblank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    View developerRoushanCard;
    //View developerAyushCard;
    //View developerAryanCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().hide();

        developerRoushanCard = findViewById(R.id.developerRoushanCard);
        //developerAyushCard = findViewById(R.id.developerAyushCard);
        //developerAryanCard = findViewById(R.id.developerAryanCard);

        ((TextView) developerRoushanCard.findViewById(R.id.developerNameTextView)).setText("Roushan Kumar");
        ((TextView) developerRoushanCard.findViewById(R.id.developerEmailTextView)).setText("raushanpco@gmail.com");
        ((TextView) developerRoushanCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 8935965004");
        ((TextView) developerRoushanCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("2102246");

//        ((TextView) developerAyushCard.findViewById(R.id.developerNameTextView)).setText("Deepak Kasyap");
//        ((TextView) developerAyushCard.findViewById(R.id.developerEmailTextView)).setText("Excellencehead@gmail.com");
//        ((TextView) developerAyushCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9317788822");
//        ((TextView) developerAyushCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("2020UCB6010");
//
//        ((TextView) developerAryanCard.findViewById(R.id.developerNameTextView)).setText("Anjaly Sharma");
//        ((TextView) developerAryanCard.findViewById(R.id.developerEmailTextView)).setText("anjaly.excellence@gmail.com");
//        ((TextView) developerAryanCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9356255522");
//        ((TextView) developerAryanCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("2020UCB6053");
    }
}