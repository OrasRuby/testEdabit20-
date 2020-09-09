
public class ConvertHouToSec {
	
	public static int howManySeconds(int hours) {
		return hours * 3600;
	  }
	
	//convert hours and Minutes into Second
	public static int convert(int hours, int minutes) {
		 return ((hours * 3600)+(minutes * 60));
	  }

	 public static boolean lessThanOrEqualToZero(int num) {
	      if (num <= 0 )
	    		  return true;
	      else
	    	  return false;
	    }
	 
	 public static String giveMeSomething(String a) {
			
		 return "something " + a;
		}
	 
	 public static boolean reverse(boolean b) {
			return !b;
		}
	 
	 public static boolean divisible(int num) {
		 if ((num% 100) == 0)	
			 return true;
		 else
			 return false;
		}
	 
	 public static boolean divisibleByFive(int num) {
			if ((num % 5)==0)
				return true;
			else
				return false;
		}
	 
	 public static int calculator(int num1, char operator, int num2) {
		 if (operator == '+')
			 return num1 + num2;
		 else if (operator == '-')
			 return num1 - num2;
		 else if (operator == '*')
			 return num1 * num2;
		 else
		 {
			 if (num2 == 0)
				 return 0;
			 else
				 return num1 / num2;
		 }
	 }
	 
	 
	public static void main(String[] args) {
		
		System.out.println(calculator(2, '+', 2));
		System.out.println(calculator(2, '*', 2));
		System.out.println(calculator(4, '/', 2));
		
	}

}
