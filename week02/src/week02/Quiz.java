package week02;
/*
import java.util.*;

public class Quiz {
	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("a,b,c",",");
		while(s.hasMoreTokens())
			System.out.println(s.nextToken());
	}

}
*/


public class Quiz {
	public static void main(String[] args) {
		String s="a,b,c";
		String result[]=s.split(",");
		
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}
}