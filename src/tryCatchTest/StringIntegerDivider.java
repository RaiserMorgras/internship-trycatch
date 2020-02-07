package tryCatchTest;

public class StringIntegerDivider {
    public static int divideIntegersInStrings(String x, String y) throws ArithmeticException, NumberFormatException{
        return Integer.parseInt(x) / Integer.parseInt(y);
    }
}
