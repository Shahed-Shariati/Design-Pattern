package org.example.structuralDP.decorator.imageeditor;

public class BasicImageEditor implements ImageEditor{
    @Override
    public void processImage(String image) {
        System.out.println("Process image.. " + image + "jpg");

    }
}
