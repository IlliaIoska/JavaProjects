public class Polindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int num) {

        if(num >= 0) {
            int updatedNum = num;
            int digit = updatedNum % 10;
            int comparisonNum = 0;

            while(updatedNum > 0) {
                digit = updatedNum % 10;
                updatedNum = (updatedNum - digit) / 10;
                comparisonNum = comparisonNum * 10 + digit;
            }

            if(comparisonNum == num) {
                return true;
            }
            return false;
        }
        return false;
    }
}
