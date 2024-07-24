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

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

@RunWith(RobolectricTestRunner.class)
public class FourthActivityTest {

  @Config(sdk = {21})
  @Test
  public void startup() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel()); // output is "21"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "21"
    FourthActivity activity = Robolectric.setupActivity(FourthActivity.class);

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

    activity.registerGns(new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }
    });

    System.out.println("here LocationManager = " + gatherAllDeclaredMethods(activity.locationManager.getClass()));
    System.out.println("here ShadowLocationManager = " + gatherAllDeclaredMethods(shadowOf(activity.locationManager).getClass()));
  }

  @Config(sdk = {26})
  @Test
  public void startup_config26() {
    System.out.println("here packageName = " + RuntimeEnvironment.application.getPackageName());
    System.out.println("here apiLevel = " + RuntimeEnvironment.getApiLevel()); // output is "21"
    System.out.println("here Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT);  // output is "21"
    FourthActivity activity = Robolectric.setupActivity(FourthActivity.class);

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

    activity.registerGns(new GnssMeasurementsEvent.Callback() {
      @Override
      public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
        super.onGnssMeasurementsReceived(eventArgs);
      }
    });

    System.out.println("here LocationManager = " + gatherAllDeclaredMethods(activity.locationManager.getClass()));
    System.out.println("here ShadowLocationManager = " + gatherAllDeclaredMethods(shadowOf(activity.locationManager).getClass()));
  }


  private String gatherAllDeclaredMethods(Class<?> clazz) {
    StringBuilder sb = new StringBuilder(clazz.getName()).append("\n");
    for (Method method : clazz.getDeclaredMethods()) {
      sb.append("\t").append(method.getName()).append("(").append(Arrays.stream(method.getParameterTypes()).map(new Function<Class<?>, String>() {
        @Override
        public String apply(Class<?> aClass) {
          return aClass.getName();
        }
      }).collect(Collectors.joining(", "))).append("\n");
    }
    return sb.toString();
  }
}