package oppsConcept.polyrun_compile;

class QA {
	QA() {
		System.out.println("Heelo Perent");
	}

	public void q1() {

		System.out.println("AAAA AAAAA");
	}
}

class AB extends QA {
	AB(String s) {
		System.out.println("Hello child" + s);

	}

}

class XXX extends Object {
	XXX() {
		System.out.println("XXXXX XXXXX");
	}
}

class A1 {
	A1(String s) {
		System.out.println(s);
	}
}

class A2 extends A1 {
	A2() {
		super("abc");
	}
}

class DD {
	DD(String aa) {
		System.out.print(aa);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A1 a = new A2();

		// QA q1 = new AB("aaaa");
		AB a1 = new AB("==aaa");

	}

}
