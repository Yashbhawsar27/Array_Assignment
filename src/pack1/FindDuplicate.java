package pack1;

import java.util.Scanner;

public class FindDuplicate {
	public static void main(String[] args) 
	{
		
		
	 int []arr= new int[5];
	 Scanner sc= new Scanner(System.in);
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]= sc.nextInt();
		 
	 }
	 
	 
	 for (int i = 0; i < arr.length-1 ; i++) 
	 {
         for (int j = i + 1; j < arr.length; j++) 
         {
             if (arr[i] == arr[j]) 
             {
                 System.out.println(arr[i]);
             }
         }
		
		
	 }
}
}