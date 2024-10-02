package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		// blue covering everything
		StdDraw.setPenColor(137, 207, 240);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
	
		
		// white in the middle
		StdDraw.setPenColor(250, 250, 250);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.2);
		
		// yellow circle
		StdDraw.setPenColor(251, 208, 38);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		
	}
}