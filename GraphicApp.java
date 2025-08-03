package csc142;
import java.awt.Color;

import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle; 

public class GraphicApp {
	public static void main(String[] args) {
		// ctrl + space for main method shortcut
		// we have to import the file to use it
		GWindow window = new GWindow("First graphics application",800,500);
		Rectangle r = new Rectangle(100, 50, 150, 75, Color.BLACK, true);
		Rectangle r2 = new Rectangle(200, 125, 150, 75, Color.BLUE, true);
		window.add(r);
		window.add(r2);
	}
}
