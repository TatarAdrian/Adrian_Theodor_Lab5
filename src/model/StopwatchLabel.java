package model;

import javafx.scene.control.Label;
import javafx.animation.AnimationTimer;

import static java.lang.Math.floor;

/**
 * A custom component that acts as a simple stopwatch.
 **/

public class StopwatchLabel extends Label {

    private long startTime = 0;   // Start time of timer.
    private final long endTime = 1800000;
    long elapsedTime;
    //   (Time is measured in milliseconds.)

    private boolean running;  // True when the timer is running.

    private AnimationTimer timer;  // Used to update the timer to show
    // the number of seconds that have passed.

    /**
     * Constructor sets initial text on the label to
     * "Click to start timer." and sets up a mouse event
     * handler so the label can respond to clicks.
     */
    public StopwatchLabel() {
        super("  Click to start timer.  ");
        setOnMousePressed( e -> setRunning( !running, new Label() ) );
    }


    /**
     * Tells whether the timer is currently running.
     */
    public boolean isRunning() {
        return running;
    }


    /**
     * Sets the stop watch to be running or stopped, and changes the text that
     * is shown on the label.  (This method should be called on the JavaFX
     * application thread.)
     * @param running says whether the stopwatch should be running; if this
     *    is equal to the current state, nothing is done.
     */
    public void setRunning( boolean running, Label label ) {
        if (this.running == running)
            return;
        this.running = running;
        elapsedTime = endTime - startTime;
        if (running) {
            // Record the time and start the stopwatch
            if (timer == null) {
                timer = new AnimationTimer() {
                    public void handle(long now) {
                        if(elapsedTime > 0){
                            elapsedTime = endTime - startTime;
                            startTime+=16;
                            String text = String.format(
                                    "%3.0f Minutes Remaining", floor(elapsedTime/60000.0)+1);
                            label.setText(text);}
                        else
                            label.setText("Time's up!");
                    }
                };
            }
            timer.start();
        }
        else {
            // Stop the stopwatch.  Compute the elapsed time since the
            // stopwatch was started and display it.
            timer.stop();
        }
    }

} // end StopWatchLabel