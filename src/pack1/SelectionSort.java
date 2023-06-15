package pack1;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int arr[])
	{
		for(int i= 0; i<arr.length-1;i++)
		{
			int smallest = i;
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			
			int temp= arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int arr[]= new int [5];
		System.out.println("insert ele of array ");
		for ( int i=0; i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		selectionSort(arr);
		
		for(int sortedEle : arr)
		{
			System.out.println(sortedEle);
		}
	}

}
