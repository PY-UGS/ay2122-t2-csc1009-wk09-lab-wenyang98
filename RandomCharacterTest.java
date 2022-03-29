import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomCharacterTest {
    private static final String ALPHANUMERIC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private RandomCharacter randomCharacter;
    private Random r;

    // Instantiates the objects before unit testing
    @BeforeEach
    public void setUp() {
        randomCharacter = new RandomCharacter();
        r = new Random();
    }

    // Verifies getRandomLowerCaseLetter() returns a lowercase char
    @RepeatedTest(15)
    @DisplayName("Get a random lowercase letter")
    public void testGetRandomLowerCaseLetter() {
        assertTrue(Character.isLowerCase(randomCharacter.getRandomLowerCaseLetter()));
    }

    // Verifies getRandomUpperCaseLetter() returns a lowercase char
    @RepeatedTest(15)
    @DisplayName("Get a random uppercase letter")
    public void testGetRandomUpperCaseLetter() {
        assertTrue(Character.isUpperCase(randomCharacter.getRandomUpperCaseLetter()));
    }

    // Verifies getRandomDigitCharacter() returns a lowercase char
    @RepeatedTest(15)
    @DisplayName("Get a random digit character from 0 to 9")
    public void testGetRandomDigitCharacter() {
        assertTrue(Character.isDigit(randomCharacter.getRandomDigitCharacter()));
    }

    // Verifies getRandomCharacter() is alphanumeric
    @RepeatedTest(15)
    @DisplayName("Get a random alphanumeric character")
    public void testGetRandomCharacter() {
        assertTrue(ALPHANUMERIC.indexOf(randomCharacter.getRandomCharacter()) != -1);
    }

    @RepeatedTest(15)
    @DisplayName("Check if character is prime")
    public void testIsPrime() {
        // Range of values from 0-9
        String primeStr = "2357";
        String nonPrimeStr = "014689";

        // Get a random prime value from string of primes
        char primeChar = primeStr.charAt(r.nextInt(primeStr.length()));
        // Get a random non-prime value from string of non-primes
        char nonPrimeChar = nonPrimeStr.charAt(r.nextInt(nonPrimeStr.length()));

        // As primeChar is a prime number, verify that isPrime() will return true
        assertTrue(randomCharacter.isPrime(primeChar));
        // As nonPrimeChar is not a prime number, verify that isPrime() will return false
        assertFalse(randomCharacter.isPrime(nonPrimeChar));
    }
}
