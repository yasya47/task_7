package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Queue clinic = new Queue(5);

        System.out.println("Queue in clinic");
        System.out.println("Already standing in line "+ (clinic.getPatientNumber()-1)+" patient");
        clinic.addQueue(10);
        clinic.queue();


        System.out.println("Race");
        Queue race = new Queue(1);
        race.addQueue(20);
        race.race();


        System.out.println("List in which elements are added to the beginning and end");
        ListClass lis  = new ListClass(10);
        lis.addItems();
        lis.removalItems();


        System.out.println("Jenga");
        ListClass jenga = new ListClass(20);
        jenga.addJenga();
        jenga.jenga();


        System.out.println("Credit cards");
        SetClass creditCards = new SetClass(1254);
creditCards.addCards();

        }

    }
