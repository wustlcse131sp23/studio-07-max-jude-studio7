package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public Fraction simplify() {
		int num = this.numerator;
		int denom = this.denominator;
		for (int i = this.denominator; i > 0; i--) {
			if (num%i == 0 && denom%i == 0) {
				num = num / i;
				denom = denom / i;
			}
		}
		
		return new Fraction(num, denom);
	}
	
	public Fraction multiply(Fraction otherFrac) {
		int num1 = this.numerator;
		int denom1 = this.denominator;
		int num2 = otherFrac.getNumerator();
		int denom2 = otherFrac.getDenominator();
		
		return new Fraction(num1*num2, denom1*denom2);
	}
	
	public Fraction add(Fraction otherFrac) {
		Fraction multiplyFrac1 = new Fraction(otherFrac.getDenominator(), otherFrac.getDenominator());
		Fraction fraction1 = this.multiply(multiplyFrac1);
		
		Fraction multiplyFrac2 = new Fraction(this.getDenominator(), this.getDenominator());
		Fraction fraction2 = otherFrac.multiply(multiplyFrac2);
		
		int numeratorSum = fraction1.getNumerator() + fraction2.getNumerator();
		Fraction returnFrac = new Fraction(numeratorSum, fraction2.getDenominator());
		
		return returnFrac.simplify();
	}
	
	public Fraction reciprocal() {
		int num = this.getNumerator();
		int denom = this.getDenominator();
		
		return new Fraction(-denom, num);
	}

	public static void main(String[] args) {
		Fraction frac = new Fraction(4, 8);
		Fraction testFrac = new Fraction(1, 4);
		
		System.out.println(frac.getNumerator() + "/" + frac.getDenominator());
		
		frac = frac.simplify();
		
		System.out.println(frac.getNumerator() + "/" + frac.getDenominator());
		
		frac = frac.add(testFrac);
		
		System.out.println(frac.getNumerator() + "/" + frac.getDenominator());
		
		frac = frac.reciprocal();
		
		System.out.println(frac.getNumerator() + "/" + frac.getDenominator());
	}

}
