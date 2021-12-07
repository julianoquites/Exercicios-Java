package com.company;

public class Main {

    public static void main(String[] args) {
        double variable1 = 20.00;
        double variable2 = 80.00;
        double variableResult =  (variable1 + variable2) * 100;
        double remainder = variableResult % 40.00;
        System.out.println("remainder = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
