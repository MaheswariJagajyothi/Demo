package demo21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListBuildInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(List.of(10,20,30,40,50));
		System.out.print("list is : ");
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		list.set(2, 60);
		System.out.print("list after modifying : ");
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("List Size :: "+list.size());
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of elements in the List :: "+sum);
		System.out.println("Average of elements present in List is :: "+(sum/list.size()));
		
		System.out.println("-----------------------------");
		ArrayList<String> list2 = new ArrayList<String>(List.of("Python","C#","Php","Java"));
		System.out.print("List is : ");
		for(String i:list2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		list2.remove("Java");
		System.out.print("List after removing : ");
		for(String i:list2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Collections.sort(list2);
		System.out.print("List After Sorting is : ");
		for(String i:list2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
//		list2.sort(null)
		
		System.out.println("-----------------------------");
		ArrayList<Object> list3 = new ArrayList<Object>(List.of("X","Y","Z"));
		ArrayList<Object> list4 = new ArrayList<Object>(List.of(1,2,3));
		System.out.print("List3 is : ");
		for(Object i:list3)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("List4 is : ");
		for(Object i:list4)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		for(int i=0;i<list3.size();i++)
		{
			list4.set(i, list3.get(i));
		}
		System.out.println();
		*/
		
		Collections.copy(list4,list3); //list3 elements are colied into list4
		
		System.out.print("After Copying List4 is : ");
		for(Object i:list4)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
		ArrayList<Object> list5 = new ArrayList<Object>(List.of());
		System.out.println("Is List5 Empty or not :: "+list5.isEmpty());
		list5.add(0, "Capgemini");
		list5.add(1, "Bengaluru");
		list5.add(2, "V & V Training");
		list5.add(3, "Selenium Java");
		list5.add(4, true);
		System.out.println("Elements in list5::");
		for(int i=0;i<list5.size();i++)
		{
			System.out.println("Element at "+i+" is "+list5.get(i));
		}
		System.out.println();
		System.out.println("Is Automation Testing present in the list :: "+list5.contains("Automation Testing"));
		
		
	}

}
