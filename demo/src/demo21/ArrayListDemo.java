package demo21;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Non - Generic Object
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Python");
		list.add("C#");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//cannot use for each loop bcz 

		System.out.println("--------------------------------");
		
		//Generic Object
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Python");
		list1.add("C#");
		System.out.println(list1);
		for(String listItem:list1)
		{
			System.out.println(listItem);
		}
				
		System.out.println("--------------------------------");
		//Different Datatypes in Generic
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add("Java");
		list2.add(true);
		list2.add(85723);
		System.out.println(list2);
		for(Object listItem:list2)
		{
			System.out.println(listItem);
		}
			
		System.out.println("--------------------------------");
		//Task
		ArrayList<Object> list3 = new ArrayList<Object>();
		list3.add('A');
		list3.add("John");
		list3.add(102);
		list3.add(true);
		list3.add(102.0f);
		list3.add(736587346781346184l);
		System.out.println(list3);
		for(Object listItem:list3)
		{
			System.out.println(listItem);
		}
		for(int i=0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
		}
		System.out.println("--------------------------------");
		Object removed_element = list3.remove(1);
		System.out.println("Removed Element :: "+removed_element);
		System.out.println(list3);
		System.out.println("--------------------------------");
		Iterator<Object> itr = list3.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------");
		System.out.println("Handson Task");
		ArrayList<Object> list4 = new ArrayList<Object>();
		list4.add("Username :: Antony");
		list4.add("Emain ID :: antony123@gmail.com");
		list4.add("Phone No :: 736238704");
		list4.add("Age :: 34");
		System.out.println("List is :: "+list4);
		System.out.println();
		
		Object removedNumber = list4.remove(2);
		System.out.println("Removed Element :: "+removedNumber);
		System.out.println();
		
		System.out.println("Index of Age Input :: "+list4.indexOf("Age :: 34"));
		System.out.println();
		
		System.out.println("List Elements Using Iterator:: ");
		Iterator<Object> itr2 = list4.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println();
		
		System.out.println("Size of List :: "+list4.size());
		System.out.println();
		
		System.out.println("Is List Empty :: "+list4.isEmpty());
		System.out.println();
		
		System.out.println("Is Smith present or not :: "+list4.contains("Smith"));
		System.out.println();
	}

}
