package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadPrint {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        	
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
       // InputStreamReader r = new InputStreamReader(System.in);
       // BufferedReader br = new BufferedReader(r);
        //String s = br.readLine();
      
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}
