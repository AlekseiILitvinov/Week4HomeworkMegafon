package ru.itpark.model;

import java.util.ArrayList;

public class OtherTariffRestricted extends OtherTariff {
    private String whiteButtonText = "Подробнее";

    public OtherTariffRestricted(String name, ArrayList<String> highlights, int price, int pricingPeriod, String description) {
        super(name, highlights, price, pricingPeriod, description);
    }

    @Override
    public String getPriceLine() {
        if (getPrice() == 0) {
            return "0 Р\n";
        }
        return getPrice() + " за " + getPricingPeriod() + " дней";
    }

    @Override
    public String toString() {
        return getName() + "\n" + getDescription() + "\n" + getHighlights() + "\n" + getPriceLine() + "\n" +
                whiteButtonText + "\n";
    }
}
