import java.util.Scanner;
public class HiLo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int theNumber = (int) (Math.random() * 100 +1);
//        System.out.println(theNumber);
            // this would display the randomly generated number, commented out for user version

            int guess = 0;
            int tryCount = 0;


            // insert "while loop" below - run as long as guess not equal to theNumber (ie guessed incorrectly)
            while (guess != theNumber) {
                System.out.println("Guess a whole number 1-100");
                guess = scan.nextInt();
//            System.out.println("You guessed " + guess + ".");
                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again.");
                else
                    System.out.println(guess + " is correct. Well done!");

                tryCount = tryCount + 1;

            } // end of guessing while loop

            System.out.println("You got it in " + tryCount + " guesses.");


    }


}
