public class Main {
    public static void main(String[] args) {
        LearningContent videoContent = new VideoLectureAdapter(new VideoLecture());
        LearningContent pdfContent = new PDFDocumentAdapter(new PDFDocument());
        LearningContent quizContent = new InteractiveQuizAdapter(new InteractiveQuiz());

        videoContent.displayContent();
        pdfContent.displayContent();
        quizContent.displayContent();
    }
}
