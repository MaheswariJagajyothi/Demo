package demo21;

public class TestSearch3 {
	public static void main(String args[])
	{
		Search3 s; // interface reference
		s=new Document3(); 
		System.out.println(s.search("CapGemini"));
		s=new WebApplication3();
		System.out.println(s.search("Values"));
		
	}
}
