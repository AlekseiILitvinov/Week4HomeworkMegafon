package ru.itpark.model;

import java.util.ArrayList;

public abstract class Tariff {
    private String name;
    private ArrayList<String> highlights;
    private int price;
    private int pricingPeriod;

    public Tariff(String name, ArrayList<String> highlights, int price, int pricingPeriod) {
        this.name = name;
        this.highlights = highlights;
        this.price = price;
        this.pricingPeriod = pricingPeriod;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getHighlights() {
        return highlights;
    }

    public void addHighlights(String highlight){
        highlights.add(highlight);
    }

    public int getPricingPeriod() {
        return pricingPeriod;
    }

    public abstract String getPriceLine();
}
