package com.example.bustimetable;

public class BusRoute {
    private String routeName;
    private String departureTime;

    public BusRoute(String routeName, String departureTime) {
        this.routeName = routeName;
        this.departureTime = departureTime;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
 
