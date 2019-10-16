package ru.itpark.model;

import java.util.ArrayList;

public class OtherTariffRestricted extends OtherTariff {
    private String whiteButtonText = "Подробнее";

    public OtherTariffRestricted(String name, ArrayList<String> highlights, int price, int pricingPeriod,
                                 String pricingAppendix, String description) {
        super(name, highlights, price, pricingPeriod, pricingAppendix, description);
    }

    public OtherTariffRestricted(String name, ArrayList<String> highlights, int price, int pricingPeriod, String description) {
        super(name, highlights, price, pricingPeriod, description);
    }

    @Override
    public String toString() {
        return getName() + "\n" + getDescription() + "\n" + getHighlightsLine() + "\n" + getPriceLine() + "\n" +
                whiteButtonText + "\n";
    }
}
