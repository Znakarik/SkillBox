package ru.didenko;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Airport airport1 = Airport.getInstance();
        Airport airport2 = Airport.getInstance();

        // фига се
//        System.out.println(airport1.getAllAircrafts());
        System.out.println(airport1.getTerminals());

        Aircraft aircraft1 = new Aircraft("F125");
        System.out.println(aircraft1.getModel());

        Flight flight = new Flight("TU-154",Flight.Type.ARRIVAL,new Date(),aircraft1);
//        System.out.println(airport1.getAllAircrafts());
        System.out.println(flight.getAircraft());
        System.out.println(flight.getDate());

        // КЛЕВА
    }
}
