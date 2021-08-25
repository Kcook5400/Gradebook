import java.util.*;
public class gradebook {

	public ArrayList<Integer> scores;
	public ArrayList<String> grades= new ArrayList<String>();
	public String testName;
	
	
	
	public ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}

	public ArrayList<String> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<String> grades) {
		this.grades = grades;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public gradebook() {};
	
	public gradebook(String testName, ArrayList<Integer>scores) {
		this.testName = testName;
		this.scores=scores;
		}
		
		
		public  ArrayList<String> setLetterGrades (ArrayList<Integer> scoreToLetters){
			int ABASE=90;
			int BBASE=80;
			int CBASE=70;
			int DBASE=60;
			for(int i=0; i<scoreToLetters.size(); i++) {
				
				if (scoreToLetters.get(i)>=ABASE) {
					grades.add("A");
				
				}
				else if (scoreToLetters.get(i)>=BBASE) {
					grades.add("B");
				}
				else if (scoreToLetters.get(i)>=CBASE) {
					grades.add("C");
				}
				else if (scoreToLetters.get(i)>=DBASE){
					grades.add("D");
				}
				else {
					grades.add("F");
				}
				
				
			}
			
			return grades;
			
		}
		
		
		
}
	
	

