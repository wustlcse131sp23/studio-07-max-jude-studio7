package studio7;

public class Die {
	
	private int sides;
	
	public Die(int n) {
		this.sides = n;
	}
	
	public int roll() {
		return 1 + (int)Math.floor(Math.random()*this.sides);
	}

	public static void main(String[] args) {
		Die die = new Die(6);
		System.out.println(die.roll());
	}

}
