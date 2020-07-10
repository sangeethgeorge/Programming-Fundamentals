
public class GradeAvg {
	
	public static void main(String[] args) {
		double quizScore1, quizScore2, quizScore3, testScore1, testScore2, quizScoreAvg, testScoreAvg;
		quizScore1 = 15;
		quizScore2 = 25;
		quizScore3 = 35;
		testScore1 = 45;
		testScore2 = 55;
		quizScoreAvg = (quizScore1 + quizScore2	+ quizScore3)/3;
		testScoreAvg = (testScore1 + testScore2)/2;
		
		System.out.println("Quiz Scores Average = "+ quizScoreAvg);
		System.out.println("Test Scores Average = "+ testScoreAvg);
		
	}

}
