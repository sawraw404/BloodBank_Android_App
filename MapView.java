package com.example.bloodbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MapView extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);
        FloatingActionButton toList=findViewById(R.id.floatingBtn);
        toList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MapView.this,DonorsList.class);
                startActivity(i);
            }
        });

        SupportMapFragment mapFragment= (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        myMap=googleMap;
        LatLng d1= new LatLng(33.6844, 73.0479);
        myMap.addMarker(new MarkerOptions().position(d1).title("A+"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(d1));

        LatLng d2= new LatLng(24.8607, 67.0011);
        myMap.addMarker(new MarkerOptions().position(d2).title("B+"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(d2));

        LatLng d3= new LatLng(31.5204, 74.3587);
        myMap.addMarker(new MarkerOptions().position(d3).title("B+"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(d3));

        LatLng d4= new LatLng(33.5651, 73.0169);
        myMap.addMarker(new MarkerOptions().position(d4).title("AB+"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(d4));

        LatLng d5= new LatLng(30.1575, 71.5249);
        myMap.addMarker(new MarkerOptions().position(d5).title("A+"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(d5));

        LatLng d6= new LatLng(33.7660, 72.3609);
        myMap.addMarker(new MarkerOptions().position(d6).title("AB+"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(d6));
    }
}