import java.util.Scanner;

public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "TEST";
		System.out.println(str);
		char c = str.charAt(0);
		System.out.println(c);
		
		String str2 = "TEST";
		System.out.println(str == str2);
		String str3 = new String("TEST");
		System.out.println(str == str3);
		
		
		// byte, short, int, long, float, double & implicit/exlicit
		byte bval = 10;
		System.out.println(bval);
		bval = (byte)(bval + 20); //implicit & explicit type convertion
		System.out.println(bval);
		
		float fval = 3.14f;
		System.out.println(fval);
		
		// int -> String
		int i = 10;
		String s1 = Integer.toString(i); //"10"
		System.out.println(s1);
		int j = 200;
		String s2 = String.valueOf(j); // "10"
		System.out.println(s2);
		
		
		// String -> int
		int x = Integer.parseInt(s1);
		System.out.println(x);
		
		int y = Integer.parseInt(s2);
		System.out.println(y);
		
		// Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integer numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("num1=" +num1 + "num2=" +num2 + "num1+num2=" + (num1 + num2));
		
	}

}
