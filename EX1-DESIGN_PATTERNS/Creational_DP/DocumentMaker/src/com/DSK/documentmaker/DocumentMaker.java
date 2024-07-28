package com.DSK.documentmaker;

public abstract class DocumentMaker {
    public abstract Document createDocument();

    public Document getDocument() {
        Document doc = createDocument();
        doc.open();
        return doc;
    }
}
