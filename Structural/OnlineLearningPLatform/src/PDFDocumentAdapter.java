public class PDFDocumentAdapter implements LearningContent {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(PDFDocument pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    @Override
    public void displayContent() {
        pdfDocument.showPDF();
    }
}
