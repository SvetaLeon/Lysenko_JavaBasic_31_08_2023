package ua.hillel.shutko.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 10;

//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);

//        boolean result = a != b;
//        System.out.println(result);

//        String str1 = "hello";
//        String str2 = "hello";
//        String str3 = new String("hello");

//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

//        int a = 5;
//        int b = 10;
//        int c = 15;

//        System.out.println(a > b || b < c);
//        System.out.println(a > b || b > c);
//        System.out.println(a > b || b > c || a > c || c > b);

//        System.out.println(a > b && b > c);
//        System.out.println(a < b && b < c);

//        System.out.println(a < b && b < c && true || false);

//        int x = 5;
//        System.out.println(x > 3 && x++ == 6);
//        System.out.println(x > 7 && ++x == 6);
//        System.out.println("x = " + x);

//         int a = 10;
//         int b = 10;

//         if (a < b) {
//             System.out.println("a < b");

//           if (a < b) {
//               System.out.println("a < b");
//           } else {
//               System.out.println("a >= b");

//        if (a < b) {
//            System.out.println("a < b");
//         } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a = b");
//        }
//        if (a <= b) {
//            System.out.println("a <= b");
//
//            if (a == b) {
//                System.out.println("a = b");
//            } else {
//                System.out.println("a < b");
//            }
//
//        } else {
//            System.out.println("a > b");
//        }

//if (7 > 5) {
//    System.out.println("YES!");
//} else {
//    if (7 == 7) {
//        System.out.println("7 = 7");
//    } else {
//        System.out.println("7 != 7");
//    }
//}
//
//System.out.println((5 < 4) ? "YES!" : "NO");

//  int a = 4;
//
//  switch (a) {
//      case 1: {
//          System.out.println("1");
//          break;
//      }
//      case 2: {
//          System.out.println("2");
//          break;
//      }
//      case 3: {
//          System.out.println("3");
//          break;
//      }
//      default: {
//          System.out.println("default");
//          break;
//    }
//}

//        String str = "QWE";
//
//        switch (str) {
//            case "qWE": {
//                System.out.println(1);
//                break;
//            }
//            case "QwE": {
//                System.out.println(2);
//                break;
//            }
//            case "QWe": {
//                System.out.println(3);
//                break;
//            }
//            case "QWE": {
//                System.out.println(4);
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }



        Scanner scanner = new Scanner(System.in);

//        String str = scanner.next();
//
//        System.out.println("str = " + str);
//
//        String str2 = scanner.next();
//        String str3 = scanner.next();
//        String str4 = scanner.next();
//        System.out.println("str2 = " + str2);
//        System.out.println("str3 = " + str3);
//        System.out.println("str4 = " + str4);


//        String str = scanner.nextLine();
//        System.out.println("str = " + str);


//        int number = scanner.nextInt();
//        System.out.println("number = " + number);
//        scanner.nextLine();
//
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

        System.out.println("Please enter number");

        int number = 0;
        if (scanner.hasNextInt()){
            number = scanner.nextInt();
            System.out.println("number = " + number);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println(number);

    }
}

