package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		

		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		double pOne = in.nextDouble();
		double pTwo = in.nextDouble();
		StdDraw.setPenColor(r, g, b);
		
		if (shape .equals ("rectangle")) {
			double pThree = in.nextDouble();
			double pFour = in.nextDouble();
			if (filled) {
				StdDraw.filledRectangle(pOne, pTwo, pThree, pFour);
			} else 
				StdDraw.rectangle(pOne, pTwo, pThree, pFour);
		} 
		if (shape .equals ("ellipse")) {
			double pThree = in.nextDouble();
			double pFour = in.nextDouble();
			if (filled) {
				StdDraw.filledEllipse(pOne, pTwo, pThree, pFour);
			} else 
				StdDraw.ellipse(pOne, pTwo, pThree, pFour);
		}
		if (shape .equals ("triangle")) {
			double pThree = in.nextDouble();
			double pFour = in.nextDouble();
			double pFive = in.nextDouble();
			double pSix = in.nextDouble();
			double [] x = {pOne, pThree, pFive};
			double [] y = {pTwo, pFour, pSix};
			if (filled) {
				StdDraw.filledPolygon(x, y);
			} else
				StdDraw.polygon(x, y);
		} 
	}
}
//(purple outline) ellipse 73 0 146 false 0.5 0.5 0.2 0.2
// (red filled) ellipse 146 0 0 true 0.5 0.5 0.2 0.2
// (black outline) rectangle 0 0 0 false 0.5 0.5 0.2 0.2
// (pink filled) rectangle 255 109 182 true 0.5 0.5 0.2 0.2
// (blue outline) triangle 109 182 255 false 0.2 0.8 0.5 0.6 0.2 0.3
// (green filled) triangle 36 255 36 true 0.1 0.1 0.5 0.9 0.9 0.1