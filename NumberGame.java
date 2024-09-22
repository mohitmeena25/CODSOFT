import java.util.Scanner;

public class NumberGame {
    public static int guessTheNumber() {
        Scanner kb = new Scanner(System.in);
        int randomNo = (int) (100 * Math.random());
        int attempts = 5;
        int choice;
        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt " + i);
            System.out.println("Enter your guess : ");
            int guess = kb.nextInt();
            if (guess == randomNo) {
                System.out.println("Congratulations! you guess the number...");
                break;
            } else if (guess > randomNo) {
                System.out.println("The number is smaller than your guess");
            } else {
                System.out.println("The number is greater than your guess");
            }
            if (i==5) {
                System.out.println("Sorry all attempts were expired..");
                System.out.println("The number was : " + randomNo);
            }
        }
        System.out.println("Wants to play again! \n1:Yes \t2:No");
        choice = kb.nextInt();
        return choice;
    }

        public static void main(String[]args){
            System.out.println("Welcome to Guess The Number Game : ");
            System.out.println("You have total " + 5 + " attempts to guess the number between 1 to 100.");
            int choice=guessTheNumber();
            while(choice==1){
                choice=guessTheNumber();
            }
            System.out.println("Thanks for playing GoodBye...");
    }
}