package test;
import java.util.*;

public class Error4 {

	public static void main(String[] args) {
		try {
			read_data();
		}
		catch(UserException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void read_data() throws UserException { 
		Scanner stdin=new Scanner(System.in);
		int i=stdin.nextInt();
		
		if(i%2==0)
			throw new UserException("짝수 입력!");
		else
			throw new UserException("홀수 입력!");
	}
}

class UserException extends Exception {
	public UserException(String msg) {
		super(msg); // Exception의 생성자를 호출
	}
}

