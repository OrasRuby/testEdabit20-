package stremAndLemda;

public class SimulateGame {
	
	public static String rps(String s1, String s2) {
		if((s1== "paper" && s2 =="rock") ||(s1=="rock" && s2 == "scissors")||(s1 == "scissors" && s2=="paper"))
				return "Player 1 wins";
		else if(s1 == s2)
			return "TIE";
		else
			return "Player 2 wins";
		
		}

	public static void main(String[] args) {
		System.out.println(rps("rock", "paper"));
		System.out.println(rps("paper", "rock"));
		System.out.println(rps("paper", "scissors"));
		System.out.println(rps("scissors", "scissors"));
		System.out.println(rps("scissors", "paper"));
	}

}
