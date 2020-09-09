
public class WarOfNumbers {
	
	public static int totalVolume(int[][] part) {
		
		int vol=1,sum = 0;
		for(int row=0;row<part.length;row++)
		{
			for (int column=0; column < part[0].length; column ++)
				vol *= part[row][column];
			sum += vol;
			vol = 1;
		}
		return sum;
		}
	
	public static int totalVolume2(int[][] part) {

		int result = 0;
		for(int[] parts :part)	//because the column always 3
		{
			result += parts[0]*parts[1]*parts[2];
		}
		return result;
	}
	
	 public static int warOfNumbers(int[]numbers){
		 
		 int even=0, odd=0,result;
		
		 for (int i=0;i<numbers.length;i++)
		 {
			 if (numbers[i] % 2 ==0)
				 even += numbers[i];
			 else
				 odd += numbers[i];
				
		 }
		 result = (even > odd) ? even - odd : odd - even;
		
		 return result;
			
	  }

	public static void main(String[] args) {
		//System.out.println(warOfNumbers(new int[] {2,8,7,5}));
		//System.out.println(warOfNumbers(new int[] {12,90,75}));
		
		System.out.println(totalVolume2(new int[][] {{4, 2, 4}, {3, 3, 3}, {1, 1, 2}, {2, 1, 1}}));
		System.out.println(totalVolume2(new int[][] {{2,2,2}, {2,1,1}}));
		System.out.println(totalVolume2(new int[][] {{1,1,1}}));

	}

}
