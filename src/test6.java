//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class test6 {
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            Scanner scanner = new Scanner(System.in);
//
//            String[] romans = {"i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x"};
//
//            String number1 = reader.readLine();
//            String operation = scanner.next();
//            String number2 = reader.readLine();
//
//            for (int i = 0; i < 10; i++) {
//                if (romans[i].equals(number1)) ;
//                return ;
//                else if (romans[i].equals(number2)) ;
//
//                switch (operation) {
//                    case "+":
//                        System.out.println("Ответ " + Integer.sum (number1, number2));
//                        break;
//
//                    //   case "-":
//                    //     System.out.println("Ответ " + (number1 - number2));
//                    //   break;
//
//                    //    case "/":
//                    //      System.out.println("Ответ " + (number1 / number2));
//                    //    break;
//
//                    // case "*":
//                    //   System.out.println("Ответ " + (number1 * number2));
//                    // break;
//
//                    default:
//                        System.out.println("Ошибка ввода");
//                        System.out.println(i);
//                }
//            }
//        }
//    }
//
