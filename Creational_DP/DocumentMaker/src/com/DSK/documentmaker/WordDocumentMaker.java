package com.DSK.documentmaker;

public class WordDocumentMaker extends DocumentMaker {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
