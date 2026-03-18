package com.train.consist;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // ---------------- UC2 START ----------------

        // Create Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // Final State
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        // ---------------- UC2 END ----------------
    }
}