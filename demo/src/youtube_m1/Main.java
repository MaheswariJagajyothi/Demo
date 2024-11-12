package youtube_m1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary obj = new Salary();
		obj.hash.put("Developer", 50000);
		obj.hash.put("Tester", 40000);
		
		System.out.println(obj.totalSalary());
		obj.updateSalary("Developer", 60000);
		System.out.println(obj.getSalary("Developer"));
	}

}
