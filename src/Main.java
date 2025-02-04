import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        try {
            System.out.print("შეიყვანეთ პირველი რიცხვი: ");
            int num1 = scanner.nextInt();
            System.out.print("შეიყვანეთ მეორე რიცხვი: ");
            int num2 = scanner.nextInt();
            int result = Calculator.divide(num1, num2);
            System.out.println("გაყოფის შედეგი: " + result);
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა შეუძლებელია.");
        }

        // 2.
        try {
            System.out.print("შეიყვანეთ რიცხვი: ");
            String input = scanner.next();
            int number = NumberConverter.convertToInt(input);
            int divisionResult = NumberConverter.divide100By(number);
            System.out.println("100 / " + number + " = " + divisionResult);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: შეიყვანეთ მხოლოდ რიცხვები.");
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა შეუძლებელია.");
        }

        // 3.
        try {
            System.out.print("შეიყვანეთ რიცხვი უარყოფითობის შესამოწმებლად: ");
            int testNumber = scanner.nextInt();
            NumberChecker.checkNegative(testNumber);
            System.out.println("რიცხვი დადებითია.");
        } catch (NegativeNumberException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }

        // 4.
        try {
            System.out.print("შეიყვანეთ რიცხვი კვადრატული ფესვის გამოსათვლელად: ");
            int sqrtNumber = scanner.nextInt();
            double sqrtResult = Calculator.calculateSquareRoot(sqrtNumber);
            System.out.println("კვადრატული ფესვი: " + sqrtResult);
        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }

        scanner.close();
    }
}
