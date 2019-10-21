package ru.itpark.model;

import java.util.ArrayList;

public class TurnOnTariff extends Tariff {
    private static final String NAME_PREFIX = "Включайся!\n";
    private static final int PRICING_PERIOD = 30;
    private static final String PRICING_APPENDIX = "дней";
    private ArrayList<BulletPoint> bulletPoints;
    private boolean isHit;
    private int prepaidMinutes;
    private int prepaidGb;
    private int prepaidSMS;

    public TurnOnTariff(String name,
                        ArrayList<String> highlights,
                        boolean isUnlimitedInternet,
                        boolean isUnlimitedCalls,
                        int price,
                        ArrayList<BulletPoint> bulletPoints,
                        boolean isHit,
                        int prepaidMinutes,
                        int prepaidGb,
                        int prepaidSMS) {
        super(NAME_PREFIX + name, highlights, isUnlimitedInternet, isUnlimitedCalls, price, PRICING_PERIOD, PRICING_APPENDIX);
        this.bulletPoints = bulletPoints;
        this.isHit = isHit;
        this.prepaidMinutes = prepaidMinutes;
        this.prepaidGb = prepaidGb;
        this.prepaidSMS = prepaidSMS;
    }

    public static String getNamePrefix() {
        return NAME_PREFIX;
    }

    public ArrayList<BulletPoint> getBulletPoints() {
        return bulletPoints;
    }

    public void setBulletPoints(ArrayList<BulletPoint> bulletPoints) {
        this.bulletPoints = bulletPoints;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public int getPrepaidMinutes() {
        return prepaidMinutes;
    }

    public void setPrepaidMinutes(int prepaidMinutes) {
        this.prepaidMinutes = prepaidMinutes;
    }

    public int getPrepaidGb() {
        return prepaidGb;
    }

    public void setPrepaidGb(int prepaidGb) {
        this.prepaidGb = prepaidGb;
    }

    public int getPrepaidSMS() {
        return prepaidSMS;
    }

    public void setPrepaidSMS(int prepaidSMS) {
        this.prepaidSMS = prepaidSMS;
    }

    @Override
    public String toString() {
        return "TurnOnTariff{" +
                "bulletPoints=" + bulletPoints +
                ", isHit=" + isHit +
                ", prepaidMinutes=" + prepaidMinutes +
                ", prepaidGb=" + prepaidGb +
                ", prepaidSMS=" + prepaidSMS +
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
