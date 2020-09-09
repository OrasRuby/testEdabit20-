import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
	
	public static String[] sortContacts(String[] arr, String sortBy) {
		
		if (arr.length == 0 )
			return arr;
		else
		{
			
			List<String> list = Arrays.asList(arr);
			/*Collections.sort(list, new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					String[] split1 = s1.split(" ");
					String[] split2 = s2.split(" ");
					String lastName1 = split1[1];
					String lastName2 = split2[1];
					if(lastName1.compareTo(lastName2) > 0)
						{
							return 1;
						}
					else
					    return -1;
					
				}
			});*/
			for (String s:list)
			{
				System.out.println(s);
			}
			
			String[] arr2 = list.toArray(new String[list.size()]);
			if(sortBy =="ASC")
			{
				return arr2;
			}
				
			else
			{
				String[] newArr = new String[arr2.length];
				for (int i=0;i<newArr.length;i++)
					newArr[i] = arr2[arr2.length-i -1];
				return newArr;
			}
				
		}
		
		
		
		
		}

	public static  int findWords(String str)
	{
		int len = str.length();
		int count = 0;
		char myList[] = new char[len];
				
		for(int i=0; i<len; i++)
		{
			myList[i] = str.charAt(i);
			if (((i>0)&&(myList[i] != ' ')&&(myList[i-1] == ' ')) || ((myList[0] != ' ') && (i == 0)))
				count ++;
			}
		return count;
	}
	
	public static int getFirstValue(int[] arr) {
		
		return arr[0];
		
		}
	
	
	public static void main(String[] args) {
		/*String str1 = "Just an example here move along";
		int count = findWords(str1); 
		System.out.println("words count : " + count);
		int a=5;
		int b=a++;
		System.out.println(b);
		
		int k=123;
		int x=0, temp=0;
		
		while(k>0)
		{
			temp = k%10;
			x += temp;
			k = k/10;
			
		}
		//System.out.println(x);
		System.out.println(getFirstValue(new int [] {80,5,100}));
		System.out.println(getFirstValue(new int [] {1,2,3}));
		System.out.println(getFirstValue(new int [] {-500,0,50}));*/
		
		String[] names = {"David Hume","Rene Desc","John Lock","Thomas Aqinas"};
		
		 System.out.println(Arrays.toString(sortContacts(new String[] {"Paul Erdos","Leonhard Euler","Carl Gauss"}, "DESC")));
		 System.out.println(Arrays.toString(sortContacts(new String[] {"John Locke","Thomas Aquin","David Hume", "Rene Descartes"}, "ASC")));
		 System.out.println(Arrays.toString(sortContacts(new String[] {}, "DESC")));
	}

}
