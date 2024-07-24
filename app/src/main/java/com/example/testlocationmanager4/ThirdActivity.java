package com.example.testlocationmanager4;

import android.app.Activity;
import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.LocationManager;
import android.os.Bundle;

public class ThirdActivity extends Activity {

  @SuppressWarnings("NewApi")
  public static GnssMeasurementsEvent.Callback CALLBACK = new GnssMeasurementsEvent.Callback() {
    @Override
    public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
      super.onGnssMeasurementsReceived(eventArgs);
    }
  };

  LocationManager locationManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
  }
}