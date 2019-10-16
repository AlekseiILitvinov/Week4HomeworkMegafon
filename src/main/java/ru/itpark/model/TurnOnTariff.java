package ru.itpark.model;

import java.util.ArrayList;

public class TurnOnTariff extends Tariff {
    public static final String NAME_PREFIX = "Включайся!\n";
    private ArrayList<BulletPoint> bulletPoints;
    private boolean isHit;
    private String greenButtonText = "Выбрать";
    private String moreDetails = "Подробнее";

    public TurnOnTariff(String name, ArrayList<String> highlights, int price, int pricingPeriod, String pricingAppendix,
                        ArrayList<BulletPoint> bulletPoints, boolean isHit) {
        super(NAME_PREFIX + name, highlights, price, pricingPeriod, pricingAppendix);
        this.bulletPoints = bulletPoints;
        this.isHit = isHit;
    }

    public TurnOnTariff(String name, ArrayList<String> highlights, int price, int pricingPeriod, String pricingAppendix,
                        ArrayList<BulletPoint> bulletPoints) {
        super("Включайся!\n" + name, highlights, price, pricingPeriod, pricingAppendix);
        this.bulletPoints = bulletPoints;
        this.isHit = false;
    }

    public ArrayList<BulletPoint> getBulletPoints() {
        return bulletPoints;
    }

    public void setBulletPoints(ArrayList<BulletPoint> bulletPoints) {
        this.bulletPoints = bulletPoints;
    }

    public String getGreenButtonText() {
        return greenButtonText;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public void addBulletPoint(BulletPoint bulletPoint) {
        bulletPoints.add(bulletPoint);
    }

    @Override
    public String toString() {
        String hit = "";
        if (isHit) {
            hit = "\tХит";
        }
        return getName() + hit + "\n" + getHighlightsLine() + "\n" +  getBulletPointsLine() + "\n" + getPriceLine() + "\n" +
                getGreenButtonText() + "\n" + getMoreDetails() + "\n";
    }

    private String getBulletPointsLine() {
        StringBuilder bulletPointsLine = new StringBuilder();
        for (BulletPoint bulletPoint : bulletPoints) {
            bulletPointsLine.append(bulletPoint.getPictogramUrl()).append("\t").append(bulletPoint.getDescription()).append("\n");
        }
        return bulletPointsLine.toString();
    }
}
