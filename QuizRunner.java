package Day_8;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizRunner implements Runnable{
	
	private final List<Questions> questions;
	private final Scanner scanner = new Scanner(System.in);
	private int score = 0;
	private int attempted = 0;
	
	public QuizRunner(List<Questions> questions) {
		this.questions = questions;
	}
	

	@Override
	public void run() {
		
		Collections.shuffle(questions);
		int qNum = 1;
		
		for(Questions q : questions) {
		    if (Thread.currentThread().isInterrupted()) {
		        System.out.println("\nQuiz stopped due to time limit.\n");
		        break;
		    }
			System.out.println("Q"+(qNum++)+". "+q.getQuestion());
			String[] options = q.getOptions();
			for(int i = 0; i < options.length; i++) {
				System.out.println(" "+ (i+1)+". "+options[i]);
			}
			int ans = getAnswer();
			attempted++;
			if(ans == q.getCorrectAnswer()) {
				score++;
			}
			System.out.println();
		}
		
	}


	private int getAnswer() {
		while(true) {
			try {
				System.out.print("Your Answer (1-4) : ");
				int choice = Integer.parseInt(scanner.nextLine());
				if(choice >= 1 && choice <= 4) return choice;
				System.out.println("Enter a number betwween 1 and 4\n");
			}
			catch(Exception e) {
				System.out.println("Invalid input ! Please enter a number\n");
			}
		}
	}
	public int getScore() {
		return score;
	}
	public int getAttempted() {
		return attempted;
	}
}
