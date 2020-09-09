
public class WhereIsBob {

	public static int find_bob(String[] names) {
		
		int result=-1;
		
		for (int i =0; i< names.length; i++)
		{
			if (names[i] == "Bob")
			{
				result = i;
				break;
			}
		}
		return result;
	}
	
public static int countTrue(boolean[] arr) {
		int count =0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] == true)
				count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//String[] x = {"Jimmy", "Layla", "Bob"};
		//System.out.println(find_bob(new String [] {"Jimmy", "Layla", "Bob"}));
		//System.out.println(find_bob(new String [] {"Jimmy", "Layla", "James"}));
		System.out.println(countTrue(new boolean[] {true, false, false, true, false}));
		System.out.println(countTrue(new boolean[] {false, false, false, false}));
		System.out.println(countTrue(new boolean[] {}));
	}

}
