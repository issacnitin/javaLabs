import java.util.Scanner;

public class Rectangle {

	public int x, y;
	public static int width;
	public static int height;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setWidth();
		setHeight();
		System.out.println(getWidth());
		System.out.println(getHeight());
	}

	Rectangle(int a, int b, int c, int d) {
		x = a;
		y = b;
		width = c;
		height = d;
	}

	Rectangle() {
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}

	Rectangle(int a, int b, int c) {

		this(a, b, c, c);

	}

	public static int getWidth() {
		return width;
	}

	public static int getHeight() {
		return height;
	}

	public static void setWidth() {
		Scanner in = new Scanner(System.in);
		width = in.nextInt();
	}

	public static  void setHeight() {
		Scanner in = new Scanner(System.in);
		height = in.nextInt();
	}

	public void Translate(int a, int b) {
		x = x + a;
		y = y + b;
	}



}

class UseRectangle {

	Rectangle a = new Rectangle(12, 23, 33, 77);
	Rectangle b = new Rectangle();
	Rectangle c = new Rectangle(12, 22, 33);


	public void init() {
		b.x = 12;
		b.y = 23;
		Rectangle.height = 33;
		Rectangle.width = 77;
	}

}
