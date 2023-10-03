package com.acabes.gautham.assignments.task5.FlightBooking.src.main.java.com.acabes.assignment.flight;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int choice;
        int userSelect;
        String password;
        String []timeArray={"10:00 Am","12:30 PM","09:00 AM"};
        int [] availableTime;
        Scanner sc = new Scanner(System.in);
        Flight f1 = new Flight();
        Passenger p1 = new Passenger();
        int flag=0;
        do {
            System.out.println("1.User");
            System.out.println("2.Admin");
            userSelect = sc.nextInt();
            if (userSelect == 2) {
                System.out.println("Enter Password");
                password = sc.next();
                if (password.equals("admin")) {
                    System.out.println("Select an option");
                    System.out.println("1.Add Flight");
                    System.out.println("2.Remove Flight");
                    System.out.println("3.Enter from Date");
                    System.out.println("4.Enter To Date");
                    System.out.println("5.Enter the prices");
                    System.out.println("9.Exit");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            HashMap<Integer, String> flights = new HashMap<>();
                            int numberOfFlights;
                            String flightName;
                            System.out.println("How many flights?");
                            numberOfFlights = sc.nextInt();
                            flag = numberOfFlights;
                            for (int i = 0; i < numberOfFlights; i++) {
                                System.out.println("Enter flight name");
                                flightName = sc.next();
                                flights.put(i, flightName);
                                f1.setFlights(flights);
                            }
                            break;
                        case 2:
                            int flightToRemove;
                            System.out.println("Enter id of flight to remove");
                            System.out.println(f1.getFlights());
                            try {
                                flightToRemove = sc.nextInt();
                                if (f1.getFlights().containsKey(flightToRemove)) {
                                    f1.getFlights().remove(flightToRemove);
                                    System.out.println("Flight Removed!");
                                } else {
                                    System.out.println("Enter a valid key to remove");
                                }
                            } catch (Exception e) {
                                System.out.println("Enter a valid key to remove");
                            }
                            break;
                        case 3:
                            System.out.println("Enter From Date");
                            List<String> fromDate = new ArrayList<>();
                            for (int i = 0; i < 3; i++) {
                                fromDate.add(sc.next());
                                f1.setFromDate(fromDate);
                            }
                            break;
                        case 4:
                            System.out.println("Enter to Date");
                            List<String> toDate = new ArrayList<>();
                            for (int i = 1; i <= 3; i++) {
                                toDate.add(sc.next());
                                f1.setToDate(toDate);
                            }
                            break;
                        case 5:
                            System.out.println("Enter the price");
                            List<Integer> prices = new ArrayList<>();
                            for (int i = 0; i < 3; i++) {
                                prices.add(i, sc.nextInt());
                                f1.setPrice(prices);
                            }
                            break;
                    }
                } else {
                    System.out.println("Wrong Password!");
                }
            } else if (userSelect == 1) {
                int userCase;
                System.out.println("1. Book a Flight");
                System.out.println("2. Check Available flights");
                System.out.println("3. Check Remaining Seats");
                List <Integer> availableSeats = new ArrayList<>();
                availableTime = new int[f1.getFlights().size()];
                userCase = sc.nextInt();
                switch (userCase) {
                    case 1:
                        System.out.println("Enter plane id");
                        System.out.println(f1.getFlights());
                        int flightName; // flight id
                        flightName = sc.nextInt();
                        System.out.println("Enter how many seats to book");
                        int setsToBook; // number of seats
                        setsToBook = sc.nextInt();
                        String flightNameToStore = f1.getFlights().get(flightName);
                        //System.out.println(flightNameToStore);
                        HashMap<String,Integer> flightValueStoring = new HashMap<>();
                        flightValueStoring.put(flightNameToStore,100-setsToBook);
                        availableTime[flightName] -= setsToBook;
                        System.out.println(setsToBook+" Tickets booked for "+flightNameToStore);
                        break;
                    case 2:
                        System.out.println("-------------------------");
                        System.out.println("Available flights are");
                        System.out.println("-------------------------");
                        for( Map.Entry<Integer, String> entry : f1.getFlights().entrySet() ){
                            System.out.println( "Flight ID: "+entry.getKey() + " Name: " + entry.getValue() );
                        }
                        System.out.println("-------------------------");
                        System.out.println("Available Timings are");
                        System.out.println("-------------------------");
                        for (String x: timeArray) {
                            System.out.println(x);
                        }
                        break;
                    case 3:
                        int count=0;
                        System.out.println(flag);
                        for (int i=0;i<flag;i++){
                            availableTime[i]=100;
                        }
                        for (int x:availableTime) {
                            System.out.println("Available seats for the id " + count +" flight id is "+x);
                            count++;
                        }
                        break;
                }
                System.out.println("-------------------------");
            }
           // System.out.println(f1.getFlights() + "" + f1.getFromDate() + f1.getToDate() + f1.getPrice());
        } while (true);
    }
}