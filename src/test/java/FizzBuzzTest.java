import junit.framework.TestCase;
/*
Equivalence Classes: Tests for inputs that return Fizz, Buzz, FizzBuzz, and regular numbers.
Edge Cases: Inputs like 1, 15, 100, and invalid inputs such as 0 and 101.
Specific Requirement: Each result is separated by a comma, with no trailing comma at the end.

The difference is in the way he tests: I check the final result, while he checks each number individually.
*/
public class FizzBuzzTest extends TestCase {

    FizzBuzz fb = new FizzBuzz();

    public void testFizzBuzz() {
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,"
                + "16,17,Fizz,19,Buzz";
        assertEquals(expected, fb.print(20));
    }

    public void testUpperBound() {
        try {
            fb.print(101);
            fail("Expected IllegalArgumentException for input greater than 100");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testLowerBound() {
        try {
            fb.print(0);
            fail("Expected IllegalArgumentException for input less than 1");
        } catch (IllegalArgumentException e) {
            // success
        }
    }
}