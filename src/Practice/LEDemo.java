package Practice;

public class LEDemo {
	public static void main(String[] args) {
		Inf i = () -> System.out.println("Hello....");// display lambda expression output
		i.m1();// we are calling method

		Demo d = new Demo();// simple calling
		d.m1();
	}
}

interface Inf {
	public void m1();
	
}

class Demo implements Inf {
	public void m1() {
		System.out.println("hello");
	}
}