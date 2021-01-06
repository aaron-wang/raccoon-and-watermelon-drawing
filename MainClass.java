import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.awt.*;
//import java.sql.Time;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
//import javax.swing.J
import javax.swing.JFrame;

//project - drawingtesting
//basic drawing
// + random drawing
public class MainClass implements MouseListener, KeyListener{
	static JFrame frame;
	static JFrame debug;
	static MouseListener m = new MainClass();
	static KeyListener k = new MainClass();
//	static ArrayList<String> buffer = new ArrayList<>();
	static Path p = Paths.get("C:\\REMOVED\\src\\xBatch1.txt");
	static Path pY = Paths.get("C:\\REMOVED\\yBatch1.txt");
	
	static ArrayList<int[]> arX = new ArrayList<>();
	static ArrayList<int[]> arY = new ArrayList<>();
//	static int[] tempX;
//	static int[] tempY;
	static ArrayList<ArrayList<Integer>> coordsX = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> coordsY = new ArrayList<>();
	static int iter = 1;
	
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("?");
		
//		String raw = scan.next();
		scan.close();
		
		frame = new JFrame();
		
//		int heightToWeightScale = 3;
		
		frame.setSize(800,580);
		frame.setTitle("Drawing tests");
		frame.setResizable(false);
		
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setAlwaysOnTop(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//uncomment when needed again
		DrawingComponent dc = new DrawingComponent();
		frame.add(dc);
		// frame.addMouseListener(m);
		// frame.addKeyListener(k);
//		BufferedImage = new ImageIO();

//		BufferedImage image = ImageIO.read(new File("U:\\Documents\\fdf.png"));
//		frame.setContentPane();
		
//		JImageComponent ic = new JImageComponent();
//		imagePanel.add(ic);

		// writeToFile(p,"","newline",1);
		// writeToFile(pY,"","newline",1);
		// writeToFile(p, "int[] tempX = {","",1);
		// writeToFile(pY, "int[] tempY = {","",1);

        //march 2
		//ADD DIFF x,y drawing methods
		//Find way to overlay image over, OR set image to background
		//include method in scanner input
		//"batch drawing method"
		//log different batches in the file itself
		//mainly focus on polygon method
		//store points into array list then TO int[]
		//add other parameter
		// (x,y,ID)
		// use ID to alternate colours or something else
		// IDs aren't unique, simply cyclic within and
		// having radix of certain numbers
		// draw (THING) method, so the thing can be drawn multiple
		//times and rotated, or simply just find the best one
		
		//overlay image
		//polygon draw
		//object/thing draw
		//set background before all the drawing comp.
		
		//UNNEEDED
		//FILE WRITING
		// Convert the string to a
	    // byte array.
//
//		for (String str: buffer) {
//		    String fileWritingString = str + "\n";
//			
//		    byte data[] = fileWritingString.getBytes();
//		
//		    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p,CREATE,APPEND))) {
//		      out.write(data, 0, data.length);
//		    } catch (IOException x) {
//		      System.err.println(x);
//		    }
//		    System.out.println("RAN:");
//		}
		//ADD DOWN HERE
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("xbgf");
//		int x = frame.getMousePosition().x;
//		int y = frame.getMousePosition().y;
//		System.out.printf("X:%d Y:%d%n", x,y);
		System.out.println(" " + e.getLocationOnScreen());
		System.out.printf("%d,%d", frame.getMousePosition().x,frame.getMousePosition().y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void writeToFile(Path p, String str, String separator, int iterator) {
		String sep = "";
		if (separator.equals("newline") || iterator % 10 == 0) {
			sep = System.getProperty("line.separator");
			if (iterator % 10 == 0) {
				sep = "," + System.getProperty("line.separator");
			}
		}
		else {
			sep = separator;
		}
		String fileWritingString = str + sep;
		
	    byte data[] = fileWritingString.getBytes();
	
	    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p,CREATE,APPEND))) {
	      out.write(data, 0, data.length);
	    } catch (IOException e23434) {
	      System.err.println(e23434);
	    }
	    
	    System.out.println("WROTE TO FILE\n");
	}
