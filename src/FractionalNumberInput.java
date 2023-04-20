import java.util.Scanner;

public class FractionalNumberInput {

    public static float getFractionalNumber() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                number = Float.parseFloat(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите дробное число.");
            }
        }

        return number;
    }

}
