package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Dinfo extends AppCompatActivity {

    Button nxt;
    EditText bGroup,disease,meds,DOB;
    String CNIC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinfo);
        nxt=findViewById(R.id.button);
        bGroup=findViewById(R.id.editTextTextPersonName);
        DOB=findViewById(R.id.editTextDate);
        disease=findViewById(R.id.editTextTextPersonName3);
        meds=findViewById(R.id.editTextTextPersonName4);
        Intent a=getIntent();
        CNIC=a.getStringExtra("CNIC");
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("DOB",DOB.getText().toString());
                m.put("Any Disease",disease.getText().toString());
                m.put("Blood Group",bGroup.getText().toString());
                m.put("Medicine",meds.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("Donor").child(CNIC).updateChildren(m);
                Intent i=new Intent(Dinfo.this,PhoneNo.class);
                i.putExtra("domain","Donor");
                i.putExtra("CNIC",CNIC);
                startActivity(i);
            }
        });
    }
}