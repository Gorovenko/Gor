import java.util.Scanner;

public class Test3 {


    public static class Calculator {
        public static void main(String[] args) {
            int[] arab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            String[] rom = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};


            int number;
            int number2;
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
      //          Scanner keyb = new Scanner(System.in);
                String roman = scanner.next();
                String oper = scanner.next();
                String roman2 = scanner.next();
                roman = roman.toUpperCase();
                roman2 = roman2.toUpperCase();

                String letter = roman;

                switch (letter) {
                    case "I":
                        number = 1;
                        break;
                    case "II":
                        number = 2;
                        break;
                    case "III":
                        number = 3;
                        break;
                    case "IV":
                        number = 4;
                        break;
                    case "V":
                        number = 5;
                        break;
                    case "VI":
                        number = 6;
                        break;
                    case "VII":
                        number = 7;
                        break;
                    case "VIII":
                        number = 8;
                        break;
                    case "IX":
                        number = 9;
                        break;
                    default:
                        number = -1;
                        break;
                }
                String letter2 = roman2;

                switch (letter2) {
                    case "I":
                        number2 = 1;
                        break;
                    case "II":
                        number2 = 2;
                        break;
                    case "III":
                        number2 = 3;
                        break;
                    case "IV":
                        number2 = 4;
                        break;
                    case "V":
                        number2 = 5;
                        break;
                    case "VI":
                        number2 = 6;
                        break;
                    case "VII":
                        number2 = 7;
                        break;
                    case "VIII":
                        number2 = 8;
                        break;
                    case "IX":
                        number2 = 9;
                        break;
                    default:
                        number2 = -1;
                        break;
                }
                switch (oper) {
                    case "+":

                        System.out.println("Ответ " + (number + number2));
                        break;

                    case "-":
                        System.out.println("Ответ " + (number - number2));
                        break;

                    case "/":
                        System.out.println("Ответ " + (number / number2));
                        break;

                    case "*":
                        System.out.println("Ответ " + (number * number2));
                        break;

                    default:
                        System.out.println("Ошибка ввода");
 //                       System.out.println(number);
                }
            }
        }
    }
}

