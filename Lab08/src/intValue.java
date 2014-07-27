import java.math.BigInteger;

public class intValue {
	
	BigInteger num1;
	//String num2;
	String result;
	
	
	
	 
	public intValue multiply(intValue n){
		
		
		BigInteger result ;
		BigInteger var1, var2;
		var1 = this.num1;
		var2 = n.num1;
		result = var1.multiply(var2);
		intValue res = new intValue();
		res.num1 = result;
		return res;
	}
//	public intValue addition(intValue n){
//		int newnum = Integer.parseInt(this.num1) + Integer.parseInt(n.num2);
//		result = Integer.toString(newnum);
//		return n;
//	}
//	
//	public int add(int number1, int number2){
//		int n = number1 + number2;
//		return n;
//	}
	
//	public int pow(long number1, long number2){
//		int n = (int) Math.pow(number1, number2);
//		return n;
//	}
}
