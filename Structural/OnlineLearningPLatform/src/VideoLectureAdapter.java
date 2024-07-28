public class VideoLectureAdapter implements LearningContent {
    private VideoLecture videoLecture;

    public VideoLectureAdapter(VideoLecture videoLecture) {
        this.videoLecture = videoLecture;
    }

    @Override
    public void displayContent() {
        videoLecture.playVideo();
    }
}
