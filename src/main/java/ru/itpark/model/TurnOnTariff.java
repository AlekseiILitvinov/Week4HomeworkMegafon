package ru.itpark.model;

import java.util.ArrayList;

public class TurnOnTariff extends Tariff {
    private ArrayList<BulletPoint> bulletPoints = new ArrayList<>();
    private String greenButtonText = "Выбрать";
    private String moreDetails = "Подробнее";

    public TurnOnTariff(String name, ArrayList<String> highlights, int price, int pricingPeriod,
                        ArrayList<BulletPoint> bulletPoints) {
        super("Включайся!\n" + name, highlights, price, pricingPeriod);
        this.bulletPoints = bulletPoints;
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

    public String getPriceLine(){
        return "" + this.getPrice() + "Р за " + this.getPricingPeriod() + " дней";
    }

    public void addBulletPoint(BulletPoint bulletPoint){
        bulletPoints.add(bulletPoint);
    }

    @Override
    public String toString() {
        return getName() + "\n" + getHighlights() + "\n" + getBulletPoints() + "\n" + getPriceLine() + "\n" +
                getGreenButtonText() + "\n" + getMoreDetails() + "\n";
    }
}
