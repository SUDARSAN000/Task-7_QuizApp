package Day_8;

import java.util.ArrayList;
import java.util.List;

public class QuestionSeeder {
	
	List<Questions> questionBank;
	
	public static List<Questions> getQuestions(){
		
		List<Questions> questionBank = new ArrayList<>();
		
		questionBank.add(new Questions(
			    "Which of the following is not a Java keyword?",
			    new String[]{"class", "int", "goto", "main"}, 4));

			questionBank.add(new Questions(
			    "Which operator is used for comparison in Java?",
			    new String[]{"=", "==", "!=", "==="}, 2));

			questionBank.add(new Questions(
			    "Which of these is not a valid access modifier?",
			    new String[]{"public", "private", "protected", "internal"}, 4));

			questionBank.add(new Questions(
			    "What is the default value of a boolean variable in Java?",
			    new String[]{"true", "false", "0", "null"}, 2));

			questionBank.add(new Questions(
			    "Which package contains the Scanner class?",
			    new String[]{"java.util", "java.io", "java.lang", "java.net"}, 1));

			questionBank.add(new Questions(
			    "Which keyword is used to inherit a class in Java?",
			    new String[]{"implements", "extends", "inherits", "instanceof"}, 2));

			questionBank.add(new Questions(
			    "What will `5/2` output in Java?",
			    new String[]{"2", "2.5", "2.0", "Compile error"}, 1));

			questionBank.add(new Questions(
			    "Which exception is thrown when dividing by zero?",
			    new String[]{"NullPointerException", "ArithmeticException", "IOException", "IllegalArgumentException"}, 2));

			questionBank.add(new Questions(
			    "Which method starts a thread in Java?",
			    new String[]{"run()", "start()", "execute()", "init()"}, 2));

			questionBank.add(new Questions(
			    "Which of the following is a wrapper class for int?",
			    new String[]{"Integer", "Float", "Double", "Char"}, 1));

			questionBank.add(new Questions(
			    "Which class is used to take input from the console?",
			    new String[]{"Console", "Scanner", "InputStream", "Reader"}, 2));

			questionBank.add(new Questions(
			    "Which collection class allows duplicates and maintains insertion order?",
			    new String[]{"HashSet", "TreeSet", "LinkedList", "ArrayList"}, 4));

			questionBank.add(new Questions(
			    "Which loop is guaranteed to execute at least once?",
			    new String[]{"for", "while", "do-while", "foreach"}, 3));

			questionBank.add(new Questions(
			    "What is the size of `int` in Java?",
			    new String[]{"16 bits", "32 bits", "64 bits", "8 bits"}, 2));

			questionBank.add(new Questions(
			    "Which is the superclass of all classes in Java?",
			    new String[]{"Object", "Class", "Super", "Main"}, 1));

			questionBank.add(new Questions(
			    "Which keyword is used to define a constant variable?",
			    new String[]{"final", "static", "const", "define"}, 1));

			questionBank.add(new Questions(
			    "Which of the following is a runtime exception?",
			    new String[]{"IOException", "SQLException", "ArithmeticException", "FileNotFoundException"}, 3));

			questionBank.add(new Questions(
			    "Which interface provides random access to elements?",
			    new String[]{"List", "Queue", "Map", "Set"}, 1));

			questionBank.add(new Questions(
			    "What will `\"Java\" + 10 + 20` print?",
			    new String[]{"Java30", "Java1020", "Java 30", "Error"}, 2));

			questionBank.add(new Questions(
			    "Which of these is a checked exception?",
			    new String[]{"NullPointerException", "IOException", "ArithmeticException", "ArrayIndexOutOfBoundsException"}, 2));
			
			return questionBank;
	}
}
