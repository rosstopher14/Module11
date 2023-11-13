package org.example;

public class AmericanToEuropeanAdapter implements EuropeanPowerSocket {
    private AmericanPowerPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPowerPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugIn() {
        americanPlug.insertIntoAmericanSocket();
        System.out.println("Adapter converting to European power socket");
    }
}
