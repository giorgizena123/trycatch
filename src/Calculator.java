public class Calculator {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("ნულზე გაყოფა შეუძლებელია.");
        }
        return a / b;
    }


    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("არ შეიძლება უარყოფითი რიცხვის კვადრატული ფესვის გამოთვლა.");
        }
        return Math.sqrt(number);
    }
}
