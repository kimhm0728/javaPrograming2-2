package week04;

public class Quiz {
	public static void main(String[] args) {
		try {
			sub();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ÀÎµ¦½º ¹üÀ§ ¹þ¾î³²");
		}
	}
	public static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		int i = array[10];
	}
}
