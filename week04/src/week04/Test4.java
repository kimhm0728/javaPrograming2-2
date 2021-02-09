package week04;
import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		String id, passwd;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("ID �Է� : ");
			id=sc.next();
			if(id.equals("0"))
				throw new NotExistIDException();
			System.out.print("Password �Է� : ");
			passwd=sc.next();
			if(passwd.equals("0"))
				throw new WrongPasswordException();
		}
		catch(NotExistIDException e) {
			System.err.println(e.getMessage());
		}
		catch(WrongPasswordException e) {
			System.err.println(e.getMessage());
		}
	}

}
class NotExistIDException extends Exception {
	NotExistIDException() {
		super("ID�� ����");
	}
}
class WrongPasswordException extends Exception {
	WrongPasswordException() {
		super("Password�� �߸���");
	}
}