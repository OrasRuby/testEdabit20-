
public class NumbersEqual {

	public static void main(String[] args) {
		 int x = 2;
		 int y = 2;
		
		Boolean result = isSameNum( x, y);
		System.out.println(result);

	}

	
	public static Boolean isSameNum(int x, int y)
	{
		Boolean result = false;
		if (x == y)
			result = true;
				
		
		return result;
		
	}
}
