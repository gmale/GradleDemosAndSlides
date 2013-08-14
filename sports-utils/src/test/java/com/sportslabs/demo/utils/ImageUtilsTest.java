package com.sportslabs.demo.utils;

import com.sportslabs.demo.models.ImageAsset;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ImageUtilsTest {

    private ImageAsset image;
    private ImageUtils imageUtils;

    @Before
    public void setUp() throws Exception {
        image = new ImageAsset(500, 500);
        imageUtils = new ImageUtils();
    }

    @Test
    public void testResizeImage() throws Exception {
        assertNotEquals(100, image.getHeight());
        imageUtils.resizeImage(image, 100, 100);
        assertEquals(100, image.getHeight());
    }

}
