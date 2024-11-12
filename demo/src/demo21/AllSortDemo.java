package demo21;
import java.util.Arrays;
public class AllSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bubblesort -1 (smalletst first)
		int[] arr = { 15, 10, 30, 25, 50};
		System.out.println("Input Array is :: "+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Bubble Sorted Array is :: "+Arrays.toString(arr));
		
		//bubble sort -2 (Largest last)
		int[] arr1 = { 15, 10, 30, 25, 50};
		for (int i = 0; i < arr1.length - 1; i++) 
        {
            boolean swapped = false;
            for (int j = 0; j < arr1.length - i - 1; j++) 
            {
                if (arr1[j] > arr1[j + 1]) 
                {
                    // Swap arr1[j] and arr1[j+1]
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
	    }
		System.out.println("Bubble Sorted Array is :: "+Arrays.toString(arr1));
		
		//insertion
		int[] arr2 = { 15, 10, 30, 25, 50};
		for (int i = 1; i < arr2.length; i++) 
		{
			int key = arr2[i];
			int j;
		    for(j=i-1; j>=0 && arr2[j] >key; j--)
		    {
		    	arr2[j + 1] = arr2[j];
		    }
		    arr2[j + 1] = key;
		}
		System.out.println("Insertion Sorted Array2 is :: "+Arrays.toString(arr2));
		
		//selection
		int[] arr3 = { 15, 10, 30, 25, 50};
        for (int i = 0; i < arr3.length - 1; i++) 
        {
            int min_idx = i;
            for (int j = i + 1; j < arr3.length; j++) 
            {
                if (arr3[j] < arr3[min_idx]) 
                {
                    min_idx = j;
                }
            }
            int temp = arr3[i];
            arr3[i] = arr3[min_idx];
            arr3[min_idx] = temp;           
        }
        System.out.println("Selection Sorted Array3 is :: "+Arrays.toString(arr3));
        
        //quicksort
        int intArray[]= {4,-1,6,8,0,5,-3};
		int n = intArray.length;
		System.out.println("Original Array: "+Arrays.toString(intArray));
		quick_sort(intArray,0,n-1);
		System.out.println("Sorted Array :: "+Arrays.toString(intArray));
	}
	
	//quicksort
	static int partition(int intArray[], int low, int high)
	{
		int pi = intArray[high];
		int i =  (low-1);
		for(int j=low;j<high;j++)
		{
			if(intArray[j]<=pi)
			{
				i++;
				int temp = intArray[i];
				intArray[i] = intArray[j];
				intArray[j] = temp;
			}
		}
		int temp = intArray[i+1];
		intArray[i+1] = intArray[high];
		intArray[high] = temp;
		return i+1;
	}
	
	static void quick_sort(int intArray[], int low, int high)
	{
		if(low<high)
		{
			int pi = partition(intArray, low, high);
			quick_sort(intArray, low, pi-1);
			quick_sort(intArray, pi+1, high);
		}
	}
	
}
