package pack1;

import java.util.Scanner;

public class QuickSort {
	

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            quickSort(arr, low, i);
            quickSort(arr, i + 2, high);
        }
    }
	
	
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

	
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        System.out.println("Array before sorting:");
	        printArray(numbers);

	        quickSort(numbers, 0, size - 1);
 
	        System.out.println("Array after sorting:");
	        printArray(numbers);

		
	}

}
