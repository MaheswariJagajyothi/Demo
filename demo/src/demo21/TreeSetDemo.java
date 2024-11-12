package demo21;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task1
		TreeSet<String> employee = new TreeSet<String>();
		employee.add("William");
		employee.add("Robert");
		employee.add("Alex");
		System.out.println("Employee TreeSet:: "+employee);
		System.out.println("-----------------------------------------------");
		
		//Task2
		TreeSet<String> department = new TreeSet<String>();
		department.add("IT");
		department.add("Finance");
		department.add("Marketing");
		System.out.println("Deaprtment TreeSet:: "+department);
		
		TreeSet<String> designation = new TreeSet<String>();
		designation.add("Tester");
		designation.add("Developer");
		designation.add("Manager");
		System.out.println("Designation TreeSet:: "+designation);
		
		department.addAll(designation);
		System.out.println("Department TreeSet After Adding or appending Designation Set :: "+department);
		System.out.println("-----------------------------------------------");
		
		//Task3
		TreeSet<String> training = new TreeSet<String>();
		training.add("Selenium Java");
		training.add("Selenium C#");
		training.add("Selenium Python");
		System.out.println("Training TreeSet:: "+training);
		System.out.println("Training TreeSet in reverse order :: "+training.descendingSet());
		System.out.println("-----------------------------------------------");
		
		//Task4
		TreeSet<String> platform = new TreeSet<String>();
		platform.add("Eclipse");
		platform.add("Visual Code Editor");
		platform.add("Sublime");
		platform.add("PyCharm");
		System.out.println("Platform TreeSet :: "+platform);
		System.out.println("Lowest Element is :: "+platform.first());
		System.out.println("Highest Element is :: "+platform.last());
		platform.remove("Sublime");
		System.out.println("Platform TreeSet after removing :: "+platform);
		System.out.println("-----------------------------------------------");
		
		//Task5
		TreeSet<String> testingTools = new TreeSet<String>();
		testingTools.add("Selenium");
		testingTools.add("QTP");
		testingTools.add("JMeter");
		testingTools.add("Load Runner");
		System.out.println("TestingTools TreeSet :: "+testingTools);
		System.out.println("Size of TestingTools TreeSet :: "+testingTools.size());
		System.out.println("Is TestingTools TreeSet contains Protractor :: "+testingTools.contains("Protractor"));
		System.out.println("-----------------------------------------------");
		
		//Task6
		TreeSet<Integer> numberFinding = new TreeSet<Integer>();
		numberFinding.add(1);
		numberFinding.add(3);
		numberFinding.add(5);
		numberFinding.add(7);
		numberFinding.add(9);
		numberFinding.add(11);
		System.out.println("NumberFinding TreeSet :: "+numberFinding);
		System.out.print("NumberFinding TreeSet Elements which are less than 7 :: ");
		for(Integer i:numberFinding)
		{
			if(i<7)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		//Task7
		TreeSet<String> searchFirst = new TreeSet<String>();
		searchFirst.add("Yahoo");
		searchFirst.add("Google");
		searchFirst.add("Binge");
		System.out.println("SearchFirst TreeSet :: "+searchFirst);
		System.out.println("SearchFirst TreeSet First Element :: "+searchFirst.first());
		searchFirst.pollFirst();
		System.out.println("SearchFirst TreeSet After Polling First Element:: "+searchFirst);
		System.out.println("-----------------------------------------------");
		
		//Task8
		TreeSet<Integer> lowerValueSearch = new TreeSet<Integer>();
		lowerValueSearch.add(100);
		lowerValueSearch.add(50);
		lowerValueSearch.add(75);
		lowerValueSearch.add(80);
		lowerValueSearch.add(30);
		lowerValueSearch.add(40);
		System.out.println("LowerValueSearch TreeSet :: "+lowerValueSearch);
		System.out.println("Lower value than 50 in the Set :: "+lowerValueSearch.lower(50));
		System.out.println("Lower value than 75 in the Set :: "+lowerValueSearch.lower(75));
		System.out.println("-----------------------------------------------");
		
		//Task9
		TreeSet<Integer> eliminateValue = new TreeSet<Integer>();
		eliminateValue.add(100);
		eliminateValue.add(50);
		eliminateValue.add(75);
		eliminateValue.add(80);
		System.out.println("EliminationValue Treeset :: "+eliminateValue);
		eliminateValue.pollLast();
		System.out.println("SearchFirst TreeSet After Polling Last Element:: "+eliminateValue);
		System.out.println("-----------------------------------------------");
		
		//Task10
		TreeSet<Integer> findSubset = new TreeSet<Integer>();
		findSubset.add(10);
		findSubset.add(15);
		findSubset.add(20);
		findSubset.add(25);
		findSubset.add(30);
		findSubset.add(35);
		System.out.println("FindSubset Treeset :: "+findSubset);
		System.out.println("FindSubset TreeSet subset :: "+findSubset.subSet(15, 25));
		System.out.println("-----------------------------------------------");
		
		
	}

}
