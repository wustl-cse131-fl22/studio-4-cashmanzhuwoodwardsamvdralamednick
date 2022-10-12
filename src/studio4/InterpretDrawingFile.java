package studio4;

import java.awt.Color;
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
		Boolean bool = in.nextBoolean();
		double w = in.nextDouble();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();

		Color mycolor = new Color(r, g, b);
		StdDraw.setPenColor(mycolor);
		if(shape.equals("ellipse")) {
			if(bool) {
				StdDraw.filledEllipse(w, x, y, z);
				
			}
			if(!bool) {
				StdDraw.ellipse(w, x, y, z);

			}
			
		}
		if(shape.equals("rectangle")) {
			if(bool) {
				StdDraw.filledRectangle(w, x, y/2, z/2);
			}
			if(!bool) {
				StdDraw.rectangle(w, x, y/2, z/2);

			}
			
		}
		if(shape.equals("triangle")) {
			if(bool) {
				StdDraw.filledRectangle(w, x, y, z);

			}
			if(!bool) {
				StdDraw.rectangle(w, x, y/2, z/2);
			}
			
		}
		
	}
}
