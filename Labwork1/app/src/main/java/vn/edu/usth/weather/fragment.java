package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class fragment extends Fragment {
    public WeatherandForecastFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();

        WeatherFragment weatherFragment = new WeatherFragment();
        weatherFragment.setArguments(this.getArguments());
        ForecastFragment forecastFragment = new ForecastFragment();

        fragmentTransaction.replace(R.id.weatherFragment, weatherFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        fragmentTransaction.replace(R.id.forecastFragment, forecastFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        fragmentTransaction.commit();
        LinearLayout weatherForecastLinearLayout = (LinearLayout) inflater.inflate(R.layout.activity_weatherand_forecast_fragment, container, false);
        return weatherForecastLinearLayout;
        }
}