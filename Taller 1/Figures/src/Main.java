import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		System.out.println("Creating RectangleDs:");
		System.out.println("\nRD1:");
		RectangleD rd1 = new RectangleD(5, 2);
		System.out.println("\nRD2:");
		RectangleD rd2 = new RectangleD(5, 3);
		System.out.println("\nRD3:");
		RectangleD rd3 = new RectangleD(35, 25);
		System.out.println("\nRD4:");
		RectangleD rd4 = new RectangleD(7, 2);
		System.out.println("\nRD5:");
		RectangleD rd5 = new RectangleD();
		RectangleD rdt;

		ArrayList<RectangleD> recDList = new ArrayList<RectangleD>();
		recDList.add(rd1);
		recDList.add(rd2);
		recDList.add(rd3);
		recDList.add(rd4);
		recDList.add(rd5);

		for (int i = 0; i < recDList.size(); i++) {
			rdt = recDList.get(i);
			System.out.println("\nRectangleD number " + (i + 1) + ":");
			System.out.println("\tWidth: " + rdt.getWidth());
			System.out.println("\tHeight: " + rdt.getHeight());
			System.out.println("\tPerimeter: " + rdt.getPerimeter());
			System.out.println("\tArea: " + rdt.getArea());
		}
		System.out.println();

		System.out.println("\nCreating Rectangles:");
		System.out.println("\nR1:");
		Rectangle r1 = new Rectangle();
		System.out.println("\nR2:");
		Rectangle r2 = new Rectangle(5, 2);
		System.out.println("\nR3:");
		Rectangle r3 = new Rectangle(5, 3);
		System.out.println("\nR4:");
		Rectangle r4 = new Rectangle(35, 52);
		System.out.println("\nR5:");
		Rectangle r5 = new Rectangle(15, 23);
		Rectangle rt;

		ArrayList<Rectangle> recList = new ArrayList<Rectangle>();
		recList.add(r1);
		recList.add(r2);
		recList.add(r3);
		recList.add(r4);
		recList.add(r5);

		for (int i = 0; i < recList.size(); i++) {
			rt = recList.get(i);
			System.out.println("\nRectangle number " + (i + 1) + ":");
			System.out.println("\tWidth: " + rt.getWidth());
			System.out.println("\tHeight: " + rt.getHeight());
			System.out.println("\tPerimeter: " + rt.getPerimeter());
			System.out.println("\tArea: " + rt.getArea());
		}
		System.out.println();

		System.out.println("Creating Triangles:");
		System.out.println("\nT1:");
		Triangle t1 = new Triangle();
		System.out.println("\nT2:");
		Triangle t2 = new Triangle(2, 5);
		System.out.println("\nT3:");
		Triangle t3 = new Triangle(3, 3, 3);
		System.out.println("\nT4:");
		Triangle t4 = new Triangle(25, 15);
		System.out.println("\nT5:");
		Triangle t5 = new Triangle(2, 3, 8);
		Triangle tt;

		ArrayList<Triangle> trList = new ArrayList<Triangle>();
		trList.add(t1);
		trList.add(t2);
		trList.add(t3);
		trList.add(t4);
		trList.add(t5);

		for (int i = 0; i < trList.size(); i++) {
			tt = trList.get(i);
			System.out.println("\nTriangle number " + (i + 1) + ":");
			System.out.println("\tBase: " + tt.getBase());
			System.out.println("\tHeight: " + tt.getHeight());
			System.out.println("\tPerimeter: " + tt.getPerimeter());
			System.out.println("\tArea: " + tt.getArea());
		}
		System.out.println();

		System.out.println("Creating Circles:");
		System.out.println("\nC1:");
		Circle c1 = new Circle();
		System.out.println("\nC2:");
		Circle c2 = new Circle(1);
		System.out.println("\nC3:");
		Circle c3 = new Circle(20);
		System.out.println("\nC4:");
		Circle c4 = new Circle(42);
		System.out.println("\nC5:");
		Circle c5 = new Circle(-1);
		Circle ct;

		ArrayList<Circle> cirList = new ArrayList<Circle>();
		cirList.add(c1);
		cirList.add(c2);
		cirList.add(c3);
		cirList.add(c4);
		cirList.add(c5);

		for (int i = 0; i < cirList.size(); i++) {
			ct = cirList.get(i);
			System.out.println("\nCircle number " + (i + 1) + ":");
			System.out.println("\tRadius: " + ct.getRadius());
			System.out.println("\tPerimeter: " + ct.getPerimeter());
			System.out.println("\tArea: " + ct.getArea());
		}

	}
}
