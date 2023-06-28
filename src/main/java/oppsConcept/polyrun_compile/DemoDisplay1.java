package oppsConcept.polyrun_compile;

class Aminal {

}

class Monkey extends Aminal {

}

class Test1 {
	void d1(Monkey m) {
		System.out.println("Monkey");
	}

	void d1(Aminal a) {
		System.out.println("Aminal");
	}
}

public class DemoDisplay1 {

	public static void main(String[] args) {

		Test1 t = new Test1();
		Aminal a1 = new Aminal();
		Monkey m1 = new Monkey();
		
		
		//t.d1(a1);
		t.d1(m1);
		
		Aminal a2 = new Monkey();
		t.d1(a2);
		
		
		
	}

}
