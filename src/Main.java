import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. ორი რიცხვის გაყოფა და ArithmeticException-ის დამუშავება
        try {
            System.out.print("შეიყვანეთ პირველი რიცხვი: ");
            int num1 = scanner.nextInt();
            System.out.print("შეიყვანეთ მეორე რიცხვი: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("გაყოფის შედეგი: " + result);
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა შეუძლებელია.");
        }

        // 2. String-დან int-ად გარდაქმნა და 100-ზე გაყოფა
        try {
            System.out.print("შეიყვანეთ რიცხვი: ");
            String input = scanner.next();
            int number = Integer.parseInt(input);
            int divisionResult = 100 / number;
            System.out.println("100 / " + number + " = " + divisionResult);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: შეიყვანეთ მხოლოდ რიცხვები.");
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა შეუძლებელია.");
        }

        // 3. NegativeNumberException-ის გამოყენება
        try {
            System.out.print("შეიყვანეთ რიცხვი NegativeNumberException-ის შესამოწმებლად: ");
            int testNumber = scanner.nextInt();
            checkNegative(testNumber);
            System.out.println("თქვენი რიცხვი პოზიტიურია.");
        } catch (NegativeNumberException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }

        // 4. კვადრატული ფესვის გამოთვლა
        try {
            System.out.print("შეიყვანეთ რიცხვი კვადრატული ფესვის გამოსათვლელად: ");
            int sqrtNumber = scanner.nextInt();
            double sqrtResult = calculateSquareRoot(sqrtNumber);
            System.out.println("კვადრატული ფესვი: " + sqrtResult);
        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }

        scanner.close();
    }

    // მეთოდი, რომელიც ამოწმებს უარყოფით რიცხვს
    public static void checkNegative(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("რიცხვი უარყოფითია!");
        }
    }

    // მეთოდი, რომელიც ითვლის კვადრატულ ფესვს
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("არ შეიძლება უარყოფითი რიცხვის კვადრატული ფესვის გამოთვლა.");
        }
        return Math.sqrt(number);
    }
}