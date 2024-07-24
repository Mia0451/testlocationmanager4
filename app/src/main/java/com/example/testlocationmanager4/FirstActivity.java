package com.example.testlocationmanager4;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;

public class FirstActivity extends Activity {

  LocationManager locationManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
  }
}