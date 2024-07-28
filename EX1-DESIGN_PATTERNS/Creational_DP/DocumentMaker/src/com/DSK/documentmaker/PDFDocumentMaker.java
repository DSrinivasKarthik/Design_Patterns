package com.DSK.documentmaker;

public class PDFDocumentMaker extends DocumentMaker {

    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
