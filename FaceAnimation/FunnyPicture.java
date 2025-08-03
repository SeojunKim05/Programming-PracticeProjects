package csc142;
import java.awt.Color;

import uwcse.graphics.GWindow;
import uwcse.graphics.GWindowEvent;
import uwcse.graphics.GWindowEventAdapter;
import uwcse.graphics.Rectangle;

/**
 * A picture (to illustrate the use of several classes)
 */

public class FunnyPicture extends GWindowEventAdapter {

	// The graphics window to display the picture
	private GWindow window;

	// Two smiling faces
	// (make them instance variables since they are accessed in
	// several methods)
	private SmilingFace face1;

	private SmilingFace face2;

	// counter for the animation
	private int animationCounter;
	
	public FunnyPicture() {
		// Create the graphics window
		this.window = new GWindow("Funny picture", 300, 300);
		// Terminate the application when the user closes the window
		this.window.setExitOnClose();

		// Background
		Rectangle bng = new Rectangle(0, 0, this.window.getWindowWidth(), this.window.getWindowHeight(), Color.cyan,
				true);
		this.window.add(bng);

		// Draw the picture
		this.face1 = new SmilingFace(100, 100, 0.5, this.window);
		this.face2 = new SmilingFace(200, 200, 1.5, this.window);
		// Start the animation
		this.window.addEventHandler(this);
		this.window.startTimerEvents(100);
	}

	public void timerExpired(GWindowEvent e) {

		// to prevent any flicker while redrawing, suspend any refresh of the
		// window
		this.window.suspendRepaints();

		if (this.animationCounter <= 100) {
			// Move down and to the right
			this.face1.changeScale(1.05);
			this.face1.moveBy(1, 1);
			this.face2.moveBy(1, 1);
		} else {
			// Move the faces back to where they originally were
			this.face1.changeScale(1/1.05);
			this.face1.moveBy(-1, -1);
			this.face2.moveBy(-1, -1);
		}

		this.window.resumeRepaints();

		this.animationCounter++;
		if (this.animationCounter > 200) {
			this.window.stopTimerEvents();
		}
	}

	/**
	 * Starts the application
	 */
	public static void main(String[] args) {
		new FunnyPicture();
	}
	
}
