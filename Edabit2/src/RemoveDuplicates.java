import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class RemoveDuplicates {
	
	public static int[] removeDups(int[] nums) {
		if ((nums.length == 0)|| (nums.length == 0))
			return nums;
		else
			return java.util.stream.IntStream.of(nums).distinct().toArray();
		
	}
	
	public static boolean checkEnding(String str1, String str2) {
		
		return (str1.endsWith(str2));
		
	    
	  }
	
	/*public static  int[] removeDups1(int[] nums) {
		if ((nums.length == 0)|| (nums.length == 0))
			return nums;
		else
			{
				ArrayList<Integer> arrList = new ArrayList<Integer>();
				for (int i=0; i<nums.length; i++)
					{
						if(! arrList.contains(nums[i]))
							arrList.add(nums[i]);
					}
				//nums = arrList.toArray();
			//	return str;
				
			}
			
	}*/
	
	public static boolean canCapture(String[] rooks) {
		String str1 = rooks[0];
		String str2 = rooks[1];
		if(str1.charAt(0) == str2.charAt(0)
				||str1.charAt(0) == str2.charAt(1)
				||str1.charAt(1)==str2.charAt(0)
				||str1.charAt(1)==str2.charAt(1))
		
				return true;
		else
			return false;
		}
	
	public static boolean canCapture2(String[] rooks) {
		return rooks[0].charAt(0) == rooks[1].charAt(0)
			|| rooks[0].charAt(1) == rooks[1].charAt(1);
	}	
	
	

	public static String[] removeDups(String[] str) {
		if ((str.length == 0)|| (str.length == 0))
			return str;
		else
			{
				ArrayList<String> arrList = new ArrayList<String>();
				for (int i=0; i<str.length; i++)
					{
						if(! arrList.contains(str[i]))
							arrList.add(str[i]);
					}
				str = arrList.toArray(new String[arrList.size()]);
				return str;
				
			}
			
		
		
	}

	public static String[] removeDups2(String[] str) {
		if ((str.length == 0)|| (str.length == 0))
			return str;
		else
			{
				str = Arrays.stream(str).distinct().toArray(String[]::new); 
				return str;
				
			}
			
		
		
	}

	public static void main(String[] args) {
		
		//System.out.println(Arrays.toString(new  int[] {1, 0, 1, 0}));
		//System.out.println(Arrays.toString(removeDups(new int[] {1, 0, 1, 0})));
		
		//System.out.println(Arrays.toString(new  int[] {12, 12, 10, 5}));
		//System.out.println(Arrays.toString(removeDups(new int[] {12, 12, 10, 5})));
		
		////System.out.println(Arrays.toString(new  String[] {"cat", "big", "cat"}));
		//System.out.println(Arrays.toString(removeDups2(new  String[] {"cat", "big", "cat"})));
		
		
		//System.out.println(canCapture(new String [] {"A8","E8"}));
		//System.out.println(canCapture(new String [] {"A1"," B2"}));
		//System.out.println(canCapture(new String [] {"H4","H3"}));
		//System.out.println(canCapture(new String [] {"F5","C8"}));
		
		
		/*float gallons = Float.parseFloat(JOptionPane.showInputDialog(null,
		        "Enter gallons used", "Gas Mileage",
		        JOptionPane.WARNING_MESSAGE));
		float miles = Float.parseFloat(JOptionPane.showInputDialog(null,
		        "Enter miles traveled", "Miles",
		        JOptionPane.WARNING_MESSAGE));
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		JOptionPane.showMessageDialog(null, nf.format(miles/gallons),
		        "Mileage is below",  JOptionPane.INFORMATION_MESSAGE);
		System.out.printf("Your mileage in mpg is %6.2f\n", miles/gallons);*/
		
		System.out.println(checkEnding("feminine", "nine"));
		
	}

}
