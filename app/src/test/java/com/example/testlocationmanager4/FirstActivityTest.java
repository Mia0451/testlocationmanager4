package com.example.testlocationmanager4;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

import android.location.GnssMeasurementsEvent;
import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
public class FirstActivityTest {

  @Test
  public void startup() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel()); // output is "21"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "21"
    FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);

    assertNotNull(activity.locationManager); // test passed here.


    GnssMeasurementsEvent.Callback a = new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }

      @Override
      public void onStatusChanged(int status) {
        super.onStatusChanged(status);
      }
    };
    System.out.println("here GnssMeasurementsEvent.Callback ClassLoader = " + a.getClass().getClassLoader().getClass().getName());
  }

  @Config(sdk = {22})
  @Test
  public void startup_config22() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel()); // output is "22"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "22"
    FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);

    assertNotNull(activity.locationManager);  // test passed here.

    GnssMeasurementsEvent.Callback a = new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }

      @Override
      public void onStatusChanged(int status) {
        super.onStatusChanged(status);
      }
    };
    System.out.println("here GnssMeasurementsEvent.Callback ClassLoader = " + a.getClass().getClassLoader().getClass().getName());
  }

  @Config(sdk = {23})
  @Test
  public void startup_config23() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel());  // output is "23"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "23"
    FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);

    assertNotNull(activity.locationManager);  // test passed here.

    GnssMeasurementsEvent.Callback a = new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }

      @Override
      public void onStatusChanged(int status) {
        super.onStatusChanged(status);
      }
    };
    System.out.println("here GnssMeasurementsEvent.Callback ClassLoader = " + a.getClass().getClassLoader().getClass().getName());
  }

  @Config(sdk = {24})
  @Test
  public void startup_config24() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel());  // output is "23"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "24"
    FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);

    assertNotNull(activity.locationManager); // test passed here.

    GnssMeasurementsEvent.Callback a = new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }

      @Override
      public void onStatusChanged(int status) {
        super.onStatusChanged(status);
      }
    };
    System.out.println("here GnssMeasurementsEvent.Callback ClassLoader = " + a.getClass().getClassLoader().getClass().getName());
  }

  @Config(sdk = {26})
  @Test
  public void startup_config26() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel());  // output is "26"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "26"
    FirstActivity activity = Robolectric.setupActivity(FirstActivity.class);

    assertNotNull(activity.locationManager); // test passed here.

    GnssMeasurementsEvent.Callback a = new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }

      @Override
      public void onStatusChanged(int status) {
        super.onStatusChanged(status);
      }
    };
    System.out.println("here GnssMeasurementsEvent.Callback ClassLoader = " + a.getClass().getClassLoader().getClass().getName());
  }
}