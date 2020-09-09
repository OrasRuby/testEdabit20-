import java.util.Arrays;
import java.util.List;

public class MissingNum {

	public static int missingNum(int[] nums) {
		
		int temp=0;
		for(int x:nums)
			temp +=x;
		return 55-temp;
	
		
	}
	
	public static int duplicateCount(String str)
		{
			int count ,sum=0, j;
			StringBuilder sb = new StringBuilder(str);
			for(int i=0;i<str.length();i++)
			{
				count = 0; j = i+1;
				while(j<str.length())
				{
				
					if(str.charAt(i)==str.charAt(j))
						{
							count ++;
							str =sb.deleteCharAt(j).toString();						
						}
				
					j++;
				}
			if(count>0)
				sum ++;
		}
		
		return sum;
		
	  }
	
	//to sort array---Arrays.sort(nums)
	
	public static int missingNum2(int[] nums) {
		return 55 - Arrays.stream(nums).sum();
	}
	
	public static void main(String[] args) {
		//System.out.println(missingNum(new int[] {1,2,3,4,6,7,8,9,10}));
		
		//System.out.println(missingNum(new int[] {7,2,3,6,5,9,1,4,8}));
		System.out.println(duplicateCount("abcde"));
		System.out.println(duplicateCount("aabbcde"));
		System.out.println(duplicateCount("Indivisibilities"));
		
	}

}
