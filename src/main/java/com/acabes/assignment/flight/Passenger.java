package com.acabes.gautham.assignments.task5.FlightBooking.src.main.java.com.acabes.assignment.flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Passenger extends Flight {
   private int passengers;
    @Override
    public HashMap<Integer, String> getFlights() {
        return super.getFlights();
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
}
