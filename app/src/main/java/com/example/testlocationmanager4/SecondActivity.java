package com.example.testlocationmanager4;

import android.app.Activity;
import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;

public class SecondActivity extends Activity {

  LocationManager locationManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
  }

  @SuppressWarnings("NewApi")
  public void registerGns(GnssMeasurementsEvent.Callback callback) {
    // Do nothing.
  }
}