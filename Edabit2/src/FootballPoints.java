
public class FootballPoints {

	public static void main(String[] args) {
		System.out.println(footballPoints(3, 4, 2));
		System.out.println(footballPoints(5, 0, 2));
		System.out.println(footballPoints(0, 0, 1));

	}
	
	public static int footballPoints(int wins, int draws, int loses) {
		int points=0;
		int winsPoints = wins * 3;
		int drawsPoints = draws *1;
		int losesPoints = loses * 0;
		
		points = winsPoints + drawsPoints + losesPoints;
		return points;
		
	  }

}
