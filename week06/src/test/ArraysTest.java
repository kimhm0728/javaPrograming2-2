package test;
import java.util.*;

public class ArraysTest {
	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		arrayPrint("초기 배열 : ", a); // 배열  출력
		Arrays.fill(a, 3, 5, 33); // 3~4 인덱스 값 변경
		arrayPrint("fll() 수행 후 : ", a);
		Arrays.sort(a);
		arrayPrint("sort() 수행 후 : ", a);
		System.out.println("33은 배열의 "+Arrays.binarySearch(a, 33)+"번째 요소");
		// 33의 첫번째 위치 출력
		System.out.println("-3은 배열의 "+Arrays.binarySearch(a, -3)+"번째 요소");
		System.out.println("53은 배열의 "+Arrays.binarySearch(a, 53)+"번째 요소");
		// 배열에 값이 존재하지 않으면 음수 값 출력
		int[] b= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("배열 a와 배열 b가 같은가? : "+Arrays.equals(a,b));
	}

	static void arrayPrint(String s, int[] a) {
		System.out.print(s);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
