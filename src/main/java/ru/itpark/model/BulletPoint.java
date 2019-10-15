package ru.itpark.model;

public class BulletPoint {
    private String pictogramUrl;
    private String description;

    public BulletPoint(String pictogramUrl, String description) {
        this.pictogramUrl = pictogramUrl;
        this.description = description;
    }

    public String getPictogramUrl() {
        return pictogramUrl;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return pictogramUrl + " " + description;
    }
}
