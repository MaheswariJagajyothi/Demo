package demo21;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> employee = new HashMap<>();
		employee.put(101, "Vijay");
		employee.put(102, "Ravi");
		employee.put(103, "Kisan");
		System.out.println("Employee Map Elements are :: "+employee);
		System.out.println("------------------------------------------");
		
		HashMap<Integer, String> department = new HashMap<>();
		department.put(101, "Vijay");
		department.put(102, "Ravi");
		department.put(103, "Kisan");
		System.out.println("Department Map Elements are :: "+department);
		System.out.println("Department Map Keys are :: "+department.keySet());
		System.out.println("------------------------------------------");
		
		HashMap<String , Integer> country = new HashMap<>();
		country.put("India", 11);
		country.put("Maldives", 12);
		country.put("Srilanka", 13);
		System.out.println("Country Map Elements are :: "+country);
		country.remove("Maldives");
		System.out.println("Country Map Elements after removing Maldives :: "+country);
		System.out.println("------------------------------------------");
		
		HashMap<Integer, String> employee1 = new HashMap<>();
		employee1.put(101, "Vijay");
		employee1.put(102, "Ravi");
		employee1.put(103, "Kisan");
		Set<Entry<Integer, String>> set = employee1.entrySet();
		System.out.println("Key :: Vlaue ");
		for(Entry<Integer, String> e:set)
		{
			System.out.println(e.getKey()+" :: "+e.getValue());
		}
		System.out.println("------------------------------------------");
		
		HashMap<Integer, String> employee2 = new HashMap<>();
		employee2.put(101, "Vijay");
		employee2.put(102, "Ravi");
		employee2.put(103, "Kisan");
		for(Integer e:employee1.keySet())
		{
			System.out.println(e+" :: "+employee2.get(e));
		}
		System.out.println("------------------------------------------");
		
		HashMap<String, Integer> states = new HashMap<>();
		states.put("Delhi",11);
		states.put("Karnataka",12);
		states.put("UtterPradesh",13);
		if(states.containsKey("Delhi"))
		{
			if(states.get("Delhi")==11)
			{
				System.out.println("There is a Delhi Key with 11 value");
			}
			else
			{
				System.out.println("There is a Delhi Key but not with 11 value");
			}
		}
		else
		{
			System.out.println("Delhi is Not Present");
		}
		System.out.println("------------------------------------------");
		
		HashMap<Integer, String> company = new HashMap<>();
		company.put(401, "Capgemini");
		company.put(402, "Cognizant");
		company.put(403, "Wipro");
		System.out.println("comapny Map Elements are :: "+company);
		company.clear();
		System.out.println("Comapny Map Elements after clearing all elements are :: "+company);
		System.out.println("------------------------------------------");
		HashMap<Integer, String> states1 = new HashMap<>();
		states1.put(1, "Karnataka");
		states1.put(2, "UtterPradesh");
		states1.put(3, "MadhyaPradesh");
		System.out.println("States Map Elements are :: "+states1);
		HashMap<Integer, String> city = new HashMap<>();
		city.put(4, "Bangaluru");
		city.put(5, "Lucknow");
		city.put(6, "Bhopal");
		System.out.println("City Map Elements are :: "+city);
		city.putAll(states1);
		System.out.println("States Map Elements are :: "+states1);
		System.out.println("City Map Elements are :: "+city);
		System.out.println("------------------------------------------");
		HashMap<Integer, String> automationTesting = new HashMap<>();
		automationTesting.put(111, "Selenium Java");
		automationTesting.put(112, "Selenium Python");
		automationTesting.put(113, "Selenium C#");
		System.out.println("Automation Testing Map Elements are :: "+automationTesting);
		System.out.println("Collection view of Automation Testing Map :: ");
		for(Integer key : automationTesting.keySet())
		{
			System.out.println(key+" :: "+automationTesting.get(key));
		}
		System.out.println("------------------------------------------");
	}
}