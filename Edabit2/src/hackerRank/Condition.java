package hackerRank;

import java.util.Scanner;

public class Condition {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if ((N % 2 != 0 ) ||( N% 2 == 0 && Math.max(6, N)== Math.min(N, 20)))
            System.out.println("Weird");
        else if((N % 2 ==0 && Math.max(2, N) == Math.min(N,5)) || (N %2 ==0 && N>20))
        	System.out.println("Not Weird");
        
        	

	}

}
