package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;
import java.util.HashMap;

public class Rinfo extends AppCompatActivity {

    Button nxt;
    String CNIC;
    EditText DOB,last, bGroup,disease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rinfo);
        nxt=findViewById(R.id.button);
        DOB=findViewById(R.id.editTextDate);
        last=findViewById(R.id.editTextDate2);
        bGroup=findViewById(R.id.editTextTextPersonName);
        disease=findViewById(R.id.editTextTextPersonName3);
        Intent a=getIntent();
        CNIC=a.getStringExtra("CNIC");
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("DOB",DOB.getText().toString());
                m.put("Any Disease",disease.getText().toString());
                m.put("Blood Group",bGroup.getText().toString());
                m.put("Last Date",last.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("Receiver").child(CNIC).updateChildren(m);
                Intent i=new Intent(Rinfo.this,PhoneNo.class);
                i.putExtra("domain","Receiver");
                i.putExtra("CNIC",CNIC);
                startActivity(i);
            }
        });
    }
}