package section01;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"apple", "lemon", "orange", "tomato", "peach"};
        Scanner input = new Scanner(System.in);

        String trueWord = words[(int) (Math.random() * words.length)].toLowerCase();
        char[] letters = new char[trueWord.length()];
        int attempts = 5;

        for (
                int i = 0;
                i < letters.length; i++) {
            letters[i] = '*' ;
        }
        while (attempts > 0) {
            System.out.println("Guess the word: " + String.valueOf(letters));

            System.out.print("Enter a letter: ");
            char guess = input.next().toLowerCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < trueWord.length(); i++) {
                if (trueWord.charAt(i) == guess) {
                    letters[i] = guess;
                    found = true;
                }
            }
            if (found && attempts != 5) {
                attempts++;
                System.out.println("That's right! Attempts: " + attempts);
            } else if (!found) {
                attempts--;
                System.out.println("Your letter is wrong. Try again! Attempts: " + attempts);
            }

            if (String.valueOf(letters).equals(trueWord)) {
                System.out.println("You win! This word: " + trueWord);
                break;
            }
        }
        if (attempts == 0) {
            System.out.println("There are no more attempts left... You lose.");
        }
    }
}