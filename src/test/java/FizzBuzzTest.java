import junit.framework.TestCase;

//מחלקות שקילות: בדיקות לקלטים שמחזירים Fizz, Buzz, FizzBuzz, ומספר רגיל.
//מקרי קצה: קלטים 1, 15, 100, קלטים לא חוקיים כמו 0 ו-101.
//דרישה ספציפית: כל תוצאה מופרדת בפסיק, ללא פסיק מיותר בסוף.

public class FizzBuzzTest extends TestCase {
    FizzBuzz fb = new FizzBuzz();

    public void testFizzBuzz() {
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz," + "16,17,Fizz,19,Buzz";
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