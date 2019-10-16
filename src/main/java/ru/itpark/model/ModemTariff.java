package ru.itpark.model;

import java.util.ArrayList;

public class ModemTariff extends Tariff {
    private String description;
    private String greenButtonText = "Выбрать";
    private String moreDetails = "Подробнее";

    public ModemTariff(ArrayList<String> highlights, int price, int pricingPeriod, String description) {
        super("Твой безлимит на " + pricingPeriod + " месяцев", highlights, price, pricingPeriod);
        this.description = description;
    }

    public ModemTariff(String name, ArrayList<String> highlights, int price, String pricingAppendix, String description) {
        super(name, highlights, price, 1, pricingAppendix);
        this.description = description;
    }

    public String getDescription() {
        return description;
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
