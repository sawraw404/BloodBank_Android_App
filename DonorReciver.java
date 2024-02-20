package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonorReciver extends AppCompatActivity {

    Button donor,receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_reciver);
        donor=findViewById(R.id.button2);
        receiver=findViewById(R.id.button3);
        donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DonorReciver.this,SignUp.class);
                i.putExtra("domain","Donor");
                startActivity(i);
            }
        });
        receiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DonorReciver.this,SignUp.class);
                i.putExtra("domain","Receiver");
                startActivity(i);
            }
        });
    }
}