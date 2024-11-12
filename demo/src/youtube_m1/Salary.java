package youtube_m1;

import java.util.HashMap;

public class Salary {
	HashMap<String, Integer> hash = new HashMap<>();
	public int totalSalary()
	{
		int total = 0;
		for(int i:hash.values())
		{
			total+=i;
		}
		return total;
	}
	public String getSalary(String designation)
	{
		if(hash.containsKey(designation))
		{
			return "Salary is "+hash.get(designation);
		}
		else
		{
			return "No designation Match";
		}
	}
	public void updateSalary(String designation, int newSalary)
	{
		hash.put(designation, newSalary);
	}
}
