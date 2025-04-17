package exceptionsLearn;

public class MathLearn {

	public static void main(String[] args) {


		int a=100,b=0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		
		
		try {
		System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println(a*b);
		
		
		
		

	}

}
