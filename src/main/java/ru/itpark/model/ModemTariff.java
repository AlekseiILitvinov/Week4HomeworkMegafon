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

    public ModemTariff(String name, ArrayList<String> highlights, int price, String description) {
        super(name, highlights, price, 1);
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
    public String getPriceLine() {
        if (getPricingPeriod() == 1) {
            return "" + getPrice() + " Р в месяц";
        }
        return "" + getPrice() + " Р";
    }

    @Override
    public String toString() {
        return getName() + "\n" + getDescription() + "\n" + getHighlights() + "\n" + getPriceLine() + "\n" +
                getGreenButtonText() + "\n" + getMoreDetails() + "\n";
    }
}
