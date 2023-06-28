package oppsConcept.polyrun_compile;

class Display {
	public void msg(byte i) {
		System.out.println("int" + i);
	}

	public void msg(float f) {
		System.out.println("float" + f);
	}
}

public class DemoMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display d = new Display();
		d.msg('a');

	}

}
