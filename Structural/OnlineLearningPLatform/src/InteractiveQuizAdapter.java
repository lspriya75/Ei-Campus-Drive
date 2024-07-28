public class InteractiveQuizAdapter implements LearningContent {
    private InteractiveQuiz interactiveQuiz;

    public InteractiveQuizAdapter(InteractiveQuiz interactiveQuiz) {
        this.interactiveQuiz = interactiveQuiz;
    }

    @Override
    public void displayContent() {
        interactiveQuiz.startQuiz();
    }
}
