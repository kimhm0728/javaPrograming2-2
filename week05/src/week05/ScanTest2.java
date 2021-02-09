package week05;

import java.util.*;
import java.io.*;
public class ScanTest2 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			FileInputStream br = new FileInputStream("c:/work/input.dat");
			s = new Scanner(br);
			while(s.hasNext()) {
				System.out.println(s.next());
			}
			System.out.println();
		}
		catch(IOException e) {
			System.err.println(e);
		}
		finally {
			if(s!= null)
				s.close();
		}
	}
}
