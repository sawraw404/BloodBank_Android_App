package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class DonorsList extends AppCompatActivity {
    RecyclerView rc;
    ArrayList<DcontactModel> arrDcontents=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donors_list);
        FloatingActionButton toMap=findViewById(R.id.floatingBtn);
        toMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(DonorsList.this,MapView.class);
                startActivity(i);
            }
        });
        rc= findViewById(R.id.recyclerView);
        rc.setLayoutManager(new LinearLayoutManager(this));

        //recycler view contents
        arrDcontents.add(new DcontactModel("Islamabad","Syeda Sara Afzaal","10/03/2003","A+"));
        arrDcontents.add(new DcontactModel("Attock","Syed Afzal Ahmed Shah","11/11/1972","AB+"));
        arrDcontents.add(new DcontactModel("Lahore","Abdul Hanan","05/11/1998","B+"));
        arrDcontents.add(new DcontactModel("Islamabad","Aima Baigh","10/03/2000","B+"));
        arrDcontents.add(new DcontactModel("Islamabad","Syeda Sara Afzaal","10/03/2003","A+"));
        arrDcontents.add(new DcontactModel("Attock","Syed Afzal Ahmed Shah","11/11/1972","AB+"));
        arrDcontents.add(new DcontactModel("Lahore","Abdul Hanan","05/11/1998","B+"));
        arrDcontents.add(new DcontactModel("Islamabad","Aima Baigh","10/03/2000","B+"));
        arrDcontents.add(new DcontactModel("Islamabad","Syeda Sara Afzaal","10/03/2003","A+"));
        arrDcontents.add(new DcontactModel("Attock","Syed Afzal Ahmed Shah","11/11/1972","AB+"));
        arrDcontents.add(new DcontactModel("Lahore","Abdul Hanan","05/11/1998","B+"));
        arrDcontents.add(new DcontactModel("Islamabad","Aima Baigh","10/03/2000","B+"));

        DrecyclerAdaptar adaptor = new DrecyclerAdaptar(this,arrDcontents);
        rc.setAdapter(adaptor);
    }

}