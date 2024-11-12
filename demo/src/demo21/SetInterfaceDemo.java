package demo21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> result = new HashSet<String>();
		result.add("Pass");
		result.add("Failed");
		result.add("Average");
		result.add("Failed");
		System.out.println("Hashset values after adding duplicate values : "+result);
		System.out.println("--------------------------------");
		
		HashSet<String> training = new HashSet<String>();
		training.add("V & V Training");
		training.add("Full Stack Training");
		training.add("Big Data Training");
		System.out.println("Training Hashset values : "+training);
		System.out.println("Is Selenium Java Exits : "+training.contains("Selenium Java"));
		training.remove("Big Data Training");
		System.out.println("Training Hashset values after removing a vlaue : "+training);
		System.out.println("Size of Training HashSet : "+training.size());
		System.out.println("--------------------------------");
		
		HashSet<Object> elements = new HashSet<Object>();
		elements.add(1020);
		elements.add("Selenium Java");
		elements.add(true);
		elements.add('C');
		System.out.println("Elements Hashset values : "+elements);
		Object[] array = elements.toArray();
		System.out.println("Elements Hashset values using Array : ");
		for(int i =0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Size of Elements HashSet : "+elements.size());
		elements.remove(true);
		System.out.println("Elements Hashset values after removing boolean vlaue : "+elements);
		elements.clear();
		System.out.println("Elements Hashset values after clearing all vlaues : "+elements);
		System.out.println("--------------------------------");
		
		HashSet<String> products = new HashSet<String>();
		products.add("Books");
		products.add("Pens");
		products.add("Speakers");
		products.add("Mouse");
		System.out.println("Products Hashset values : "+products);
		
		List l = new ArrayList<>(products);
		System.out.println("List contains Keyboard or not : "+l.contains("Keyboard"));;
		System.out.println("List Displaying : "+l);
		
		Collections.singletonList(products);
		System.out.println("List contains Keyboard or not : "+products.contains("Keyboard"));;
		System.out.println("List Displaying : "+products);
		System.out.println("--------------------------------");
		
		HashSet<String> languages = new HashSet<String>();
		languages.add("Java");
		languages.add("C#");
		languages.add("Python");
		languages.add("Ruby");
		System.out.println("Languages Hashset values : "+languages);
		Object[] arr = languages.toArray();
		System.out.println("Languages Hashset values after converting into array : ");
		boolean contains_duplicate=false;
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					contains_duplicate=true;
					break;
				}
			}
			
		}
		if(!contains_duplicate)
		{
			System.out.println("Array does not contain duplicate values");
		}
		else
		{
			System.out.println("Array contains duplicate values");
		}
		System.out.println("-----------------------------");
		
		HashSet<String> city = new HashSet<String>();
		city.add("Bengalutu");
		city.add("Pune");
		city.add("Mumbai");
		System.out.println("City HashSet elements :: "+city);
		
		HashSet<String> cityList = new HashSet<String>();
		cityList.add("Bengalutu");
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("Noida");
		System.out.println("CityList HashSet elements :: "+cityList);

		if(city.equals(cityList))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		System.out.println("-----------------------------");
		
		HashSet<String> institute = new HashSet<String>();
		institute.add("Technical");
		institute.add("Financial");
		institute.add("Economic");
		System.out.println("Instutute HashSet elements :: "+institute);
		institute.removeAll(institute);
		System.out.println("Instutute HashSet elements after removing all :: "+institute);
		System.out.println("-----------------------------");
		
		HashSet<String> designation = new HashSet<String>();
		designation.add("Developer");
		designation.add("Teser");
		designation.add("Business Analyst");
		System.out.println("Designation HashSet elements :: "+designation);
		designation.add("Developer");
		designation.add("Teser");
		System.out.println("Designation HashSet elements after adding duplicates :: "+designation);
	}

}
