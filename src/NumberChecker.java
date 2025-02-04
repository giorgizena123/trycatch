public class NumberChecker {
    public static void checkNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("რიცხვი უარყოფითია!");
        }
    }
}
