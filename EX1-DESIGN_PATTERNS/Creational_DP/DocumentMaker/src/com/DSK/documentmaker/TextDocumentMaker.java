package com.DSK.documentmaker;

public class TextDocumentMaker extends DocumentMaker {

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
