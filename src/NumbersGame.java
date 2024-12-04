import java.util.Random;

public class NumbersGame {
    public static void main(String[] args) {
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*******************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");

        int answer = new Random().nextInt(0, 11);

        while (true) {
            System.out.print("Enter your guess: ");
            String guess = System.console().readLine();

            if (guess.equalsIgnoreCase("q")) {
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                break;
            }
            try {
                int guessedNumber = Integer.parseInt(guess);

                if (guessedNumber == answer) {
                    System.out.println("Lucky guess! But can you do it again?");
                    break;
                } else if (guessedNumber < 0) {
                    System.out.println("Invalid Input: less than 0");
                } else if (guessedNumber > 10) {
                    System.out.println("Invalid Input: larger than 10");
                } else {
                    System.out.println("Swing and a miss! Keep trying...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number between 0 and 10, or 'q' to quit.");
            }
        }
        System.out.println("Game over. Shutting down...");
    }
}
