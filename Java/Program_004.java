/* 
 * Just giving instructions on what type of behaviors are needed.
 * Not giving the implementation or definition to them.
 * All the methods of interface MUST be implemented
*/
interface VideoPlayer {

    void pauseResume(int input);

    void displayCaption(int input);

    void playbackSpeed(int increase);

    void printStates();
}

/*
 * Same Video player works with different inputs
 * on different devices.
 * 
 * Since we are implementing an interface,
 * all methods of interface MUST me implemented.
 */
class MobileVideoPlayer implements VideoPlayer {
    String info = "No info available";// To store info on current video
    Boolean play = false;
    Boolean captions = false;
    float playbackSpeed = 1.0f;

    public void pauseResume(int input) {
        if (input == 0) {
            play = false;
        } else {
            play = true;
        }
    }

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

    public void setInfo(String information) {
        info = information;
    }

    public void printStates() {
        System.out.println("play: " + play + " " +
                "captions:" + captions + " " +
                "playbackSpeed: " + playbackSpeed + " " +
                "info: " + info);
    }
}

public class Program_004 {
    public static void main(String[] args) {
        /*
         * Not allowed to create an object since it is interface.
         * VideoPlayer vd = new VideoPlayer();
         */

        /*
         * Interface cannot be a type.
         * VideoPlayer yt2 = new YouTubePlayer();
         */

        MobileVideoPlayer yt1 = new MobileVideoPlayer();
        yt1.printStates();

        yt1.setInfo("Sample Info to the video");
        yt1.printStates();
    }
}