// KEY BOARD 
	@Override
	public void keyPressed(KeyEvent e) {
		// store positions in buffer
		//include heading and footing at end of file writing
		
		try {
			System.out.println("key event ran");
			int x = frame.getMousePosition().x;
			int y = frame.getMousePosition().y;
			
			int offsetX = 0;
			int offsetY = -25;
			
			//check offset on home computer
			
			x+= offsetX;
			y+= offsetY;
			
//			buffer.add(x + "," + y);
			System.out.printf("X:%d Y:%d%n", x,y);
			
			int absX = frame.getX();
			int absY = frame.getY();
			
			System.out.printf("Frame: X: %d, Y: %d%n",absX,absY);
			
			
			//insert different method prefixes
			//string array here
			
			//WRITING
//			String str = "unnamedMethod(" + x + "," + y + ");";
			String strX = "" + x;
			String strY = "" + y;
			
//			for poly
			//X writing
//			String fsd = System.getProperty("line.separator");
//			String fsd = ", ";
//			String fileWritingStringX = strX + fsd;
//			
//		    byte data[] = fileWritingStringX.getBytes();
//		
//		    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p,CREATE,APPEND))) {
//		      out.write(data, 0, data.length);
//		    } catch (IOException e23434) {
//		      System.err.println(e23434);
//		    }
//		    
//		    System.out.println("WROTE TO FILE\n");
		    // writeToFile(p, strX, ", ", iter);
		    
		    //Y writing
//		    String fsd = System.getProperty("line.separator");
//			String fileWritingStringY = strY + fsd;
//			
//		    byte data2[] = fileWritingStringY.getBytes();
//		
//		    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p2,CREATE,APPEND))) {
//		      out.write(data2, 0, data2.length);
//		    } catch (IOException e23434) {
//		      System.err.println(e23434);
//		    }
//		    
//		    System.out.println("WROTE TO FILE\n");
		    // writeToFile(pY,strY, ", ", iter);
		    iter++;
		    
		} catch (NullPointerException e2) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class DrawingComponent extends JComponent {
	
	class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public void paintComponent(Graphics g) {
//		g.fillRect(10, 10, 50, 50);
//		g.drawOval(120,120,40,40);
//		drawCircles(g, 250,250,125);
		//OLD CODE BEGIN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		g.fillArc(240, 240, 100, 50, 25, 245);
		g.setColor(Color.black);
//		g.drawString("Text", 250, 450);
		int f = (int) (Math.random() * 10);
//		
//		int complexN = 15;
		int complexN = 0;
		int polyPoints = 3;
		
//		double decay = 0.98;
		double decay = .95;
		
		//random polygon placement
//		for (int i = 0; i < xpoints.length; i++) {
//			int r = (int) (Math.random() * MainClass.frame.getWidth() * 1.1);
//			xpoints[i] = r;
//			r = (int) (Math.random() * MainClass.frame.getHeight() * 0.9);
//			ypoints[i] = r;
//		}
		
		LinkedList<Point> prevTwoPoints = new LinkedList<>();
		ArrayList<Point[]> totalPoints = new ArrayList<>();
		
		
		//NEW MAR
//			int[] coolX = {422, 516, 306, 561, 705, 740, 569, 679};
//			int[] coolY = {91, 139, 184, 335, 278, 450, 458, 380};
			int[] coolX = {422, 516, 306, 561};
			int[] coolY = {91, 139, 184, 335};
			//NEW MAR
			//comment out here to disable
//			complexN = coolX.length;
		
		for (int i = 0; i < complexN; i++) {
			totalPoints.add(new Point[polyPoints]);
		}
//		prevTwoPoints.add(new Point((int) (300 * decay),(int) (decay * 20)));
//		prevTwoPoints.add(new Point((int) (30 * decay),(int) (decay * 234)));
		
		//initialize first two points
		for (int i = 0; i < polyPoints - 1; i++) {
			//KEEP MAR
//			int firstX = (int) Math.floor(Math.random() * MainClass.frame.getWidth() * decay);
//			int firstY = (int) Math.floor(Math.random() * MainClass.frame.getHeight() * decay * 0.9);
			int firstX = 0;
			int firstY = 0;
			//KEEP MAR
			prevTwoPoints.add(new Point((int) (firstX),((int) (firstY))));
		}
		//creating triangles placement
		
		int xR, yR;
		for (int i = 0; i < complexN; i++) {
			//KEEP MAR
//			xR = (int) Math.floor(Math.random() * MainClass.frame.getWidth() * decay);
//			yR = (int) Math.floor(Math.random() * MainClass.frame.getHeight() * decay * 0.9);
			xR = coolX[i];
			yR = coolY[i];
			//KEEP MAR
			//end of array
			totalPoints.get(i)[polyPoints - 1] = new Point(xR,yR);
//			totalPoints.get(i)[2] = prevTwoPoints.get(2); if 3
//			totalPoints.get(i)[1] = prevTwoPoints.get(1);
//			totalPoints.get(i)[0] = prevTwoPoints.get(0);
			for (int j = 0; j < polyPoints - 1; j++) {
				totalPoints.get(i)[j] = prevTwoPoints.get(j);
			}
			
			if (prevTwoPoints.size() >= polyPoints) {
				prevTwoPoints.pop();
			}
			prevTwoPoints.add(new Point(xR, yR));
		}
//		for (int i = 0; i < complexN; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(totalPoints.get(i)[j].x +","+ totalPoints.get(i)[j].y);
//			}
//			System.out.println("...");
//		}
		Color newC = new Color(75, 227, 219);
		Color newC1 = new Color(89,117,140);
		Color newRed = new Color(215, 117, 140);
		Color newGreen = new Color(75, 206, 140);
		Color newPurple= new Color(128, 100, 234);
		
		Color[] c = {newC1,newGreen,newRed,newC,newPurple};
		
		for (int i = 0; i < totalPoints.size(); i++) {
//			int[] x = totalPoints.get(i)[0];
			int[] x = new int[polyPoints];
			int[] y = new int[polyPoints];
			for (int j = 0; j < polyPoints; j++) {
//				System.out.println(x[j]);
//				System.out.println(totalPoints.get(i)[j].x);
				x[j] = totalPoints.get(i)[j].x;
//				System.out.println(totalPoints.get(i));
				y[j] = totalPoints.get(i)[j].y;
			}
			g.setColor(c[i%c.length]);
			
			g.fillPolygon(x,y,polyPoints);
			g.setColor(Color.black);
			g.drawPolygon(x,y,polyPoints);
		}
		
//		for (int i = 1; i <= 8; i++) {
//			int random = (int) (Math.random() * c.length);
//			g.setColor(c[random]);
//			g.fillArc(i*50, i*50, 50, 50, random*10, random*45);
//		}
//		g.setColor(Color.black);
		
//		g.fillPolygon(xpoints,ypoints,nPolygon);
		
		ArrayList<int[]> arX = new ArrayList<>();
		ArrayList<int[]> arY = new ArrayList<>();
		
		//OLD CODE - END >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		//Begin actual - mar 9
		
//int[] tempY_RECT = {234, 249, 250, 251, 252, 252, 253, 254, 255, 256,
//257, 258, 259, 261, 263, 267, 269, 271, 273, 275,
//277, 279, 281, 284, 286, 288, 289, 292, 294, 295,
//296, 298, 300, 301, 303, 304, 304, 305, 307, 308,
//309, 310, 311, 312, 312, 312, 313, 313, 313, 313,
//313, 313, 314, 314, 314, 314, 314, 314, 314, 314,
//314, 314, 314, 314, 314, 314, 314, 314, 314, 314,
//314, 314, 314, 314, 314, 314, 314, 314, 314, 314,
//314, 314, 314, 314, 314, 314, 314, 314, 314, 314,
//314, 314, 314, 314, 314, 314, 314, 314, 314, 314,
//314, 314, 313, 313, 313, 311, 311, 310, 309, 309,
//308, 306, 306, 305, 302, 300, 300, 299, 299, 298,
//297, 296, 294, 292, 290, 289, 286, 285, 283, 282,
//281, 280, 277, 275, 274, 273, 270, 268, 267, 265,
//261, 258, 257, 256, 255, 253, 252, 251, 250, 250,
//247, 245, 243, 241, 239, 238, 236, 235, 234, 234,
//233, 232, 231, 231, 230, 230, 230, 230, 230, 230,
//230, 230, 230, 230, 230, 230, 230, 230, 230, 230,
//229, 229, 228, 228, 228, 228, 228, 228, 228, 228,
//227, 226, 226, 226, 226, 226, 226, 226, 226, 226,
//225, 225, 225, 225, 225, 225, 225, 225, 225, 225,
//225, 225, 225, 225, 225, 225, 225, 225, 225, 225,
//225};
//
//int[] tempX_RECT = {355, 354, 354, 354, 353, 353, 353, 353, 353, 353,
//		353, 353, 353, 353, 353, 353, 353, 352, 352, 352,
//		352, 352, 352, 352, 352, 352, 352, 353, 354, 355,
//		355, 356, 356, 356, 357, 357, 357, 358, 359, 360,
//		361, 361, 362, 363, 363, 363, 364, 365, 365, 366,
//		368, 369, 370, 371, 373, 374, 377, 380, 382, 383,
//		385, 387, 388, 389, 390, 392, 395, 399, 399, 399,
//		401, 403, 404, 408, 412, 413, 415, 416, 419, 422,
//		425, 426, 426, 428, 429, 431, 433, 434, 435, 437,
//		438, 439, 440, 442, 442, 442, 443, 444, 446, 446,
//		447, 448, 448, 449, 450, 450, 451, 451, 451, 451,
//		452, 452, 452, 454, 457, 458, 458, 458, 459, 459,
//		459, 459, 459, 459, 459, 459, 459, 459, 459, 459,
//		459, 459, 459, 459, 459, 459, 460, 460, 460, 460,
//		460, 460, 460, 460, 460, 460, 460, 460, 460, 460,
//		460, 460, 460, 460, 460, 460, 459, 458, 458, 458,
//		458, 457, 457, 457, 457, 456, 456, 456, 455, 454,
//		452, 450, 449, 448, 447, 446, 443, 442, 442, 438,
//		435, 432, 432, 430, 426, 424, 423, 422, 420, 419,
//		415, 410, 408, 405, 403, 401, 400, 398, 394, 392,
//		389, 385, 383, 381, 380, 378, 375, 372, 370, 369,
//		367, 364, 362, 362, 362, 362, 362, 362, 362, 362,
//		362};
//Polygon trace3 = new Polygon(tempX_RECT,tempY_RECT,tempX_trace2.length);
//g.setColor(newGreen);
////trace3.translate(0, -25);
//
////offset for each to avoid data errors
//g.drawPolygon(trace3);
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		//SKY GRADIENT - MAR 9 place ALT
		Color lightestBlue = new Color(204, 230, 255);
		Color lightBlue = new Color(179, 217, 255);
		Color skyBlue = new Color(153, 204, 255);
		Color lightRed = new Color(255, 179, 179);
		Color midRed = new Color(255, 77, 77);
		Color midPurple = new Color(166, 77, 255);
		Color darkerPurple = new Color(121, 77, 255);
		Color darkBlue = new Color(24, 0, 102);
		Color grassGreen = new Color(0, 153, 51);
		//sky gradient  - MAR 9
		Graphics2D g2 = (Graphics2D) g;
		Color backBlue = new Color(230, 243, 255);
		GradientPaint skyGrad = new GradientPaint(0,550,lightBlue,800,0,skyBlue);
		g2.setPaint(skyGrad);
		g2.fill(new Rectangle2D.Double(0,0,800,550));
		
		//grass
		grassGreen = new Color(128, 255, 168);
		GradientPaint grassGrad = new GradientPaint(0,400,newGreen,800,550,grassGreen);
		g2.setPaint(grassGrad);
		g2.fill(new Rectangle2D.Double(0,400,800,550));
		
		
		//mar 9 - move to bottom
//				Image background1 = Toolkit.getDefaultToolkit().getImage(
//				g.drawImage(background1,400,-100,this);
				//Mar 9 - place mar 8 version after text^^^
		Color newBrown = new Color(217, 179, 140);
		//rectangle containing text
		//supplement
		//darker brown
		g.setColor(new Color(172, 115, 57)); //colour match MAR 9
		g.fillRect(125,-1,10,30);
		g.setColor(Color.black);
		g.drawRect(125,-1,10,30);
		//Main
		g.setColor(newBrown);
		g.fillRect(15, 15, 250, 75);
		
		g.setColor(Color.black);
		g.drawRect(15, 15, 250, 75);
		
		//TEXT in rectangle
		g.setFont(new Font("Calibri",Font.BOLD,18));
		g.setColor(Color.black);
		g.drawString("This sign is alive", 30, 40);
		if (MainClass.iter > 7) {
			g.drawString(":)", 30, 60);			
		}
		else {
			g.drawString(":D", 30, 60);			
		}
		g.setFont(new Font("Tahoma",Font.ITALIC,12));
		g.drawString("however, I can't move :/", 30, 80);
		
		//match to background MAR 9
		
		//oval MAR 9
		int speechX = 400;
		int speechY = 50;
		g.setColor(lightRed);
		g.fillOval(speechX, speechY, 215, 75);
		g.setColor(Color.black);
		g.drawOval(speechX, speechY, 215, 75);
		//FIX to original red/contrast colour
		// in mar 8 version
		
		//text in oval
		g.setFont(new Font("Comic sans MS",Font.BOLD,14));
		g.setColor(darkerPurple);
		g.drawString("Why are the watermelon",speechX + 20,speechY + 35);
		
		if (MainClass.iter < 10 + (int) (Math.random() * 2) + 1) g.drawString("seeds alive??",speechX + 20,speechY + 50);
		else g.drawString("seeds alive?",speechX + 20,speechY + 50);
		
		g.setColor(Color.black);
		g.setColor(Color.white);
		if (MainClass.iter % 10 != 0) g.fillOval(542, 182, 8, 8);
		if (MainClass.iter % 10 != 2) g.fillOval(530, 167, 10, 10);
		if (MainClass.iter % 10 != 4) g.fillOval(517, 152, 12, 12);
		if (MainClass.iter % 10 != 7) g.fillOval(505, 133, 15, 15);
		
		//mar 9 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		//Bottom black rectangle
		g.setColor(new Color (51, 26, 0));
		g.fillRect(20, 510, 200, 100);
		g.setColor(Color.black);
		g.drawRect(20, 510, 200, 100);
		//text in black rectangle
		Color orangeBrown = new Color(204, 102, 0);
		g.setColor(orangeBrown);
		g.setFont(new Font("courier", Font.ITALIC,16));
		g.drawString("Melancholy Mischief", 25, 525);
		
//		font list V
//		https://alvinalexander.com/blog/post/jfc-swing/swing-faq-list-fonts-current-platform
		
		//PLATE
		//plate bottom
		int[] tempX = {67, 67, 67, 67, 67, 67, 67, 67, 67, 67,
				67, 67, 68, 68, 69, 69, 70, 73, 74, 76,
				77, 77, 79, 80, 83, 88, 90, 92, 94, 96,
				98, 100, 103, 107, 110, 113, 117, 119, 122, 125,
				130, 135, 136, 138, 141, 144, 147, 153, 157, 160,
				163, 165, 165, 166, 169, 171, 174, 178, 182, 188,
				191, 194, 197, 199, 201, 203, 205, 209, 211, 214,
				217, 220, 224, 227, 232, 239, 247, 249, 251, 255,
				257, 260, 263, 269, 274, 276, 276, 276, 282, 287,
				288, 288, 289, 291, 292, 293, 296, 297, 300, 301,
				301, 304, 307, 309, 310, 312, 314, 314, 316, 318,
				318, 319, 320, 323, 326, 327, 329, 329, 331, 333,
				335, 337, 338, 339, 341, 342, 343, 344, 345, 345,
				346, 346, 346, 346, 346, 348, 348, 348, 348, 348,
				348, 348, 348}; 
		int[] tempY = {468, 468, 468, 469, 470, 471, 473, 474, 474, 474,
				475, 476, 477, 478, 479, 483, 488, 494, 499, 502,
				504, 505, 506, 508, 511, 514, 516, 517, 518, 519,
				520, 520, 520, 521, 521, 521, 521, 521, 521, 521,
				521, 522, 523, 523, 523, 523, 525, 525, 526, 527,
				527, 527, 527, 527, 528, 528, 528, 528, 529, 530,
				530, 530, 530, 530, 530, 530, 530, 530, 530, 530,
				529, 529, 529, 529, 529, 529, 529, 529, 529, 529,
				529, 529, 529, 529, 529, 529, 529, 529, 529, 528,
				528, 528, 528, 526, 526, 525, 525, 524, 523, 522,
				522, 521, 520, 518, 517, 516, 514, 513, 512, 510,
				510, 509, 508, 505, 503, 502, 500, 498, 497, 494,
				491, 488, 486, 484, 483, 480, 477, 474, 473, 471,
				469, 469, 468, 468, 466, 462, 462, 462, 462, 462,
				462, 462, 462};
		//		g.drawPolygon(MainClass.tempX, MainClass.tempY,MainClass.tempX.length);
		Polygon plateBottom = new Polygon(tempX, tempY, tempX.length);
		translatePoly(plateBottom, 0, 25);
		g.setColor(new Color(200,200,200));
		g.fillPolygon(plateBottom);
		g.setColor(Color.black);
		g.drawPolygon(plateBottom);
//				g.drawPolygon(tempX, tempY,tempX.length);
		
		// BLACK triangle
//				int[] tempX1 = {224, 85, 383};
//				int[] tempY1 = {180, 345, 350}; 
//				Polygon triangle = new Polygon(tempX1,tempY1,tempX1.length);
//				g.drawPolygon(triangle);
//				g.fillPolygon(triangle);
		
		
		//DRAW MELON >>>>>>>>>>>>>>>>>>>>>
		
		//plate top
//		g.setColor(Color.black);
//		g.drawOval(24,378,350,100);
		int msd = 180;
		g.setColor(new Color(msd,msd,msd));
		g.fillOval(25, 378, 350, 100);
		g.setColor(Color.black);
		g.drawOval(25, 378, 350, 100);
		
		//green watermelon back
		//change watermelon green
		g.setColor(newGreen);
		g.fillArc(60, 160, 300,300, 222, 95);
		
		//RED triangle arc
		g.setColor(new Color(230,0,0));
		g.fillArc(60, 150, 300,300, 225, 90);
		
		//outline red to green base
		g.setColor(Color.black);
		g.drawArc(60, 150, 300,300, 225, 90);
		
		//watermelon seeds
		for (int i = 0; i < 15; i++) {
			int randX = (int) (Math.random() * 90); 
			int randY = (int) (Math.random() * 75);
			int randStart = (int) (Math.random() * 180);
			g.fillArc(150 + randX, 340 + randY,25,25,randStart + 180,36);
			
		}
	
		
		//END WATERMELON >>>>>>>>>>>>>>>>>>
		
		//Rough pentagon outline
//		int[] tempX2 = {418, 428, 523, 725, 768, 739, 570};
//		int[] tempY2 = {147, 328, 422, 427, 274, 172, 34};
//		Polygon heptagon = new Polygon(tempX2,tempY2,tempX2.length);
//		g.drawPolygon(heptagon);
//				Polygon poly1 = new Polygon(tempX,tempY,tempX.length)
		
		//raccoon outline
		
		
		
		
		//VVV
		//TRACING - ORIGINAL (pre Mar 9)
		//move background tracing to back 
//				Image background = Toolkit.getDefaultToolkit().getImage(
//						"U:\\Documents\\raccoon1ALT.png");
//				g.drawImage(background,350,-100,this);
		
		///Keep ^
		//move this (V) before text and after melon
		//Mar 8 here VV
		
		//Mar 8 ^^

		int[] tempXbody = {662, 662, 662, 662, 659, 655, 654, 654, 654, 654,
				654, 652, 647, 644, 642, 640, 637, 635, 633, 630,
				628, 626, 623, 620, 617, 615, 613, 611, 609, 607,
				606, 603, 602, 600, 598, 596, 594, 592, 590, 588,
				586, 583, 581, 579, 577, 575, 572, 570, 567, 565,
				563, 560, 558, 555, 552, 548, 546, 544, 543, 541,
				538, 537, 535, 533, 531, 529, 527, 527, 526, 525,
				523, 522, 520, 520, 518, 516, 514, 512, 511, 510,
				508, 506, 504, 502, 500, 498, 496, 493, 491, 489,
				488, 487, 486, 485, 484, 483, 481, 479, 479, 478,
				478, 477, 477, 476, 476, 475, 475, 475, 475, 475,
				475, 474, 474, 473, 473, 472, 472, 471, 470, 469,
				469, 468, 467, 467, 466, 466, 464, 463, 462, 460,
				459, 458, 456, 455, 453, 452, 450, 449, 448, 447,
				446, 445, 443, 442, 441, 440, 439, 439, 439, 439,
				439, 439, 439, 439, 440, 440, 440, 440, 441, 441,
				442, 442, 444, 445, 447, 450, 452, 454, 457, 461,
				463, 466, 470, 473, 476, 479, 481, 483, 485, 487,
				489, 492, 494, 495, 499, 501, 503, 506, 508, 509,
				511, 512, 513, 515, 516, 517, 517, 517, 517, 517,
				517, 517, 517, 517, 517, 518, 518, 518, 519, 520,
				520, 522, 522, 524, 525, 526, 527, 528, 530, 533,
				535, 537, 540, 542, 543, 545, 545, 546, 547, 548,
				549, 551, 551, 552, 553, 555, 555, 556, 556, 557,
				557, 557, 556, 555, 555, 554, 554, 554, 553, 553,
				553, 553, 553, 554, 555, 557, 558, 559, 560, 561,
				562, 563, 564, 565, 566, 567, 568, 569, 569, 570,
				570, 571, 571, 571, 571, 572, 573, 575, 578, 581,
				584, 586, 588, 590, 592, 594, 597, 599, 602, 604,
				605, 606, 607, 608, 609, 610, 611, 611, 618, 633,
				633, 633, 634, 634, 634, 635, 635, 636, 637, 637,
				638, 639, 640, 642, 643, 645, 646, 648, 649, 650,
				652, 654, 656, 657, 660, 662, 663, 664, 664, 665,
				666, 667, 668, 670, 670, 671, 673, 673, 674, 675,
				676, 677, 678, 680, 681, 682, 684, 685, 686, 687,
				687, 688, 690, 692, 692, 693, 695, 696, 698, 700,
				702, 704, 706, 708, 709, 712, 713, 714, 716, 716,
				717, 719, 720, 721, 723, 724, 725, 726, 728, 728,
				729, 730, 731, 731, 731, 733, 734, 738, 752, 755,
				755, 755, 756, 757, 758, 759, 761, 765, 768, 769,
				770, 772, 774, 774, 775, 777, 778, 780, 782, 784,
				785, 787, 789, 791, 792, 793, 794, 795, 796, 796,
				797, 797, 797, 797, 797, 797, 797, 798, 798, 798,1000};

				int[] tempYbody = {120, 120, 120, 120, 120, 120, 120, 120, 120, 120,
				120, 120, 120, 120, 120, 120, 120, 120, 121, 122,
				123, 124, 125, 127, 128, 129, 130, 131, 132, 133,
				134, 135, 136, 137, 138, 139, 140, 141, 142, 143,
				144, 146, 147, 148, 149, 151, 153, 154, 156, 157,
				159, 161, 163, 165, 168, 171, 173, 174, 176, 178,
				180, 181, 183, 185, 187, 190, 192, 193, 194, 197,
				198, 201, 202, 203, 206, 209, 212, 215, 216, 219,
				221, 225, 228, 231, 235, 239, 242, 246, 250, 255,
				258, 261, 264, 267, 272, 275, 281, 285, 288, 292,
				295, 298, 303, 306, 312, 318, 323, 330, 334, 338,
				341, 344, 347, 349, 352, 355, 360, 364, 370, 374,
				378, 382, 385, 388, 391, 395, 399, 403, 407, 411,
				414, 418, 423, 428, 433, 436, 439, 442, 445, 448,
				452, 455, 459, 464, 469, 472, 476, 478, 480, 482,
				486, 488, 490, 493, 495, 497, 499, 500, 502, 503,
				503, 505, 506, 507, 509, 511, 511, 512, 514, 514,
				514, 514, 514, 514, 514, 513, 512, 511, 511, 510,
				510, 510, 509, 509, 509, 508, 508, 507, 506, 505,
				504, 502, 500, 498, 496, 494, 492, 490, 489, 487,
				485, 484, 482, 479, 477, 475, 472, 469, 467, 463,
				461, 457, 454, 450, 448, 445, 442, 439, 435, 431,
				429, 425, 421, 419, 418, 416, 416, 416, 416, 416,
				416, 417, 418, 418, 420, 422, 424, 426, 428, 431,
				433, 436, 439, 442, 445, 447, 449, 452, 454, 457,
				461, 463, 466, 470, 474, 477, 480, 483, 485, 488,
				490, 493, 495, 498, 501, 504, 507, 510, 511, 513,
				513, 514, 514, 514, 514, 515, 516, 517, 519, 520,
				521, 522, 522, 522, 522, 522, 522, 521, 521, 520,
				520, 520, 520, 520, 520, 520, 520, 520, 520, 502,
				499, 497, 495, 494, 490, 488, 486, 484, 481, 479,
				478, 475, 471, 469, 466, 463, 460, 457, 456, 453,
				450, 447, 445, 442, 438, 436, 434, 433, 432, 431,
				429, 428, 426, 424, 423, 421, 419, 418, 418, 416,
				415, 413, 411, 410, 409, 408, 406, 406, 406, 405,
				405, 405, 404, 403, 403, 403, 402, 402, 401, 400,
				400, 400, 399, 399, 399, 399, 399, 399, 399, 399,
				399, 399, 399, 399, 399, 399, 399, 400, 400, 401,
				401, 402, 402, 402, 403, 404, 405, 407, 411, 411,
				412, 412, 412, 413, 414, 416, 418, 422, 424, 425,
				426, 429, 431, 432, 433, 436, 440, 443, 447, 451,
				454, 457, 460, 465, 466, 467, 470, 472, 474, 475,
				476, 476, 476, 476, 478, 478, 478, 479, 479, 479,150};

				Polygon body = new Polygon(tempXbody,tempYbody,tempXbody.length);
				body.translate(40, 0);
				g.setColor(Color.white);
				//rFace2.translate(0,0);
				int nds = 110;
				//g.drawPolygon(faceNose);
				g.setColor(new Color(nds,nds,nds));
				g.fillPolygon(body);
				g.setColor(Color.black);
				g.drawPolygon(body);
		
int[] tempXear = {617, 619, 620, 620, 622, 623, 624, 625, 626, 627,
628, 629, 629, 631, 632, 634, 636, 637, 639, 643,
645, 645, 645, 649, 651, 653, 655, 658, 660, 662,
665, 666, 668, 669, 670, 673, 675, 676, 678, 680,
680, 680, 681, 684, 686, 688, 689, 690, 691, 692,
693, 693, 693, 692, 691, 691, 690, 690, 689, 688,
688, 687, 687, 686, 685, 685, 684, 684, 683, 682,
682, 681, 680, 679, 678, 677, 676, 675, 674, 673,
672, 671, 671, 669, 668, 668, 668, 668, 666, 666,
666, 666, 666, 666, 663, 661, 661, 661, 661, 498,
498, 490, 490, 487, 485, 485, 485, 485, 485, 485,
485, 485, 482, 478, 475, 474, 474, 474, 474, 471,
469, 468, 468, 467, 465, 463, 463, 463, 463, 462,
462, 461, 461, 461, 461, 461, 461, 461, 461, 461,
461, 461, 461, 462, 462, 463, 464, 465, 465, 465,
465, 465, 466, 468, 469, 471, 472, 474, 475, 476,
477, 479, 480, 481, 482, 483, 483, 484, 485, 486,
487, 488, 489, 490, 490, 491, 493, 494, 495, 497,
498, 499, 501, 501, 501, 501, 502, 503, 504, 505,
506, 507, 508, 509, 509, 509, 510, 510, 511, 512,
512, 513, 513, 513, 514, 514, 514, 514, 514, 514,
514, 515, 515, 515, 515, 515, 515, 515};


int[] tempYear = {206, 199, 199, 198, 196, 194, 193, 192, 191, 190,
189, 188, 188, 187, 185, 184, 183, 183, 182, 181,
181, 181, 181, 181, 181, 181, 181, 181, 181, 181,
181, 181, 181, 181, 181, 181, 181, 181, 181, 182,
182, 182, 183, 186, 188, 189, 191, 192, 194, 196,
198, 200, 203, 206, 209, 212, 214, 215, 216, 217,
218, 220, 221, 223, 224, 226, 228, 230, 232, 234,
236, 238, 239, 240, 241, 241, 242, 243, 243, 243,
243, 244, 244, 244, 245, 245, 245, 245, 245, 245,
245, 245, 245, 245, 246, 246, 246, 246, 246, 212,
209, 199, 199, 196, 194, 194, 194, 194, 194, 194,
194, 194, 191, 189, 186, 186, 186, 186, 186, 183,
181, 180, 180, 179, 176, 174, 173, 173, 173, 171,
169, 167, 165, 164, 161, 159, 158, 156, 155, 154,
152, 151, 150, 149, 148, 146, 146, 145, 145, 145,
145, 145, 145, 145, 145, 145, 145, 145, 145, 145,
146, 146, 146, 147, 147, 148, 148, 149, 150, 151,
152, 154, 155, 156, 157, 158, 160, 161, 163, 164,
166, 168, 169, 170, 170, 170, 172, 174, 175, 176,
178, 180, 182, 182, 183, 183, 184, 185, 186, 188,
190, 191, 192, 193, 193, 195, 196, 196, 196, 196,
196, 198, 198, 198, 198, 198, 198, 198};
Polygon faceEar = new Polygon(tempXear,tempYear,tempXear.length);
g.setColor(new Color(64,64,64));
g.fillPolygon(faceEar);
g.setColor(Color.black);
g.drawPolygon(faceEar);


int[] tempXRFace2 = {588, 588, 584, 581, 581, 581, 581, 580, 575, 572,
572, 571, 569, 565, 562, 556, 554, 554, 554, 550,
542, 539, 539, 539, 539, 539, 533, 526, 524, 524,
524, 523, 518, 517, 515, 512, 509, 509, 508, 508,
506, 505, 502, 500, 499, 496, 496, 496, 496, 496,
496, 494, 494, 494, 493, 493, 493, 491, 491, 491,
491, 491, 490, 488, 488, 487, 487, 487, 485, 485,
485, 484, 484, 484, 482, 482, 482, 481, 481, 481,
481, 481, 481, 481, 481, 481, 481, 481, 481, 481,
481, 481, 481, 481, 481, 481, 479, 479, 479, 479,
478, 478, 478, 476, 476, 476, 475, 473, 473, 472,
470, 470, 469, 467, 467, 466, 466, 466, 464, 464,
463, 463, 463, 463, 464, 464, 465, 465, 467, 467,
468, 468, 468, 470, 471, 473, 474, 474, 476, 477,
479, 479, 479, 482, 485, 486, 486, 488, 489, 491,
494, 497, 500, 501, 504, 507, 512, 515, 519, 522,
525, 528, 531, 534, 539, 543, 545, 546, 549, 554,
557, 561, 564, 567, 569, 570, 572, 575, 575, 576,
579, 584, 587, 588, 590, 590, 591, 591, 593, 594,
597, 602, 606, 609, 611, 614, 617, 620, 621, 621,
626, 629, 632, 635, 638, 644, 647, 651, 654, 657,
660, 663, 666, 669, 671, 674, 677, 678, 681, 683,
686, 687, 690, 692, 693, 696, 698, 699, 701, 702,
704, 705, 707, 707, 707, 707, 707, 706, 706, 706,
706, 704, 704, 704, 704, 704, 704, 704, 704, 703,
703, 703, 703, 701, 701, 701, 700, 698, 697, 695,
695, 695, 694, 692, 692, 691, 689, 688, 688, 688,
686, 685, 683, 683, 683, 682, 680, 680, 679, 677,
674, 671, 671, 670, 668, 667, 664, 662, 661, 659,
656, 655, 653, 652, 650, 649, 646, 644, 643, 641,
640, 635, 632, 631, 626, 622, 622, 622, 620, 614,
611, 611, 611, 608, 607, 607, 607, 605, 602, 601,
601, 601, 601};

int[] tempYRFace2 = {195, 195, 195, 195, 195, 195, 195, 195, 195, 195,
195, 195, 195, 195, 195, 195, 195, 195, 195, 195,
194, 194, 194, 194, 194, 194, 192, 192, 192, 192,
192, 192, 193, 193, 193, 195, 195, 196, 198, 198,
199, 199, 201, 202, 204, 205, 205, 205, 205, 205,
208, 210, 211, 213, 214, 216, 219, 220, 223, 223,
225, 226, 231, 232, 235, 237, 238, 240, 241, 243,
244, 247, 250, 253, 256, 259, 262, 265, 268, 270,
271, 274, 277, 279, 282, 285, 286, 289, 292, 295,
297, 297, 298, 300, 301, 303, 304, 306, 306, 309,
309, 310, 312, 313, 315, 318, 319, 321, 324, 325,
327, 328, 330, 331, 334, 336, 336, 337, 340, 342,
345, 346, 348, 348, 351, 355, 358, 361, 363, 364,
366, 367, 367, 369, 370, 372, 373, 375, 375, 376,
378, 378, 378, 379, 379, 380, 381, 381, 381, 381,
382, 382, 382, 382, 382, 382, 382, 382, 382, 382,
381, 381, 381, 381, 381, 381, 380, 380, 380, 378,
378, 377, 376, 375, 374, 374, 374, 372, 371, 371,
369, 368, 366, 365, 365, 365, 365, 365, 365, 365,
365, 365, 365, 363, 363, 363, 363, 363, 363, 363,
363, 363, 362, 363, 363, 363, 363, 362, 362, 360,
360, 359, 357, 356, 354, 353, 351, 350, 348, 347,
345, 344, 344, 342, 341, 339, 339, 338, 336, 335,
335, 333, 330, 329, 327, 324, 321, 318, 315, 312,
311, 308, 306, 303, 302, 300, 299, 297, 294, 293,
291, 290, 287, 284, 284, 281, 279, 278, 276, 275,
275, 273, 272, 270, 269, 266, 264, 263, 263, 263,
261, 258, 257, 257, 257, 255, 254, 254, 252, 251,
248, 246, 245, 243, 242, 240, 237, 236, 234, 233,
230, 228, 227, 224, 222, 221, 218, 218, 216, 215,
213, 212, 210, 209, 207, 206, 206, 206, 204, 201,
201, 201, 201, 200, 198, 198, 198, 198, 198, 198,
198, 198, 198};
Polygon rFace2 = new Polygon(tempXRFace2,tempYRFace2,tempXRFace2.length);
//rFace2.translate(0,0);
g.setColor(Color.gray);
//g.drawPolygon(rFace2);
 nds = 160;
g.setColor(new Color(nds, nds,nds));
g.fillPolygon(rFace2);

int[] tempXmask = {501, 501, 500, 500, 500, 500, 499, 499, 499, 499,
499, 499, 497, 496, 496, 495, 495, 495, 495, 495,
495, 494, 493, 492, 491, 491, 490, 489, 489, 488,
488, 487, 486, 486, 485, 485, 485, 485, 485, 485,
485, 485, 485, 485, 485, 485, 485, 485, 485, 485,
485, 485, 485, 484, 484, 484, 484, 484, 484, 484,
484, 484, 484, 485, 485, 485, 486, 486, 487, 488,
490, 490, 490, 490, 491, 491, 491, 492, 492, 494,
494, 495, 496, 497, 497, 499, 500, 501, 502, 504,
505, 506, 507, 509, 509, 511, 512, 513, 514, 515,
515, 515, 517, 518, 519, 520, 520, 522, 523, 523,
524, 525, 526, 527, 528, 529, 531, 533, 535, 536,
536, 538, 540, 541, 543, 545, 547, 548, 548, 549,
551, 552, 554, 555, 557, 558, 559, 560, 562, 564,
564, 566, 568, 570, 571, 573, 575, 576, 577, 579,
579, 580, 581, 582, 583, 585, 587, 589, 590, 592,
593, 595, 597, 598, 600, 603, 604, 606, 608, 609,
611, 613, 615, 616, 617, 618, 620, 620, 621, 623,
624, 626, 627, 627, 628, 629, 630, 630, 631, 632,
632, 633, 633, 633, 633, 633, 634, 634, 634, 634,
634, 635, 635, 635, 635, 635, 635, 635, 635, 634,
634, 633, 633, 633, 632, 631, 631, 630, 630, 630,
629, 629, 628, 628, 626, 625, 625, 624, 624, 623,
622, 621, 620, 619, 619, 618, 616, 615, 614, 613,
613, 611, 610, 609, 607, 605, 604, 603, 602, 601,
600, 600, 599, 597, 597, 597, 595, 595, 594, 593,
591, 591, 590, 590, 588, 588, 588, 585, 585, 583,
582, 582, 582, 581, 579, 578, 576, 576, 576, 575,
574, 574, 573, 572, 571, 571, 571, 570, 569, 568,
567, 567, 565, 564, 564, 562, 561, 560, 560, 560,
558, 558, 558, 556, 556, 556, 555, 554, 553, 553,
551, 551, 550, 549, 549, 549, 548, 547, 546, 545,
543, 542, 540, 539, 539, 538, 536, 535, 534, 534,
534, 534, 532, 531, 530, 530, 529, 528, 528, 527,
526, 526, 525, 525, 525, 525, 525, 525, 525, 524,
524, 524, 524, 524, 524, 523, 521, 520, 519, 519,
519, 515, 515, 515, 515, 515, 515, 515, 515, 515,
515, 515, 515, 513, 511, 510, 509, 509, 509, 509,
509, 509, 509, 509, 506, 504, 503, 502, 501, 500,
500, 500, 500, 500, 500, 500, 500, 500, 500, 500,
500, 500, 500, 500};


int[] tempYmask = {265, 265, 265, 265, 265, 265, 265, 265, 265, 265,
265, 265, 265, 266, 266, 266, 266, 266, 266, 266,
266, 267, 267, 269, 270, 270, 271, 272, 273, 274,
275, 276, 277, 278, 278, 278, 278, 278, 281, 282,
282, 282, 283, 285, 285, 285, 285, 285, 285, 286,
286, 287, 289, 291, 291, 292, 292, 293, 294, 294,
295, 295, 295, 296, 296, 297, 297, 296, 296, 297,
297, 297, 297, 297, 297, 297, 297, 297, 298, 298,
298, 298, 299, 299, 299, 299, 299, 299, 299, 299,
299, 299, 300, 299, 299, 300, 300, 301, 302, 302,
302, 302, 305, 306, 308, 309, 310, 311, 312, 313,
314, 315, 316, 317, 319, 320, 321, 323, 324, 325,
325, 326, 327, 327, 328, 330, 331, 331, 331, 332,
332, 333, 334, 335, 336, 337, 338, 339, 340, 341,
341, 342, 343, 344, 345, 346, 346, 346, 346, 346,
346, 346, 346, 346, 346, 346, 346, 346, 346, 346,
346, 346, 346, 346, 345, 345, 344, 344, 343, 343,
342, 341, 340, 340, 339, 339, 338, 337, 337, 336,
334, 333, 333, 332, 331, 330, 329, 327, 326, 325,
324, 322, 320, 319, 317, 316, 315, 314, 313, 312,
312, 311, 310, 309, 308, 307, 307, 306, 305, 304,
303, 302, 301, 301, 301, 299, 298, 297, 297, 297,
297, 297, 297, 297, 297, 297, 297, 297, 297, 297,
297, 297, 297, 297, 297, 297, 297, 297, 297, 297,
297, 296, 296, 295, 295, 294, 294, 293, 293, 293,
293, 293, 291, 291, 291, 291, 290, 290, 289, 288,
287, 287, 286, 286, 285, 285, 285, 283, 283, 282,
281, 281, 281, 280, 279, 279, 277, 277, 277, 277,
276, 276, 276, 275, 275, 275, 275, 274, 274, 274,
274, 274, 273, 273, 273, 273, 272, 272, 272, 272,
271, 271, 271, 271, 271, 271, 271, 271, 271, 271,
271, 271, 271, 271, 271, 271, 271, 272, 272, 273,
273, 274, 276, 276, 277, 277, 278, 278, 279, 279,
279, 279, 280, 280, 280, 280, 281, 281, 281, 281,
281, 281, 281, 281, 281, 281, 281, 281, 281, 281,
281, 281, 281, 281, 281, 279, 279, 278, 278, 278,
277, 276, 275, 275, 275, 275, 275, 275, 275, 275,
275, 275, 275, 274, 273, 272, 271, 271, 271, 271,
271, 271, 271, 270, 269, 267, 266, 266, 265, 265,
265, 265, 265, 265, 265, 265, 265, 265, 265, 265,
265, 265, 265, 265};
Polygon faceMask = new Polygon(tempXmask,tempYmask,tempXmask.length);
g.setColor(Color.white);
//rFace2.translate(0,0);
//g.drawPolygon(faceNose);
g.setColor(Color.black);
g.fillPolygon(faceMask);


int[] tempXFMid = {542, 541, 540, 540, 539, 539, 539, 538, 537, 537,
536, 535, 535, 534, 533, 532, 531, 530, 528, 527,
526, 525, 524, 523, 521, 520, 519, 519, 518, 518,
517, 516, 516, 515, 515, 514, 513, 513, 512, 511,
510, 508, 507, 507, 506, 505, 503, 502, 502, 501,
500, 499, 498, 497, 496, 494, 494, 493, 491, 490,
489, 487, 486, 486, 484, 484, 483, 482, 481, 481,
479, 477, 476, 475, 475, 473, 473, 472, 471, 471,
470, 470, 470, 470, 470, 471, 472, 473, 474, 475,
476, 476, 477, 478, 479, 481, 483, 484, 485, 486,
488, 489, 489, 489, 490, 491, 491, 491, 492, 492,
492, 493, 494, 494, 495, 495, 495, 495, 495, 495,
494, 494, 494, 494, 492, 492, 492, 492, 492, 492,
492, 493, 494, 494, 494, 495, 496, 497, 498, 500,
501, 502, 504, 505, 507, 507, 508, 510, 511, 512,
514, 515, 517, 518, 520, 521, 522, 522, 524, 525,
526, 527, 529, 530, 532, 533, 534, 535, 536, 538,
540, 542, 544, 547, 549, 551, 552, 554, 555, 556,
557, 558, 559, 560, 561, 563, 564, 565, 565, 567,
568, 569, 569, 570, 570, 570, 570, 570, 570, 570,
570, 569, 568, 566, 564, 564, 561, 560, 558, 557,
555, 552, 550, 548, 545, 543, 541, 538, 535, 533,
532, 530, 529, 529, 528, 528};

int[] tempYFMid = {224, 229, 231, 231, 232, 233, 234, 236, 238, 240,
241, 243, 244, 245, 246, 248, 250, 252, 255, 257,
259, 261, 263, 266, 268, 271, 272, 273, 274, 276,
277, 278, 279, 280, 281, 282, 283, 285, 286, 287,
289, 292, 293, 294, 295, 297, 299, 301, 302, 303,
305, 306, 307, 309, 311, 312, 314, 315, 317, 318,
320, 322, 322, 323, 325, 326, 327, 328, 328, 329,
331, 332, 333, 334, 334, 336, 337, 338, 339, 340,
341, 342, 343, 343, 345, 346, 348, 350, 350, 351,
352, 353, 354, 355, 355, 355, 356, 356, 356, 356,
356, 356, 356, 356, 356, 356, 356, 356, 355, 355,
355, 354, 353, 353, 352, 351, 351, 351, 351, 351,
351, 351, 351, 351, 349, 348, 348, 348, 345, 344,
342, 341, 339, 337, 336, 334, 333, 331, 329, 327,
326, 324, 323, 321, 318, 317, 316, 313, 311, 309,
305, 302, 299, 297, 294, 292, 291, 289, 287, 285,
284, 282, 280, 277, 275, 273, 272, 270, 269, 266,
263, 262, 260, 258, 256, 254, 252, 251, 249, 247,
246, 245, 243, 241, 239, 237, 235, 234, 233, 231,
229, 227, 225, 225, 224, 222, 222, 219, 219, 219,
219, 218, 217, 215, 213, 212, 211, 211, 211, 211,
211, 211, 211, 211, 212, 213, 215, 216, 218, 220,
222, 225, 228, 229, 231, 232};


Polygon faceMiddle = new Polygon(tempXFMid,tempYFMid,tempXFMid.length);
g.setColor(Color.white);
//rFace2.translate(0,0);
//g.drawPolygon(faceNose);
g.setColor(new Color(64,64,64));
g.fillPolygon(faceMiddle);

int[] tempXN = {485, 485, 485, 485, 485, 485, 485, 485, 485, 485,
485, 485, 484, 484, 483, 483, 483, 483, 483, 483,
482, 482, 480, 480, 480, 480, 479, 479, 478, 477,
477, 477, 475, 473, 471, 469, 469, 469, 469, 468,
467, 467, 467, 466, 465, 464, 462, 461, 461, 460,
460, 460, 460, 460, 460, 459, 458, 458, 458, 458,
458, 458, 458, 458, 458, 458, 459, 459, 460, 460,
460, 461, 462, 462, 463, 463, 463, 464, 464, 465,
466, 466, 467, 467, 467, 468, 469, 469, 470, 470,
471, 472, 473, 475, 476, 477, 478, 478, 480, 481,
482, 483, 484, 486, 487, 488, 490, 492, 493, 494,
494, 494, 494, 494, 494, 494, 494, 493, 493, 493,
493, 492, 491, 490, 490, 489, 488, 488, 487, 486,
486, 485, 484, 484, 484, 484, 484};

int[] tempYN = {350, 350, 350, 350, 350, 350, 350, 350, 350, 350,
350, 350, 350, 350, 350, 350, 350, 350, 350, 350,
349, 349, 348, 348, 348, 348, 348, 348, 348, 347,
347, 347, 347, 347, 346, 346, 346, 346, 346, 346,
346, 346, 346, 346, 347, 347, 347, 347, 347, 347,
347, 348, 348, 348, 348, 349, 351, 352, 352, 353,
354, 355, 355, 355, 356, 357, 358, 359, 360, 360,
361, 363, 364, 365, 366, 367, 368, 368, 369, 370,
370, 370, 370, 370, 371, 371, 371, 372, 372, 372,
372, 372, 372, 372, 372, 372, 372, 372, 372, 372,
372, 372, 372, 372, 372, 371, 370, 369, 368, 367,
367, 367, 366, 364, 364, 363, 361, 360, 359, 359,
358, 357, 356, 355, 354, 354, 353, 353, 352, 351,
351, 350, 349, 349, 349, 349, 349};
Polygon faceNose = new Polygon(tempXN,tempYN,tempXN.length);
g.setColor(Color.white);
//rFace2.translate(0,0);
//g.drawPolygon(faceNose);
g.setColor(Color.black);
g.fillPolygon(faceNose);

//eyes
//if (MainClass.iter == 1) {
//g.setColor(Color.white);
//int eyeSize = 10;
////left
//g.fillOval(500, 283, eyeSize - 3, eyeSize);
////right
//g.fillOval(549, 298, eyeSize - 3, eyeSize);
//MainClass.iter++;
//}
//else {
//	int blink = (int) (Math.random() * 30) + 1;
//	
//	if (blink == 4) {
//		g.setColor(Color.white);
//		MainClass.iter = 1;
//		g.fillRect(500, 283 + 5, 10, 1);
//		g.fillRect(549, 298 + 5, 10, 1);
//		
//	}
//	else if (blink == 1) {
//		
//	}
//	else {
//		g.setColor(Color.white);
//		int eyeSize = 10;
//		//left
//		g.fillOval(500, 283, eyeSize - 3, eyeSize);
//		//right
//		g.fillOval(549, 298, eyeSize - 3, eyeSize);
////		MainClass.iter++;
//	}
//}

MainClass.iter++;
if (MainClass.iter % 20 == 0) {
	int blink = (int) (Math.random() * 4) + 1;
	if (blink != 4) {
		g.setColor(Color.white);
		MainClass.iter = 0;
		g.fillRect(500, 283 + 5, 10, 1);
		g.fillRect(549, 298 + 5, 10, 1);
	}
	else {
		g.setColor(Color.white);
		int eyeSize = 10;
		//left
		g.fillOval(500, 283, eyeSize - 3, eyeSize);
		//right
		g.fillOval(549, 298, eyeSize - 3, eyeSize);
	}
}
else {
	g.setColor(Color.white);
	int eyeSize = 10;
	//left
	g.fillOval(500, 283, eyeSize - 3, eyeSize);
	//right
	g.fillOval(549, 298, eyeSize - 3, eyeSize);
}
		try {
			TimeUnit.MILLISECONDS.sleep(75);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();

	}
	public Polygon translatePoly(Polygon poly, int xRight, int yUp) {
		int[] copyX = poly.xpoints;
		
		int[] copyY = poly.ypoints;
		
		for (int i = 0; i < poly.npoints; i++) {
			copyX[i] += xRight;
			copyY[i] -= yUp;
		}
		return new Polygon(copyX, copyY, poly.npoints);
	}
}
/// file writing (include as separate class) - link with mouse listener
/*
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class otherFileWriting {

//  private static OpenOption CREATE,APPEND;

	public static void main(String[] args) {
	
	    // Convert the string to a
	    // byte array.
	    String s = "this\n";
	    byte data[] = s.getBytes();
	    // .\\add
	
	    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p,CREATE,APPEND))) {
	      out.write(data, 0, data.length);
	    } catch (IOException x) {
	      System.err.println(x);
	    }
    }
}
*/