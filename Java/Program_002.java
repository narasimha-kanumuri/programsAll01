class VideoPlayer {
    //Fields or State
    Boolean play = false; // true or false
    Boolean pause = true;// true or false
    Boolean captions = false;// on, off
    float playbackSpeed = 1.0f;
    int videoQuality = 720;

    //Behaviors
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

public class Program_002 {
    public static void main(String[] args) {
        
        VideoPlayer videoPlayerOne;
        videoPlayerOne = new VideoPlayer();
        //videoPlayerOne.printStates();

        VideoPlayer videoPlayerTwo = new VideoPlayer();
        videoPlayerTwo.printStates();

        videoPlayerOne.play = true;
        videoPlayerOne.pause = false;
        videoPlayerOne.captions = true;
        videoPlayerOne.playbackSpeed(1);
        videoPlayerOne.printStates();

        videoPlayerTwo.play = true;
        videoPlayerTwo.pause = false;
        videoPlayerTwo.captions = true;
        videoPlayerTwo.playbackSpeed(1);
        videoPlayerTwo.playbackSpeed(1);
        videoPlayerTwo.printStates();     
    }
}