public class NumberConverter {
    public static int convertToInt(String str) {
        return Integer.parseInt(str);
    }

    public static int divide100By(int number) {
        if (number == 0) {
            throw new ArithmeticException("ნულზე გაყოფა შეუძლებელია.");
        }
        return 100 / number;
    }
}
