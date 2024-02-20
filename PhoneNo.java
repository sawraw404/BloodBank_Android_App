package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class PhoneNo extends AppCompatActivity {
    Button send;
    EditText phone;
    String CNIC,tableName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_no);
        send=findViewById(R.id.button);
        phone=findViewById(R.id.editTextPhone);
        Intent a=getIntent();
        CNIC=a.getStringExtra("CNIC");
        tableName=a.getStringExtra("domain");
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneNo.this,Verify.class);
                HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("Phone no.",phone.getText().toString());
                FirebaseDatabase.getInstance().getReference().child(tableName).child(CNIC).updateChildren(m);
                startActivity(i);
            }
        });
    }
}