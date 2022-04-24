package designPatternI.pattern;

public class DocumentHandlerBase {
    private DocumentHandlerBase next;

    public DocumentHandlerBase(DocumentHandlerBase next) {
        this.next = next;
    }

    public void openDocument(String fileExtension) {
        if(next != null) {
            next.openDocument(fileExtension);
        }
    }

}

