package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private String mForecast;
    private TextView mWeatherDisplay;
    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDisplay = (TextView)findViewById(R.id.tv_weather_data);
        Intent intentThatStartedActivity = getIntent();

        if(intentThatStartedActivity != null){
            if(intentThatStartedActivity.hasExtra(Intent.EXTRA_TEXT)) {
                mForecast = intentThatStartedActivity.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherDisplay.setText(mForecast);
            }
        }
        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}