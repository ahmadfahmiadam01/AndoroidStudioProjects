package com.example.root.mysunshineindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static java.security.AccessController.getContext;

/**
 * Created by root on 04/11/17.
 */

public class WeatherAdapter extends RecyclerView.Adapter <WeatherAdapter.WeatherViewHolder>{
    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item,parent,false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        holder.itemTitle.setText("Cuaca Hari Ini Tanggal" + position);

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class WeatherViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_title)
        TextView itemTitle;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
