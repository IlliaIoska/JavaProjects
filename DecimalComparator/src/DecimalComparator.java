public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        double operand1 = num1 * 1000;
        double operand2 = num2 * 1000;

        if (operand1 == operand2) {
            return true;
        }
        return false;
    }
}
