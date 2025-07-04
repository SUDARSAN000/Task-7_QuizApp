package Day_8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class QuizApp {
	
	private static List<Questions> questionBank = new ArrayList<>();
	private static final int TIME_LIMIT_MINUTES = 1;
	
	public static void main(String args[]) {
		
		System.out.println("___Welcome To Java Quiz App___");
		questionBank.addAll(QuestionSeeder.getQuestions());
		
		QuizRunner quizRunner = new QuizRunner(questionBank);
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<?> future = executor.submit(quizRunner);
		
		executor.shutdown();
		try {
			if(!executor.awaitTermination(TIME_LIMIT_MINUTES, TimeUnit.MINUTES)) {
				executor.shutdownNow();
				System.out.println("\n Time's up ! Submitting your answers...\n");
			}
		}
		catch(InterruptedException e) {
			executor.shutdownNow();
			System.err.println("Error : Quiz Interrupted !");
		}
		
		int score = quizRunner.getScore();
		int noOfQuestion = questionBank.size();
		System.out.println("Your Score : "+score+"/"+noOfQuestion);
		double percentage = (score == 0)? 0.0 :
			                (score * 100.0 / noOfQuestion);
		System.out.printf("Percentage : %.2f%%\n",percentage);
		System.out.println(getPeformanceRemark(percentage));
	}

	private static String getPeformanceRemark(double percentage) {
		if(percentage == 100) return "Outstanding !";
		if(percentage >= 80) return "Great job !";
		if(percentage >= 50) return "Good attemp ! Keep learning...";
		return "Keep practicing ! and Try again...";
	}
}
