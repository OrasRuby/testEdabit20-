import java.util.ArrayList;
import java.util.Arrays;

public class StatesNames {
	
	public static String[] filterStateNames1(String[] arr, String type) {
		ArrayList<String> str = new ArrayList<String>();
		if (type =="abb")
			{
				for (String s:arr)
					{
						if (s.length()==2)
							str.add(s);
					}
				
				String[] arr1 = str.toArray(new String[str.size()]);
				return arr1;
			}
		else 
			{
				for(String s:arr) 
					{
						if (s.length()>2)
							str.add(s);
					}
				String[] arr1 = str.toArray(new String[str.size()]);
				return arr1;
			}
			
		}
	
	public static String[] filterStateNames(String[] arr, String type) {
		
		String st1="",st2="";
		for (String s:arr)
		{
			if(s.length()==2) 
			   {
				st1=st1+s; //System.out.println("st1: "+st1);
			   }
			else {
				st2=st2+s;//System.out.println("st2: "+st2);
			}
		}
			
		if (type == "abb") {
			if(st1.length()==0)
				return (new String[] {});
			else
				{
					String str[]=new String[st1.length()];
						st1.trim().split(" ");//System.out.println(str);
						return str;
			   }
		}			
		else {
			if(st2.length()==0)
				return (new String[] {});
			else
			{
				String str[] = st2.trim().split(" ");//System.out.println(str);
				return str;
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(filterStateNames(new String [] {"Arizona", "NY","NJ", "Nevada"}, "abb")));
		System.out.println(Arrays.toString(filterStateNames(new String [] {"MT", "NJ", "TX", "ID", "IL"}, "full")));
	}

}
