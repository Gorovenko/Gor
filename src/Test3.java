import java.util.Scanner;

public class Test3 {


    public static class Calculator {
        public static void main(String[] args) {
            int[] arab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Введите данные, наприер: 2 + 2");
                int n1 = scanner.nextInt();
                String operation = scanner.next();
                int n2 = scanner.nextInt();

                switch (operation) {
                    case "+":
                        System.out.println("Ответ " + (n1 + n2));
                        break;

                    case "-":
                        System.out.println("Ответ " + (n1 - n2));
                        break;

                    case "/":
                        System.out.println("Ответ " + (n1 / n2));
                        break;

                    case "*":
                        System.out.println("Ответ " + (n1 * n2));
                        break;

                    default:
                        System.out.println("Ошибка ввода");
                }
            }
        }
    }
}