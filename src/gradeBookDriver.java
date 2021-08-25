import java.util.Scanner; 
import java.util.*;

public class gradeBookDriver {
	
	public static void main(String args[]) {
		ArrayList<Integer> scores= new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the test name");
		String testName = scan.nextLine();
		System.out.print("How many scores would you like to enter?");
		int numScores = scan.nextInt();
		int i =0;
		while(i!=numScores) {
			System.out.print("Enter a score:");
			scores.add(scan.nextInt());
			i++;
		}
		
		gradebook D = new gradebook (testName, scores);
		ArrayList<String> returnedScores = D.setLetterGrades(scores);
				
		int c=0;
		System.out.print("Test Name:" + testName + "\n");
		System.out.print("Score -------- Grade\n");
		while (c<scores.size()) {
			
			System.out.print("  "+D.scores.get(c)+"   ");
			System.out.print("--------");
			System.out.print("   "+returnedScores.get(c)+"\n");
			c++;
			
			
		}
		
		
		
		
	}
	
	

}
