package week04;

public class ArrayIndexOutOfBound_1 {

	public static void main(String[] args) {
		if(args.length==2) {
			String data1=args[0];
			String data2=args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		}
		else {
			System.out.println("변수를 입력하세요");
		}

	}

}
