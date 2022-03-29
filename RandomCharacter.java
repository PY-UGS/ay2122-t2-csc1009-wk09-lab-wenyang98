import java.util.Random;

import static java.lang.Character.*;

public class RandomCharacter {
    private static final String ALPHANUMERIC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public char getRandomLowerCaseLetter() {
        Random r = new Random();
        char c = (char)(r.nextInt(0, 26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter() {
        Random r = new Random();
        char c = (char)(r.nextInt(0, 26) + 'A');
        return c;
    }

    public char getRandomDigitCharacter() {
        Random r = new Random();
        char c = forDigit((r.nextInt(0, 10)), 10);
        return c;
    }

    public char getRandomCharacter() {
        Random r = new Random();
        char c = ALPHANUMERIC.charAt(r.nextInt(0, ALPHANUMERIC.length())); // Get a random character out of the string - finStr
        return c;
    }

    // Check if character is prime
    public boolean isPrime(char c) {
        boolean isPrime = true;
        int x;
        if (isDigit(c)) {
            x = getNumericValue(c);
            // If the number is 0 or 1, it is not prime
            if (x == 0 || x == 1) {
                isPrime = false;
            }
            for (int p = 2; p < x; p++) {
                // Checks if the number is divisible by any other number except itself
                // If it is divisible, it is not prime
                if (x % p == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        else {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        String lower = "", upper = "", digits = "", randChar = "";
        RandomCharacter rc = new RandomCharacter();
        for (int i = 0; i < 15; i++) {
            lower += rc.getRandomLowerCaseLetter();
            upper += rc.getRandomUpperCaseLetter();
            digits += rc.getRandomDigitCharacter();
            randChar += rc.getRandomCharacter();
        }

        System.out.println(lower);
        System.out.println(upper);
        System.out.println(digits);
        System.out.println(randChar);

        char low = rc.getRandomLowerCaseLetter();
        char upp = rc.getRandomUpperCaseLetter();
        char dig = rc.getRandomDigitCharacter();
        char rch = rc.getRandomCharacter();

        System.out.println("Is " + low + " prime: " + rc.isPrime(low));
        System.out.println("Is " + upp + " prime: " + rc.isPrime(upp));
        System.out.println("Is " + dig + " prime: " + rc.isPrime(dig));
        System.out.println("Is " + rch + " prime: " + rc.isPrime(rch));
    }
}
