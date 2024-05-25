//Online Examination
import java.util.Scanner;
public class Task2 {
    private static Scanner scanner = new Scanner(System.in);
    private static final int QUIZ_TIME_LIMIT = 15; 

    public static void main(String[] args) {
        login();
        takeQuiz();
        logout();
    }

    private static void login() {
        System.out.println("*****Welcome to Quiz Platform!!!!*****");
        System.out.print("Enter username : ");
        String username = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();
        System.out.println("Login successful!!!!");
    }

    private static void takeQuiz() {
        System.out.println("___Starting with the Questions____");

        String[][] questions = {
            {"Q1.What is 347+568 ?", "915"},
            {"Q2.What is 786-445 ?", "341"},
            {"Q3.What is 58 * 98 ?", "5684"},
            {"Q4.What is 784 / 7 ?", "112"},
            {"Q5.What is the square root of 256 ?", "16"}
        };

        for (String[] q : questions) {
            String question = q[0];
            String answer = q[1];

            System.out.println(question);
            System.out.println("You have " + QUIZ_TIME_LIMIT + " seconds to answer.");
            System.out.print("Your answer : ");

            String userAnswer = "";
            long startTime = System.currentTimeMillis();

            while ((System.currentTimeMillis() - startTime) / 1000 < QUIZ_TIME_LIMIT) {
                if (scanner.hasNextLine()) {
                    userAnswer = scanner.nextLine().trim();
                    break;
                }
            }

            if (userAnswer.equals("")) {
                System.out.println("Time's up! Auto-submitting...");
            }

            if (userAnswer.equals(answer)) {
                System.out.println("Correct Answer!!!!");
            } else {
                System.out.println("Wrong answer. The correct answer is: " + answer);
            }
            System.out.println(); 
        }
        System.out.println("Math quiz completed!!!!");
    }

    private static void logout() {
        System.out.println("Do you want to logout ? (Yes/No): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Yes")) {
            System.out.println("You have been logged out successfully");
        } else {
            System.out.println("You are still logged in.");
        }
    }
}
