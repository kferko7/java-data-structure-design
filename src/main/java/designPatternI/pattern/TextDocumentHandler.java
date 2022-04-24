package designPatternI.pattern;

public class TextDocumentHandler extends DocumentHandlerBase {

    public TextDocumentHandler(DocumentHandlerBase handler) {
        super(handler);
    }

    public void openDocument(String fileExtension) {
        if(fileExtension.equals("txt")) {
            System.out.println("Opening text document");
        } else {
            super.openDocument(fileExtension);
        }
    }

}
