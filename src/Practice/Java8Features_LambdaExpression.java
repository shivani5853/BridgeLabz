package Practice;

import java.util.function.*;

public class Java8Features_LambdaExpression {
//	public static int square(int n)
//	{
//		return n*n;
//	}

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;

		System.out.println("The square of 4" + f.apply(4));

		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(4));

//		System.out.println("The square of 4"+square(4));
	}
}
