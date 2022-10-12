package studio4;

import java.awt.Color;
import java.io.FileNotFoundException;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) throws FileNotFoundException {
		Color mycolor = new Color(194, 116, 242);
		StdDraw.setPenColor(mycolor);

		StdDraw.picture(.5, .5, "src/studio4/goku.png");

	}
}