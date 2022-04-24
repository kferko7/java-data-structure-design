package designPatternI.pattern;

public class SpreadsheetHandler extends DocumentHandlerBase {

    public SpreadsheetHandler(DocumentHandlerBase handler) {
        super(handler);
    }

    public void openDocument(String fileExtension) {
        if(fileExtension.equals("xlsx")) {
            System.out.println("Opening spreadsheet document");
        } else {
            super.openDocument(fileExtension);
        }
    }

}
