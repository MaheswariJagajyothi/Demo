package demo21;

public class TestStateCountry4 {

	public TestStateCountry4()
	{
		System.out.println("Inside Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStateCountry4 sc = new TestStateCountry4();
		State4 s;
		s = new DisplayStateCountry4();
		System.out.println(s.getCountryName(null));
		System.out.println(s.getStateName(null));
	}

}
