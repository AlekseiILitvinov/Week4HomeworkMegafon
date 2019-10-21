package ru.itpark.model;

import java.util.ArrayList;

public class OtherTariffRestricted extends OtherTariff {
    private boolean isUnlimitedCallsInside;
    private int prepaidGb;

    public OtherTariffRestricted(String name, ArrayList<String> highlights, boolean isUnlimitedInternet, boolean isUnlimitedCalls, int price, int pricingPeriod, String pricingAppendix, String description, boolean isUnlimitedCallsInside, int prepaidGb) {
        super(name, highlights, isUnlimitedInternet, isUnlimitedCalls, price, pricingPeriod, pricingAppendix, description);
        this.isUnlimitedCallsInside = isUnlimitedCallsInside;
        this.prepaidGb = prepaidGb;
        isSelectable = false;
    }

    public boolean isUnlimitedCallsInside() {
        return isUnlimitedCallsInside;
    }

    public void setUnlimitedCallsInside(boolean unlimitedCallsInside) {
        isUnlimitedCallsInside = unlimitedCallsInside;
    }

    public int getPrepaidGb() {
        return prepaidGb;
    }

    public void setPrepaidGb(int prepaidGb) {
        this.prepaidGb = prepaidGb;
    }

    @Override
    public String toString() {
        return "OtherTariffRestricted{" +
                "isUnlimitedCallsInside=" + isUnlimitedCallsInside +
                ", prepaidGb=" + prepaidGb +
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
