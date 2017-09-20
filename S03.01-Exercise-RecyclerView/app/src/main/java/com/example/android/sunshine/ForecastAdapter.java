package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{

    private String [] mWeatherData;

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewgroup, int viewType){
        Context context = viewgroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewgroup, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder viewHolder, int position){
        String weatherForThisDay = mWeatherData[position];
        viewHolder.mWeatherTextView.setText(weatherForThisDay);
    }

    @Override
    public int getItemCount(){
        if (mWeatherData == null) return 0;
        return mWeatherData.length;
    }

    public void setWeatherData(String [] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}