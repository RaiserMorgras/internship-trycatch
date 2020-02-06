package tryCatchTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void testCase1() {
        String x = "10";
        String y = "3";
        String expected = "3";
        String actual = StringIntegerDivider.getMessageOnRoundDivision(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        String x = "10";
        String y = "Hello";
        String expected = "java.lang.NumberFormatException";
        String actual = StringIntegerDivider.getMessageOnRoundDivision(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        String x = "10";
        String y = "0";
        String expected = "java.lang.ArithmeticException: / by zero";
        String actual = StringIntegerDivider.getMessageOnRoundDivision(x, y);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        String x = "23.323";
        String y = "0";
        String expected = "java.lang.NumberFormatException";
        String actual = StringIntegerDivider.getMessageOnRoundDivision(x, y);

        assertEquals(expected, actual);
    }
}
