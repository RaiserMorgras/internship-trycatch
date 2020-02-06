package tryCatchTest;

public class StringIntegerDivider {
    public static String getMessageOnRoundDivision(String x, String y) {
        try {
            int result = Integer.parseInt(x) / Integer.parseInt(y);
            return Integer.toString(result);
        }
        catch (ArithmeticException e) {
            return e.toString();
        }
        catch (NumberFormatException e) {
            return e.getClass().getName();
        }
    }
}
