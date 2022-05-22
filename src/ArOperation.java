public class ArOperation {
    public static String calculate(String num1, String operation, String num2) throws Exception {
        int result;
        switch (operation) {
            case ("+"):
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                break;
            case ("-"):
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                break;
            case ("*"):
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                break;
            case ("/"):
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                break;
            default:
                throw new Exception();}
        return Integer.toString(result);

    }
}
