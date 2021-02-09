package week14;

import java.awt.GraphicsEnvironment;

public class ListJavaFonts {
	public static void main(String[] args) {
		String fonts[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		// 사용가능한 폰트 종류 출력
		for(int i=0;i<fonts.length;i++)
			System.out.println(fonts[i]);
	}

}
