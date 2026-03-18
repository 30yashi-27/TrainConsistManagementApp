package com.train.consist;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper exists");
        }

        // UC3
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // UC4
        LinkedList<String> train = new LinkedList<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry:");
        System.out.println(train);

        train.removeFirst();
        train.removeLast();

        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}