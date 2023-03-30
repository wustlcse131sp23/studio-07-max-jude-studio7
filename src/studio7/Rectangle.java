package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int area() {
		return this.length*this.width;
	}
	
	public int perimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSmaller(Rectangle rect) {
		if (this.area() < rect.area()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.width == this.length) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle square = new Rectangle(5, 5);
		Rectangle rect = new Rectangle(4, 5);
		
		System.out.println("Area of square: " + square.area());
		System.out.println("Perimeter of square " + square.perimeter());
		System.out.println("Is square a square?: " + square.isSquare());
		System.out.println("Is square smaller than rectangle: " + square.isSmaller(rect));
	}
}
