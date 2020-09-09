
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class InstatJazz {
	
public static String[]  jazzify1(String[] arr) {
	//
	//return arr.length==0 ? new String[]{} : java.util.Arrays.stream(arr).map(s -> s.endsWith("7")==true ? s : s+"7").toArray(String[]::new);
	for(int i=0; i<arr.length; i++) { 
		if(!arr[i].endsWith("7")) arr[i]+="7";
	}
	return arr;
}


public static String[] jazzify(String[] arr)
{
	//if (arr.length == 0)
	//	return arr;
	//else
	//	{
		String[] newArr = new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i].endsWith("7")==false)
					newArr[i]= arr[i] + "7";
			else
					newArr[i] = arr[i];
		}
	
	return newArr;
	//}
}

	public static void main(String[] args) {
		
		//System.out.println(jazzify(new String [] {"G", "F", "C"}).toString());
		System.out.println(Arrays.toString(jazzify(new String [] {"Dm", "G", "E", "A"})));
		System.out.println(Arrays.toString(jazzify(new String [] {"F7", "E", "A7", "Ab7", "Gm7", "C7"})));
		System.out.println(Arrays.toString(jazzify(new String [] {})));
		
		
		String [] a = new String[] {"G", "F", "C"};
		ArrayList<String> arList = new ArrayList<String>();
		
		for (int i=0;i<a.length;i++)
			arList.add(a[i] + "7");
		
		Object[] aa = arList.toArray();
		//System.out.println(Arrays.toString(aa));
}}
