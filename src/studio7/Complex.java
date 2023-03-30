package studio7;

public class Complex {
	
	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public Complex add(Complex other) {
		return new Complex(this.a + other.getA(), this.b + other.getB());
	}
	
	public Complex multiply(Complex other) {
		double a = this.a;
		double b = this.b;
		double c = other.getA();
		double d = other.getB();
		
		return new Complex(a*c-b*d, a*d+b*c);
	}
	
	public void print() {
		System.out.println(this.a + " + " + this.b + "i");
	}

	public static void main(String[] args) {
		Complex imaginary = new Complex(1, 2);
		Complex tester = new Complex(2, 3);
		
		Complex sum = imaginary.add(tester);
		sum.print();
		Complex product = imaginary.multiply(tester);
		product.print();
	}

}
