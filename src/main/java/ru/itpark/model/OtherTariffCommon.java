package ru.itpark.model;

import java.util.ArrayList;

public class OtherTariffCommon extends OtherTariff {
    private String greenButtonText = "Выбрать";
    private String moreDetails = "Подробнее";

    public OtherTariffCommon(String name, ArrayList<String> highlights, int price, String description, String pricingAppendix) {
        super(name, highlights, price, -1, pricingAppendix, description);
    }

    public String getGreenButtonText() {
        return greenButtonText;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    @Override
    public String toString() {
        return getName() + "\n" + getDescription() + "\n" + getHighlightsLine() + "\n" + getPriceLine() + "\n" +
                getGreenButtonText() + "\n" + getMoreDetails() + "\n";
    }
}
