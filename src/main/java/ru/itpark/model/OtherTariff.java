package ru.itpark.model;

import java.util.ArrayList;

public abstract class OtherTariff extends Tariff {
    private String description;

    public OtherTariff(String name, ArrayList<String> highlights, int price, int pricingPeriod, String description) {
        super(name, highlights, price, pricingPeriod);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
