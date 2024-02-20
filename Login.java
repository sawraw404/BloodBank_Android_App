package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



import java.util.Objects;

public class Login extends AppCompatActivity {

    TextView signup;
    Button login;
    EditText username,password;
    //String emailPattern="[a=zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    //ProgressDialog pd;
    //FirebaseAuth
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup=findViewById(R.id.textView11);
        login=findViewById(R.id.button);
        username=findViewById(R.id.editTextTextPersonName);
        password=findViewById(R.id.editTextTextPassword);
        //pd=new ProgressDialog(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,DonorReciver.class);
                startActivity(i);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PerforAuth();
                String name=username.getText().toString();
                String pass=password.getText().toString();
                if(name.isEmpty()&&pass.isEmpty() ) {
                    Toast.makeText(Login.this, "Enter Username & Passwords", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(Login.this, MapView.class);
                    startActivity(i);
                }

            }


        });

}
    /*private void PerforAuth() {
        String email=username.getText().toString();
        String pass=password.getText().toString();

        if(email.matches(emailPattern)){
            username.setError("Enter correct username!");
        }
        else if(pass.isEmpty()){
            password.setError("Input Proper Password!");
        }
        else{
            pd.setMessage("Wait while Registeration");
            pd.setTitle("Registeration");
            pd.setCanceledOnTouchOutside(false);
            pd.show();


        }
    }*/

}