package pack1;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = 0; j < arr.length - i - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inset element in arr");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}
		bubbleSort(arr);
		for (int sortedEle : arr) {
			System.out.println(sortedEle);
		}
	}

}
