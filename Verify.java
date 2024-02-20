package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Verify extends AppCompatActivity {

    Button nxt;
    EditText verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        verify=findViewById(R.id.editTextVerify);
        nxt=findViewById(R.id.button);
        //int num= Integer.parseInt(verify.getText().toString());
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(num==1122){
                    Toast.makeText(Verify.this, "OTP Code Verified!", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Verify.this,MapView.class);
                    startActivity(i);
               // }
                //else{
               //     Toast.makeText(Verify.this, "Enter Correct Verification Code!", Toast.LENGTH_SHORT).show();
               // }
            }
        });

    }
}