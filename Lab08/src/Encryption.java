import java.util.*;
//import java.math.*;
import java.math.BigInteger;

public class Encryption {
	public static void main(String [] args){
		
//		intValue iv = new intValue();
//		Scanner inputScanner = new Scanner(System.in);
//		
//		final int NUMBERS = 30;
//		String[] numbers = new String[NUMBERS];
//		
//		System.out.println("Please enter the first digits: ");
//		int num1 = inputScanner.nextInt();
//		
//		System.out.println("Please enter the second digits: ");
//		int num2 = inputScanner.nextInt();
		
		Scanner in = new Scanner(System.in);
		intValue v1 = new intValue();
		intValue v2 = new intValue();
		
		
		System.out.print("Please enter the first value: ");
		String str1 = in.nextLine();
		
		v1.num1 = new BigInteger(str1);
		System.out.print("Please enter the second value: ");
		String str2 = in.nextLine();
		
		v2.num1 = new BigInteger(str2);
		in.close();
//		System.out.println(v.num1);
//		System.out.println(v.num2);
		
		try{
			
//		int newnum1 = Integer.parseInt(v.num1);
//		int newnum2 = Integer.parseInt(v.num2);
//		
//		while(newnum1 < 100){
//			System.out.println("In the loop");
//			newnum1 = newnum1 + 100;
//		}
//		while(newnum2 < 100){
//			System.out.println("Inside the loop");
//			newnum2 = newnum2 + 100;
//		}
//				
//			newnum1 = in.nextInt();
//			newnum2 = in.nextInt();
//		}
		
			intValue v3 = new intValue();
			v3 = v1.multiply(v2);
			System.out.print("The product is: " + v3.num1);

		}
		
		catch(NumberFormatException ex){
			System.out.print("Invalid input, please re-enter a new number.");
			return;
		}


		
				
//		StringBuilder sb = new StringBuilder(0);
//		sb.append(num1);
//		sb.append(num2);
		
		
//		System.out.println(iv.multiply(num1, num2));
//		System.out.println(sb.toString());
		}
		
	}

