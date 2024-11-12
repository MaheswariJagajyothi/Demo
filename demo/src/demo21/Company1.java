package demo21;

public class Company1 {
	int comp_id;
	String company_name;
	
	Company1()
	{
		System.out.println("This is zero parameterized in company class");
	}
	
	Company1(int comp_id, String company_name)
	{
		this.comp_id = comp_id; 
		this.company_name = company_name;
		System.out.println("Company ID :: "+ this.comp_id);
		System.out.println("Company Name :: "+ this.company_name);
	}
}
