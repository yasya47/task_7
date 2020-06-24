package com.company;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Queue {



    LinkedList<Integer> hos = new LinkedList<>();
    static int patientNumber;

    public Queue(int patientNumber) {
        Queue.patientNumber = patientNumber;

    }

    public void queue() {
        while (!hos.isEmpty()) {

            if (patientNumber % 3 == 0) {
                System.out.println("Patient №" + patientNumber + " out of turn");
                patientNumber++;
                hos.peekLast();
                hos.removeLast();
            } else {
                System.out.println("Patient № " + patientNumber + " stood in line");
                patientNumber++;
                hos.poll();
            }
        }

    }

    public void addQueue(int n) {
        for (int i = 1; i <= n; i++) {
            hos.add(i);
        }
    }

    public void printPatient(String number) {
        System.out.println("Patient № " + number);
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public void race() {
        while (hos.size() > 0) {
            Collections.shuffle(hos);
            System.out.println(hos);
            hos.pollLast();
        }
    }
    @Override
    public String toString() {
        return hos.toString();
    }

}




