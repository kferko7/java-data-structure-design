package designPatternI.pattern;

public class SlideshowHandler extends DocumentHandlerBase {

    public SlideshowHandler(DocumentHandlerBase handler) {
        super(handler);
    }
    //implement openDocument and check if file Extension is ppt
    public void openDocument(String fileExtension) {
        if(fileExtension.equals("ppt")) {
            System.out.println("Opening slideshow document");
        } else {
            super.openDocument(fileExtension);
        }
    }

}

