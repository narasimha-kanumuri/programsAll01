
class VideoPlayer {
    // Fields or State
    Boolean play = false; // true or false
    Boolean pause = true;// true or false
    Boolean captions = false;// on, off
    float playbackSpeed = 1.0f;
    int videoQuality = 720;

    // Behaviors
    /* If input = 0, pause. Else play */
    public void pauseResume(int input) {
        if (input == 0) {
            play = false;
            pause = true;
        } else {
            pause = false;
            play = true;
        }
    }

    /* If input = 0, off. Else on */
    public void displayCaption(int input) {
        if (input == 0) {
            captions = false;
        } else {
            captions = true;
        }
    }

    public void playbackSpeed(int increase) {
        if (increase == 1 && increase < 2.0f) {
            // playbackSpeed = playbackSpeed + 0.25;
            playbackSpeed += 0.25f;
        }
        /* if increase == 0, decrease the speed */
        else if (increase > 0.0f) {
            playbackSpeed -= 0.25f;
        }
    }

    public void printStates() {
        System.out.println("play: " + play + " " +
                "captions:" + captions + " " +
                "playbackSpeed: " + playbackSpeed);
    }
}

class YouTubePlayer extends VideoPlayer {
    String info = "No info available";// To store info on current video

    public void setInfo(String information) {
        info = information;
    }

}

public class Program_003 {
    public static void main(String[] args) {
        VideoPlayer vd = new VideoPlayer();
        YouTubePlayer yt1 = new YouTubePlayer();
        VideoPlayer yt2 = new YouTubePlayer();
        // YouTubePlayer Does'nt have printState method.
        vd.printStates();
        yt1.printStates();
        yt2.printStates();
        yt1.setInfo("Sample Info to the video");
        /*
         * yt2 has VideoPlayer as type.
         * So Cannot access YoutubePlayer's attributes.
         */
        // yt2.setInfo("Sample Info to the video");
        /*
         * printStates() is executed from parent class.
         * Parent class do not have 'info' State.
         */
        yt1.printStates();
        yt2.printStates();
    }
}
