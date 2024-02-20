package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUp extends AppCompatActivity {

    Button signup;
    EditText name,CNIC,fName,city;
    String tableName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.editTextTextPersonName);
        CNIC=findViewById(R.id.editTextTextPersonName2);
        fName=findViewById(R.id.editTextTextPersonName3);
        city=findViewById(R.id.editTextTextPersonName4);
        signup=findViewById(R.id.button);
        Intent a=getIntent();
        tableName=a.getStringExtra("domain");

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String, Object> m = new HashMap<String, Object>();
                m.put("Name",name.getText().toString());
                m.put("Father's Name",fName.getText().toString());
                m.put("CNIC",CNIC.getText().toString());
                m.put("City",city.getText().toString());
                FirebaseDatabase.getInstance().getReference().child(tableName).child(CNIC.getText().toString()).setValue(m);

                if(tableName=="Donor") {
                    Intent i = new Intent(SignUp.this, Dinfo.class);
                    i.putExtra("CNIC",CNIC.getText().toString());
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(SignUp.this,Rinfo.class);
                    i.putExtra("CNIC",CNIC.getText().toString());
                    startActivity(i);
                }

            }
        });
    }
}