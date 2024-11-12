package demo21;

import java.util.Scanner;

public class SearchingDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();
		System.out.println();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element for index "+i+" :: ");
			arr[i]=sc.nextInt();
			System.out.println();
		}
		
		
		System.out.print("Enter an element to search :: ");
		int search_element = sc.nextInt();
		System.out.println();
		
		//linearSerach
		int x= linearSearch(arr,search_element);
		if(x!=-1)
		{
			System.out.println("Element is found at "+x);
		}
		else
		{
			System.out.println("Element is Not Found");
		}
		
		//Binary Search
		int x1= binarySearch(arr,search_element);
		if(x1!=-1)
		{
			System.out.println("Element found at index "+x1);
		}
		else
		{
			System.out.println("Element is Not Found");
		}
		
		

	}
	
	
	public static int linearSearch(int[] arr, int a)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static int binarySearch(int[] arr,int a)
	{
		int left = 0;
		int right = arr.length-1;
		while(left<=right)
		{
			int mid = left+right/2;
			if(arr[mid]==a)
			{
				return mid;
			}
			if(arr[mid]>a)
			{
				right=mid;
			}
			else
			{
				left=mid+1;
			}
		}
		return -1;
	}

}
