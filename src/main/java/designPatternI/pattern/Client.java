package designPatternI.pattern;

public class Client {

    public static void main(String[] args) {
        DocumentHandlerBase chain = new SlideshowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
        chain.openDocument("ppt");
        chain.openDocument("txt");
    }

}


