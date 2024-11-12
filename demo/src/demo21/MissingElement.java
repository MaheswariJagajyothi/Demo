package demo21;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,4,5,6};
		//int[] arr= {1,2,3,4,5};
		int start = 0;
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]!=start)
			{
				System.out.println("Missing Element is :: "+start);
				break;
			}
			i++;
			start++;
		}
	}
	/*
	public static int logarithmicCode(int[] arr)
	{
		int start=0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start + end)/2;
			if(mid==arr[mid])
			{
				start=mid;
			}
			else
			{
				end=mid;
				logarith
			}
		}
		
	}
	*/

}
