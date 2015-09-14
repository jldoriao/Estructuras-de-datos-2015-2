import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		float w;
		float h;
		float b;
		int min = -2;
		int max = 22;
		float r;
		Random rand = new Random();

		RectangleD rdt;
		ArrayList<RectangleD> recDList = new ArrayList<RectangleD>();

		Rectangle rt;
		ArrayList<Rectangle> recList = new ArrayList<Rectangle>();

		Triangle tt;
		ArrayList<Triangle> trList = new ArrayList<Triangle>();

		Circle ct;
		ArrayList<Circle> cirList = new ArrayList<Circle>();

		// ************************RECTANGLED***************************
		System.out.println("Creating RectangleDs:");
		System.out.println("\nRD1 (default):");
		rdt = new RectangleD();
		recDList.add(rdt);

		for (int i = 0; i < 4; i++) {
			w = rand.nextFloat() * (max - min) + min;
			h = rand.nextFloat() * (max - min) + min;
			System.out.println("\nRD" + (i + 2) + ", w=" + w + ", h=" + h + ":");
			rdt = new RectangleD(w, h);
			recDList.add(rdt);
		}
		System.out.println();

		System.out.println("**************************");
		System.out.println("\nRectangleDs' data:");
		for (int i = 0; i < recDList.size(); i++) {
			rdt = recDList.get(i);
			System.out.println("\nRectangleD number " + (i + 1) + ":");
			System.out.println("\tWidth: " + rdt.getWidth());
			System.out.println("\tHeight: " + rdt.getHeight());
			System.out.println("\tPerimeter: " + rdt.getPerimeter());
			System.out.println("\tArea: " + rdt.getArea());
		}
		System.out.println();

		// ************************RECTANGLE****************************
		System.out.println("**************************");
		System.out.println("\nCreating Rectangles:");
		System.out.println("\nR1 (default):");
		rt = new Rectangle();
		recDList.add(rdt);
		for (int i = 0; i < 4; i++) {
			w = rand.nextFloat() * (max - min) + min;
			h = rand.nextFloat() * (max - min) + min;
			System.out.println("\nR" + (i + 2) + ", w=" + w + ", h=" + h + ":");
			rt = new Rectangle(w, h);
			recList.add(rt);
		}
		System.out.println();

		System.out.println("**************************");
		System.out.println("\nRectangles' data:");
		for (int i = 0; i < recList.size(); i++) {
			rt = recList.get(i);
			System.out.println("\nRectangle number " + (i + 1) + ":");
			System.out.println("\tWidth: " + rt.getWidth());
			System.out.println("\tHeight: " + rt.getHeight());
			System.out.println("\tPerimeter: " + rt.getPerimeter());
			System.out.println("\tArea: " + rt.getArea());
		}
		System.out.println();

		// ************************TRIANGLE*****************************
		System.out.println("**************************");
		System.out.println("\nCreating Triangles:");
		System.out.println("\nT1 (default):");
		tt = new Triangle();
		trList.add(tt);
		for (int i = 0; i < 4; i++) {
			b = rand.nextFloat() * (max - min) + min;
			h = rand.nextFloat() * (max - min) + min;
			System.out.println("\nT" + (i + 2) + ", b=" + b + ", h=" + h + ":");
			tt = new Triangle(b, h);
			trList.add(tt);
		}
		System.out.println();

		System.out.println("**************************");
		System.out.println("\nTriangles' data:");
		for (int i = 0; i < trList.size(); i++) {
			tt = trList.get(i);
			System.out.println("\nTriangle number " + (i + 1) + ":");
			System.out.println("\tBase: " + tt.getBase());
			System.out.println("\tHeight: " + tt.getHeight());
			System.out.println("\tPerimeter: " + tt.getPerimeter());
			System.out.println("\tArea: " + tt.getArea());
		}
		System.out.println();

		// ************************CIRCLE*******************************
		System.out.println("**************************");
		System.out.println("\nCreating Circles:");
		System.out.println("\nC1 (default):");
		ct = new Circle();
		recDList.add(rdt);
		for (int i = 0; i < 4; i++) {
			r = rand.nextFloat() * (max - min) + min;
			System.out.println("\nC" + (i + 2) + ", r=" + r + ":");
			ct = new Circle(r);
			cirList.add(ct);
		}
		System.out.println();

		System.out.println("**************************");
		System.out.println("\nCircles' data:");
		for (int i = 0; i < cirList.size(); i++) {
			ct = cirList.get(i);
			System.out.println("\nCircle number " + (i + 1) + ":");
			System.out.println("\tRadius: " + ct.getRadius());
			System.out.println("\tPerimeter: " + ct.getPerimeter());
			System.out.println("\tArea: " + ct.getArea());
		}

	}
}
