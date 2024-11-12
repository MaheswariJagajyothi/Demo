package demo21;

public class TestEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester2 t = new Tester2();
		Developer2 d =new Developer2();
		Developer2 d1 =new Developer2();
		int tester_sal = t.empSalary();
		String tester_det = t.empDetails();
		System.out.println("Tester Details");
		System.out.print(tester_det);
		System.out.println("Salary :: " + tester_sal);
		
		System.out.println("-------------------------------------------");
		
		int developer_sal = d.empSalary();
		String developer_det = d.empDetails();
		System.out.println("Developer Details");
		System.out.print(developer_det);
		System.out.println("Salary :: " + developer_sal);
		
		System.out.println("-------------------------------------------");
		System.out.println(d.equals(d1));		
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		System.out.println(d.toString());
		
		String input="null";
		System.out.println(input instanceof String);
	}

}
