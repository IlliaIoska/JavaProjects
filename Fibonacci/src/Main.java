public class Main {
    static int num1 = 0;
    static int num2 = 1;
    static int num3;
    public static void main(String[] args) {
        printFibonacci(35);
    }

//    public static void generateFibonacci(int upperNumber) {
//        int prev1 = 0;
//        System.out.println("first fibonacci number = " + prev1);
//        int prev2 = 1;
//        System.out.println("second fibonacci number = " + prev2);
//        int fibNum = prev1 + prev2;
//        System.out.println("third Fib Number = " + fibNum);
//        int counter = 3;
//        while (fibNum < upperNumber) {
//            counter++;
//            prev1 = prev2;
//            prev2 = fibNum;
//            fibNum = prev1 + prev2;
//            System.out.println("fib Number " + counter + " = " + fibNum);
//
//        }
//    }

    public static void printFibonacci(int num) {

        if (num > 0) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            printFibonacci(num - 1);
        }
    }
}