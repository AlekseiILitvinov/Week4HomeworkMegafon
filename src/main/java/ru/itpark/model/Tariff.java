package ru.itpark.model;

import java.util.ArrayList;

public abstract class Tariff {
    String name;
    ArrayList<String> highlights;
    boolean isUnlimitedInternet;
    boolean isUnlimitedCalls;
    int price;
    int pricingPeriod;
    String pricingAppendix;
    boolean isSelectable = true;

    public Tariff(String name,
                  ArrayList<String> highlights,
                  boolean isUnlimitedInternet,
                  boolean isUnlimitedCalls,
                  int price,
                  int pricingPeriod,
                  String pricingAppendix) {
        this.name = name;
        this.highlights = highlights;
        this.isUnlimitedInternet = isUnlimitedInternet;
        this.isUnlimitedCalls = isUnlimitedCalls;
        this.price = price;
        this.pricingPeriod = pricingPeriod;
        this.pricingAppendix = pricingAppendix;
    }
}
