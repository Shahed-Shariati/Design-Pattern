package org.example.structuralDP.decorator.imageeditor;

public class GrayFilter extends ImageEditorDecorator{

    protected GrayFilter(ImageEditor imageEditor) {
        super(imageEditor);
    }


    @Override
    public void processImage(String image) {
            grayFilterImage();
            super.processImage(image);
    }

    private void grayFilterImage() {
        System.out.println("Gray filter process....");
    }
}
