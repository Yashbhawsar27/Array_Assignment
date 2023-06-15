package pack1;

import java.util.Scanner;

public class ArraySubSet {

	public static boolean isSubset(int[] arr1, int[] arr2) {
		int found = 0;
		for (int i = 0; i < arr1.length; i++) {

	
			for (int j = 0; j < arr2.length; j++) 
			{
				if (arr1[i] == arr2[j]) 
				{
					found++;

				}
			}
		
		}

		if (found==0)
		{
			return false;
		}
		return true;
     
     
   }
	

	public static void main(String[] args) {
		System.out.println("insert element for 1st array");
		int[] arr1 = new int[6];
		int[] arr2 = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();

		}
		System.out.println("insert element for second array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		if (isSubset(arr1, arr2)) {
			System.out.println("arr2 is subset of arr1");
		} else {
			System.out.println("arr2 is not subset of arr1");
		}
	}
}
