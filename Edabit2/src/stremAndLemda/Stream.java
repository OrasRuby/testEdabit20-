package stremAndLemda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Stream {
	
//	@Test
	public void arrayGet()
	{
		//count the names start with "A"
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alan");
		names.add("Tom");
		names.add("David");
		names.add("Adam");
		names.add("Rama");
		names.add("Amy");
		int count =0;
		for(int i=0;i<names.size();i++)
		{
			if (names.get(i).startsWith("A"))
			{
				count++; System.out.println(names.get(i));
			}
		}
		System.out.println(count);
		
		
	}
	
	
	//@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alan");
		names.add("Tom");
		names.add("David");
		names.add("Adam");
		names.add("Rama");
		names.add("Amy");
		
		Long x= names.stream().filter(s->s.startsWith("A")).count();  //return type of count() is long
		System.out.println(x);
		
		//we can have more than one condition by having {} inside lamda expression
		/*Long x2= names.stream().filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();  //return type of count() is long
		
		System.out.println(x2);*/
		System.out.println("**************");
		
		//print all the names having length =4
		names.parallelStream().filter(s->s.length()==4).forEach(s->System.out.println(s));
		
		//to limit the output to only one name, we use limiy()method
		names.parallelStream().filter(s->s.length()==4).limit(1).forEach(s->System.out.println(s));
		
	}
	
	
	@Test
	public void streamMap()
	{
		
		String [] list = {"Alan","Tom","David","Adam","Rama","Amy"};
		//print names which have last letter as "a" with UpperCase
		//Stream.of("Alan","Tom","David","Adam","Rama","Amy").filter(s->s.endsWith("a")).
		//map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> myList = Arrays.asList(list);  //convert array to arrayList
		myList.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//sorted the names started with "A" and print out them
		myList.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//using filter when we need condition
		//if it required to print all the names with upper case we dont need filter just map
	}

	@Test
	public void mergeLists()
	{
		//to merge two arrayLists
		
		String [] list1 = {"Alan","Tom","David","Adam","Rama","Amy"};
		List<String> myList1 = Arrays.asList(list1);
		
		String [] list2 = {"Emely","Nina"};
		List<String> myList2 = Arrays.asList(list2);
		
		//
		//Stream<String> newStream = Stream.of(myList1.stream(),myList2.stream());
		
		
		
	}

	

}
