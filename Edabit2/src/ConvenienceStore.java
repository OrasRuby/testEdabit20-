
public class ConvenienceStore {
	
	
	public static boolean changeEnough(int[] change, double amountDue) {
		
		double quarters, dimes, nickels, pennies;
		double  result;
		quarters = change[0] *25;
		dimes = change[1] *10;
		nickels = change[2] *5;
		pennies = change[3] *1;
		result = (quarters + dimes + nickels + pennies) / 100;
		if (result >= amountDue)
				return true;
		else 
			return false;
		
	}
	
	public static boolean changeEnough1(int[] change, double amountDue)	
	{
		return change[0] * 25 + change[1] * 10 + change[2] * 5 + change[3] >= amountDue * 100;
	}
	
	public static boolean changeEnough2(int[] change, double amountDue)
		{
			double total = change[0]*0.25+change[1]*0.10+change[2]*0.05+change[3]*0.01;
			
			return total >= amountDue;
		
		}	

	
	public static void main(String[] args) {
		System.out.println(changeEnough2(new int[] {2,100,0,0}, 14.11));
		System.out.println(changeEnough2(new int[] {0,0,20,5}, 0.75));
		System.out.println(changeEnough2(new int[] {30,40,20,5}, 12.55));
		System.out.println(changeEnough2(new int[] {10,0,0,50}, 3.85));
		System.out.println(changeEnough2(new int[] {1,0,5,219}, 19.99));
	}

}
