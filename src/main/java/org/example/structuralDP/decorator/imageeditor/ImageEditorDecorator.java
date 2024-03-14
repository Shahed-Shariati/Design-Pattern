package org.example.structuralDP.decorator.imageeditor;

public abstract class ImageEditorDecorator implements ImageEditor{

    private final ImageEditor imageEditor;

    protected ImageEditorDecorator(ImageEditor imageEditor) {
        this.imageEditor = imageEditor;
    }

    @Override
    public void processImage(String image) {
       imageEditor.processImage(image);
    }


}
