package week06;

public class Quiz {
	public static <T> void swap(T[] a, int i, int j) {
		T tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}
