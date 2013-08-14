package com.sportslabs.demo.utils;

import com.sportslabs.demo.models.ImageAsset;

public class ImageUtils {

    public ImageAsset resizeImage(ImageAsset image, int width, int height) {
        if(image != null) {
            image.setWidth(width);
            image.setHeight(height);
        }
        doSomeHeavyLifting();
        return image;
    }

    private void doSomeHeavyLifting() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
