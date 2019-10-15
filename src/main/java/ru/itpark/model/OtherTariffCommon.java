package ru.itpark.model;

import java.util.ArrayList;

public class OtherTariffCommon extends OtherTariff {
    private String greenButtonText = "Выбрать";
    private String moreDetails = "Подробнее";
    private String pricingAppendix;

    public OtherTariffCommon(String name, ArrayList<String> highlights, int price, String description, String pricingAppendix) {
        super(name, highlights, price, -1, description);
        this.pricingAppendix = pricingAppendix;
    }

    public String getGreenButtonText() {
        return greenButtonText;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    @Override
    public String getPriceLine() {
        if (getPrice() == 0){
            return "0 Р\n";
        }
        return getPrice() + " Р " + pricingAppendix;
    }

    @Override
    public String toString() {
        return getName() + "\n" + getDescription() + "\n" + getHighlights() + "\n" + getPriceLine() + "\n" +
                getGreenButtonText() + "\n" + getMoreDetails() + "\n";
    }
}
