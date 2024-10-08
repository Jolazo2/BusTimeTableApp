 
package com.example.bustimetable;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BusAdapter busAdapter;
    private ArrayList<BusRoute> busRoutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample bus routes data
        busRoutes = new ArrayList<>();
        busRoutes.add(new BusRoute("Route 1", "10:00 AM"));
        busRoutes.add(new BusRoute("Route 2", "11:00 AM"));
        busRoutes.add(new BusRoute("Route 3", "12:00 PM"));
        busRoutes.add(new BusRoute("Route 4", "1:00 PM"));

        ListView listView = findViewById(R.id.bus_timetable);
        busAdapter = new BusAdapter(this, busRoutes);
        listView.setAdapter(busAdapter);

        // Search functionality
        EditText searchBar = findViewById(R.id.search_bar);
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                busAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
