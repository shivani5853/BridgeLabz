package Practice;

@FunctionalInterface
public interface LMDemo {
//	public void m1();
//
//	default void m2() {
//	}
//
//	public static void m3() {
//
//	}

	public void m1();

	public static void main(String[] args) {
		System.out.println("1");
	}

}

@FunctionalInterface
interface B extends LMDemo {
	
//	public void m2();  //not working here only one abstract method declare]\
	
//	public static void main(String[] args) {  //not working here
//		System.out.println("1");
//	}
}
