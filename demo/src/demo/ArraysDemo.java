package demo;
import java.util.*;
public class ArraysDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int arr1[] = {20, 30, 40, 50, 60};
			int sum1=0;
			for(int i1=0;i1<arr1.length;i1++)
			{
				sum1+=arr1[i1];
			}
			System.out.println("Sum :: "+sum1);
			
			
			
			//Searching an element in an array
			int arr2[] = {25,30,35,50,65};
			int search_element2 = 35;
			int i2=0;
			for(i2=0;i2<arr2.length;i2++)
			{
				if(search_element2==arr2[i2])
				{
					break;
				}
			}
			if(i2<arr2.length)
			{
				System.out.println("Element "+search_element2+" is found at index "+i2);
			}
			else
			{
				System.out.println("Element is not found");
			} 
			
			//iteration
			int arr3[] = {8347,28,892,38725};
			int max3=arr3[0];
			for(int i3=1;i3<arr3.length;i3++)
			{
				if(max3<arr3[i3])
				{
					max3=arr3[i3];
				}
			}
			
			//recursion
			int arr4[] = {42,64,6834,6784,345};
			int size4 = arr4.length;
			int max4 = arr4[0];
			System.out.println("Largest Element Using recursion:: "+lar(arr4,size4,1,max4));
			
			
			//inbuilt Libraries
			int arr5[]= {25,456,73,6};
			int n5=arr5.length;
			Arrays.sort(arr5);
			System.out.println("Largest Element using Libraries ::"+arr5[n5-1]);
		}
		
		
		//recursion
		public static int lar(int[] arr,int n,int index,int max) 
		{

			if(index == n-1)
			{
				max= Math.max(max, arr[n-1]);
			}
			else
			{
				max=Math.max(max, arr[index]);
				max=lar(arr,n,index+1,max);
			}
			return max;
		}
}

