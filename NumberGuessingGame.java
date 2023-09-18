import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 7;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcom to NumberGame!");
        System.out.println("Hey Buddy you have about " + chances + "chances to win the game");
        while (playAgain) {
            int rand = getRandN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println("Chance" + (i + 1) + "	Enter your guess:");
                int user = sc.nextInt();
                if (user == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won it.");
                    break;
                } else if (user > rand) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too Low");
                }
            }
            if (guess == false) {
                System.out.println("Sorry buddy.You lost the chances.The number is" + rand);
            }
            System.out.println("Do you want to play Again(y/n)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("y");
        }
        System.out.println("That's it Buddy , Hope you enjoy it");
        System.out.println("Here is your Score: " + finals);
    }

    public static int getRandN(int min, int max)

    {
        return (int) (Math.random() + (max - min) + min);
    }
}
