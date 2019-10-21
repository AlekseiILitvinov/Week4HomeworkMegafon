package ru.itpark.model;

import java.util.ArrayList;

public class ModemTariff extends Tariff {
    private String description;

    public ModemTariff(String name, ArrayList<String> highlights, boolean isUnlimitedInternet, boolean isUnlimitedCalls, int price, int pricingPeriod, String pricingAppendix, String description) {
        super(name, highlights, isUnlimitedInternet, isUnlimitedCalls, price, pricingPeriod, pricingAppendix);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ModemTariff{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", highlights=" + highlights +
                ", isUnlimitedInternet=" + isUnlimitedInternet +
                ", isUnlimitedCalls=" + isUnlimitedCalls +
                ", price=" + price +
                ", pricingPeriod=" + pricingPeriod +
                ", pricingAppendix='" + pricingAppendix + '\'' +
                ", isSelectable=" + isSelectable +
                '}';
    }
}
