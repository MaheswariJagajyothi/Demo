package demo21;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Capgemini V & V Automation Selenium Java Training";
		boolean output = input.contains("Selenium Java");
		System.out.println(output);
		System.out.println("--------------------------------------------");
		
		String input1 = "Pune Bengaluru Chennai";
		String output1 = input1.substring(5,14);
		System.out.println(output1);
		System.out.println("--------------------------------------------");
		
		String str1 = "Selenium Java";
		String str2 = "Bengaluru";
		String output2 = str1.join(" ",str1,str2);
		System.out.println(output2);
		System.out.println("--------------------------------------------");
		
		String actual = "Melenium Mava";
		String expected = actual.replaceFirst("M", "S");
		expected = expected.replaceAll("Mava", "Java");
		System.out.println(expected);
		System.out.println("--------------------------------------------");
		
		String actual1 = "123Capgemini Training 789";
		String regex = "\\d+";
		String expected1 = actual1.replaceAll(regex, "");
		System.out.println(expected1);
		System.out.println("--------------------------------------------");
		
		String actual2="123 Java 789";
		String expected2 = "";
		for(int i=0;i<actual2.length();i++)
		{
			char ch= actual2.charAt(i);
			if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')))
			{
				expected2=expected2+ch;
			}

		} 
		
		System.out.println(expected2);
		
		String actual3 = "Selenium$*#";
		String expected3 = "";
		for(int i=0;i<actual3.length();i++)
		{
			char ch= actual3.charAt(i);
			int digit=(int)ch;
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ||  (digit>=48 && digit<=57) )
			{
				expected3=expected3+ch;
			}
		}
		
		System.out.println(expected3);
		System.out.println("--------------------------------------------");
		
		String actual4 = "Selenium Java";
		for(int i=0;i<actual4.length();i++)
		{
			char ch=actual4.charAt(i);
			System.out.println(ch);
		}
		System.out.println("--------------------------------------------");
		
		String actual5 = "Selenium Java";
		System.out.println("Index of S is :: "+actual5.indexOf('S'));
		System.out.println("Index of S is :: "+actual5.indexOf('J'));
		System.out.println("--------------------------------------------");
		
		String strg1="Selenium Java";
		String strg2="Selenium Java";
		String strg3="Selenium Python";
		System.out.println("Comparision of str1 and str2 :: "+strg1.compareTo(strg2));
		System.out.println("Comparision of str2 and str3 :: "+strg2.compareTo(strg3));
		System.out.println("Comparision of str3 and str1 :: "+strg3.compareTo(strg1));
		System.out.println("--------------------------------------------");
		
		String input2 = "12345";
		try 
		{
		    int number = Integer.parseInt(input2);
		    System.out.println(number); // Output: 123
		} 
		catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		System.out.println("--------------------------------------------");
		
		String s1="babytedfa";
		String s2="babytedfe";
		System.out.println(s1.compareTo(s2));
		System.out.println("--------------------------------------------");
	}
}
