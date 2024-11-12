package demo21;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("Java");
		list.add("C#");
		list.add("Python");
		list.add("Php");
		list.add("Ruby");
		System.out.print("Elements from index 1 :: ");
		for(int i=1;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		
		LinkedList<Object> list1=new LinkedList<Object>();
		list1.add(20);
		list1.add("Selenium Java");
		list1.add('A');
		System.out.println("First Element is :: "+list1.getFirst());
		System.out.println("Last Element is :: "+list1.getLast());
		System.out.println("-------------------------------");
		
		LinkedList<Object> list2=new LinkedList<Object>();
		list2.add("Pune");
		list2.add("Bengalore");
		list2.add("Chennai");
		System.out.print("Elements in list2 :: ");
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
		
		Collections.reverse(list2);
		System.out.println("List After Reversing :: "+list2);
		
		list2.remove("Pune");
		
		System.out.println("List After Removing Pune :: "+list2);
		System.out.println("-------------------------------");
		
		LinkedList<String> list3=new LinkedList<String>();
		list3.add("Pune");
		list3.add("Bengalore");
		list3.add("chennai");
		
		LinkedList<String> list4=new LinkedList<String>();
		list4.add("Mumbai");
		list4.add("Kolkata");
		
		/*for(int i=0;i<list3.size();i++)
		{
			if(i==1)
			{
				for(int j=0;j<list4.size();j++)
				{
					list5.add(list4.get(j));
				}
			}
			else
			{
				list5.add(list3.get(i));
			}
		}*/
		list3.addAll(1,list4);
		System.out.println("List3 after adding list4 at index 1 :: "+list3);
		
		System.out.println("-------------------------------");
		LinkedList<Object> list5=new LinkedList<Object>();
		list5.add(30);
		list5.add("Automation Testing");
		list5.add("Bengaluru");
		System.out.println("Elements in list5 :: "+list5);
		list5.set(2, "Pune");
		System.out.println("Elements in list5 after adding Pune:: "+list5);
		System.out.println("-------------------------------");
		
		LinkedList<Object> list6=new LinkedList<Object>();
		list6.add(30);
		list6.add("Automation Testing");
		list6.add("Bengaluru");
		System.out.println("Elements in list6 :: "+list5);
		list6.set(1, "Selenium Java");
		System.out.println("Elements in list6 after adding Selenium Java:: "+list6);
		System.out.println("-------------------------------");
		
		
		
	}

}
