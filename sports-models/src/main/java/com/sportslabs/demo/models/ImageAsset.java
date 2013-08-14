package com.sportslabs.demo.models;

public class ImageAsset {

    private int height;
    private int width;

    public ImageAsset() {
        this(0, 0);
    }

    public ImageAsset(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
