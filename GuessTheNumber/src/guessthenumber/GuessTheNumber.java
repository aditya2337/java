package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("you number is too big");
            } else if (move < theNUMBER) {
                System.out.println("you number is too small");
            } else {
                System.out.println("you got it bro!!");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("nuber is pretty small.");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber playgame = new GuessTheNumber();
        System.out.println("Try and guess my impossible number. It is between 1"
                + " 100.go ahead and type a number between 1 and 100. Thank you"
                + "!!");
        playgame.play();
    }

}
