package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class WeatherFragment extends Fragment {
    public WeatherFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        RelativeLayout activity_weather_fragment = (RelativeLayout) inflater.inflate(R.layout.activity_weather_fragment, container, false);
        return activity_weather_fragment;
    }
}