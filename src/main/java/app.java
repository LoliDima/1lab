import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение в формате(3 + 2): ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Проверяем формат ввода
        if (parts.length != 3) {
            System.out.println("Ошибка: Некорректный ввод");
        } else {
            try {
                double num1 = Double.parseDouble(parts[0]);
                char operator = parts[1].charAt(0);
                double num2 = Double.parseDouble(parts[2]);

                double result = calculate(num1, operator, num2);
                System.out.println("Результат: " + result);
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                System.out.println("Ошибка: Введите числа, а не буквы.");
            }
        }

        scanner.close();
    }

    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return 0;
                }
            default:
                System.out.println("Некорректная операция!");
                return 0;
        }
    }
}
