package com.acabes.gautham.assignments.task5.FlightBooking.src.main.java.com.acabes.assignment.flight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Flight {
    private HashMap<Integer, String> flights = new HashMap<>();
    private List<String> fromDate = new ArrayList<>();
    private List<String> toDate = new ArrayList<>();
    private List<Integer> price = new ArrayList<>();
    private List<String> startTime = new ArrayList<>();
    private List<String> endTime = new ArrayList<>();
    private List<Integer> luggageDetails = new ArrayList<>();

    // Setters for the flight details


    public void setFlights(HashMap<Integer, String> flights) {
        this.flights = flights;
    }

    public void setFromDate(List<String> fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(List<String> toDate) {
        this.toDate = toDate;
    }

    public void setPrice(List<Integer> price) {
        this.price = price;
    }

    public void setStartTime(List<String> startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(List<String> endTime) {
        this.endTime = endTime;
    }

    public void setLuggageDetails(List<Integer> luggageDetails) {
        this.luggageDetails = luggageDetails;
    }

    //Getters for flight details


    public HashMap<Integer, String> getFlights() {
//        System.out.println("printing from flight.java"+this.flights);
        return flights;
    }

    public List<String> getFromDate() {
        return fromDate;
    }

    public List<String> getToDate() {
        return toDate;
    }

    public List<Integer> getPrice() {
        return price;
    }

    public List<String> getStartTime() {
        return startTime;
    }

    public List<String> getEndTime() {
        return endTime;
    }

    public List<Integer> getLuggageDetails() {
        return luggageDetails;
    }

}
