package factorymethodpatternexample;

public class Main {
    public static void main(String[] args) {
        // Create factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        
        // Process documents
        System.out.println("Processing Word Document:");
        wordFactory.processDocument();
        
        System.out.println("\nProcessing PDF Document:");
        pdfFactory.processDocument();
        
        System.out.println("\nProcessing Excel Document:");
        excelFactory.processDocument();
    }
}