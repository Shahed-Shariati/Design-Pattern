package org.example.structuralDP.decorator.imageeditor;

public class MainApp {
    public static void main(String[] args) {

        ImageEditorDecorator imageEditorDecorator = new BlackFilter(new GrayFilter( new BlackFilter(new BasicImageEditor())));
        imageEditorDecorator.processImage("Shahed");
        System.out.println("------------------------------");
      new BlackFilter(new GrayFilter(new BasicImageEditor())).processImage("Shahed");
    }
}
