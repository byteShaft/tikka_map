package com.byteshaft.testmap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng markerPosition = new LatLng(30.173820, 71.456260);
        mMap.addMarker(new MarkerOptions().position(markerPosition).title("Marker at Dalla admi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(30.173820, 71.456260), 16.0f));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(markerPosition));
    }
}
