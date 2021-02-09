package week07;
import java.util.*;

public class Quiz {
	public static void main(String[] args) {
		String[] fruit= {"orange","banana","apple","plum","pear"};
		LinkedList<String> name=new LinkedList<String>(Arrays.asList(fruit));
		
		for(int i=0;i<name.size();i++)
			System.out.print(name.get(i)+" ");
		
		System.out.println();
		for(String s:name)
			System.out.print(s+" ");
		
		System.out.println();
		Iterator it=name.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}
