package com.example.bustimetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BusAdapter extends ArrayAdapter<BusRoute> {

    public BusAdapter(Context context, ArrayList<BusRoute> busRoutes) {
        super(context, 0, busRoutes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BusRoute busRoute = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bus_route_item, parent, false);
        }

        TextView routeName = convertView.findViewById(R.id.route_name);
        TextView departureTime = convertView.findViewById(R.id.departure_time);

        routeName.setText(busRoute.getRouteName());
        departureTime.setText(busRoute.getDepartureTime());

        return convertView;
    }
}
 
