package tryCatchTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCase1() {
        String x = "10";
        String y = "3";
        int expected = 3;
        int actual = StringIntegerDivider.divideIntegersInStrings(x, y);

        assertEquals(expected, actual);
    }

    @Test(expected = java.lang.NumberFormatException.class)
    public void testCase2() {
        String x = "10";
        String y = "Hello";

        StringIntegerDivider.divideIntegersInStrings(x, y);
    }

    @Test
    public void testCase3() {
        thrown.expect(java.lang.ArithmeticException.class);
        thrown.expectMessage("/ by zero");

        String x = "10";
        String y = "0";

        StringIntegerDivider.divideIntegersInStrings(x, y);
    }

    @Test(expected = java.lang.NumberFormatException.class)
    public void testCase4() {
        String x = "23.323";
        String y = "0";

        StringIntegerDivider.divideIntegersInStrings(x, y);
    }
}
