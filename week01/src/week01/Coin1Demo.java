package week01;

interface Coin{
	int PENNY=1, NICKEL=5, DIME=10, QUARTER=25;
}

public class Coin1Demo {
	public static void main(String[] args) {
		System.out.println("Penny는 "+Coin.PENNY+"센트입니다.");
		System.out.println("Nickel은 "+Coin.NICKEL+"센트입니다.");
	}

}
