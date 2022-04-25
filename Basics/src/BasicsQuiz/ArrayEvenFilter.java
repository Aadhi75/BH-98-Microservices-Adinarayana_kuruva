package BasicsQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayEvenFilter {

//	static void filterEven(int array[]) {
//
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] % 2 == 0) {
//				System.out.print(array[i] + " ");
//			}
//		}
//	}
//
	public static void main(String[] args) {
//
//		int arr[] = { 3, 45, 23, 78, 44, 34, 88 };
//		filterEven(arr);

		List<Integer> num = new ArrayList<Integer>();
		
		
		num.add(3);
		num.add(45);
		num.add(23);
		num.add(78);
		num.add(44);
		num.add(34);
		num.add(88);

		System.out.println(num);
		
		Collections.sort(num);
		
		System.out.println(num+"\n\n");
		
		Iterator itr = num.iterator();
		System.out.println("-----With Iterator----");
		while(itr.hasNext()) {
			int x=(int)itr.next();
			if(x%2==0)
			System.out.println(x);
		}
		System.out.println("-----With For Each Loop----");
		for(Integer x : num) {
			if(x%2==0)
			System.out.println(x);
		}

		
	}



}
