package demo21;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> states = new TreeMap<String, String>();
		states.put("Delhi", "Delhi");
		states.put("Karnataka", "Bengaluru");
		states.put("UtterPradesh", "Lucknow");
		System.err.print("Enter Key :: ");
		String key = sc.nextLine();
		if(presentKey(key, states))
		{
			System.out.println(key+" is present in Map and the Entry is :: "+key+" : "+states.get(key));
		}
		else
		{
			System.out.println(key+" is not present in Map");
		}
	}
	public static boolean presentKey(String key,TreeMap<String, String> states)
	{
		if(states.containsKey(key))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
