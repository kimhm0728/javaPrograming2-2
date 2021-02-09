package week01;

interface PhoneInterface {
	final int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() { // static void printLogo()
		System.out.println("** Phone **");
	}
}
class Phone implements PhoneInterface {
	@Override
	public void sendCall() {
		System.out.println("������");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�."); }
}

public class InterfaceEx {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.printLogo(); // PhoneInterface.printLogo()
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println(PhoneInterface.TIMEOUT); // phone.TIMEOUT
	}

}
