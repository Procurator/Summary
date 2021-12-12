package com.company.module2.summary;

import java.util.Scanner;

public class TrafficDelayCalculatorSummary {
    public static void main(String[] args) {

        System.out.println("Enter transport name: bus, car, subway or bike");
        String transportName = new Scanner(System.in).nextLine().strip().toLowerCase();

        double pureTransportTimeInDouble = getPureTransportTime(transportName);

        double arrivalTimeInMinutes;

        if (getPureTransportTime(transportName) == 0) {
            System.out.println("Incorrect transport type entered.");
            return;
        } else
            System.out.println("Enter hours in format hh, then press key enter");
        double exitHour = new Scanner(System.in).nextDouble();

        System.out.println("Enter minutes in format mm, then press key enter");
        double exitMinutes = new Scanner(System.in).nextDouble();

        double trafficDelayInDouble = getTrafficDelay(exitHour);

        arrivalTimeInMinutes = exitHour * 60 + exitMinutes + pureTransportTimeInDouble + trafficDelayInDouble;
        System.out.println("Arrival time " + Math.round(Math.floor((arrivalTimeInMinutes) / 60)) + ":" + Math.round(arrivalTimeInMinutes % 60));
    }

    static double getPureTransportTime(String transportName) {
        switch (transportName) {
            case "bus":
                return 41;
            case "subway":
                return 43;
            case "car":
                return 23;
            case "bike":
                return 26;
            default:
                return 0;
        }
    }

    static double getTrafficDelay(double exitHour) {
        if (exitHour >= 6 && exitHour < 8) return 31;
        else if (exitHour >= 8 && exitHour < 10) return 47;
        else if (exitHour >= 10 && exitHour < 12) return 17;
        else return 0;
    }
}
