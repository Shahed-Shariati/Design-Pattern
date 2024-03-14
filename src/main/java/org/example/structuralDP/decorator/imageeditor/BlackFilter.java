package org.example.structuralDP.decorator.imageeditor;

public class BlackFilter extends ImageEditorDecorator{
    protected BlackFilter(ImageEditor imageEditor) {
        super(imageEditor);
    }

    @Override
    public void processImage(String image) {
        blackFilter();
        super.processImage(image);
    }

    private void blackFilter() {
        System.out.println("Black filter process...");
    }
}
