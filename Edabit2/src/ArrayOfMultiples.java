import java.util.*;
public class ArrayOfMultiples {
	
	public static int leftDigit(String str) {
		char leftIndex = 0;
		for (int i=0; i< str.length(); i++)
		{
			if (Character.isDigit(str.charAt(i)))
			{
				leftIndex = str.charAt(i);
				break;
			}
		}
		
		return Integer.parseInt(String.valueOf(leftIndex));
	  }
	
	
	
	
	public static int[] arrayOfMultiples(int num, int length) {
		
		
		List<Integer> multiples = new ArrayList<Integer>();
		
		for(int i=1;i<=length; i++)
		{
			multiples.add(num * i);
		}
		int[] list = multiples.stream().mapToInt(Integer::intValue).toArray();
	
		return list;
		
	}

	public static void main(String[] args) {
		//int [] myList = arrayOfMultiples(7, 5);
		
		//for (int j=0;j<myList.length;j++)
		//{
			//System.out.println(myList[j]);
		//}
			System.out.println(leftDigit("TrAdE2W1n95!"));
			
			System.out.println(leftDigit("V3r1ta$"));
			System.out.println(leftDigit("J@v@5cR1PT"));
			System.out.println(leftDigit("U//DertHe1nflu3nC3"));
		
		
	}

}
