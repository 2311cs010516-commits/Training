import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);

        int guessingNumber = sc.nextInt();
        int secretNumber=7;
        while(guessingNumber!=secretNumber){
            System.out.println("Guess the Number: ");
            guessingNumber =sc.nextInt();
        }
        System.out.println("Guess is correct");
    }
}
