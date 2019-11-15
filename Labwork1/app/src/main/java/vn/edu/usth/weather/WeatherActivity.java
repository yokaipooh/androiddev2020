package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           HEAD
        Log.i("My_Tag", "This is on start");

        fragment forecastFragment = new fragment();
        getSupportFragmentManager().beginTransaction().add(R.id.forecastFragment, forecastFragment).commit();

        Log.i("My_Tag", "system has start");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My_Tag", "system has start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My_Tag", "system has resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My_Tag", "system has Pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My_Tag", "system has Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My_Tag", "system has destroy");
    }

}
