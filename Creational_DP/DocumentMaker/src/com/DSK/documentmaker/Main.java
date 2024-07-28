package com.DSK.documentmaker;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose document type to create:");
        System.out.println("1. Word Document");
        System.out.println("2. PDF Document");
        System.out.println("3. Text Document");
        System.out.print("Enter choice (1-3): ");

        int choice = scanner.nextInt();
        DocumentMaker maker = null;

        switch (choice) {
            case 1:
                maker = new WordDocumentMaker();
                break;
            case 2:
                maker = new PDFDocumentMaker();
                break;
            case 3:
                maker = new TextDocumentMaker();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        Document document = maker.getDocument();
        document.save();
        document.close();

        scanner.close();
    }
}
