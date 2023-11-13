package org.example;

public class Main {
    public static void main(String[] args) {
        AmericanPowerPlug americanPlug = new AmericanPowerPlug();

        EuropeanPowerSocket europeanSocket = new AmericanToEuropeanAdapter(americanPlug);

        europeanSocket.plugIn();

    }
}