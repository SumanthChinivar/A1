package finalModifier;

public class F14 {
	final void demo() {
		System.out.println("Non-static final method");
	}
}

class F15 extends F14 {
	public static void main(String[] args) {
		F15 f1=new F15();
		f1.demo();
	}
}