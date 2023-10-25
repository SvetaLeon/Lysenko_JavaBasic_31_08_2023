package ua.hillel.shutko.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World");
//        }

//        int i = 0;
//        for (; i < 6; i++) {
//            System.out.println("Hello World");
//        }
//        System.out.println(i);

//        int i = 0;
//        for (; i <= 10; i += 2 ) {
//            System.out.println(i);
//        }

//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }


//        for (int i = 0; i < 10; i++) {
//
//            if (i == 5 || i == 7) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 3) {
//                continue;
//            }
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }

//        int counter = 0;
//        for (int i = 0; i < 3; i++) {
//
//            for (int j = 0; j < 3; j++) {
//              counter++;
//                System.out.println("i " + i);
//                System.out.println("j " + j);
//                System.out.println("counter " + counter);
//            }
//
//        }

//        int counter2 = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 10; k++) {
//                    for (int l = 0; l < 2; l++) {
//                        for (int m = 0; m < 3; m++) {
//                            counter2++;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("counter2 = " + counter2);

//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }

////      version 1
//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }
//        System.out.println();
////      version 2
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//
//        System.out.print(num1 + ", " + num2 + ", ");
//        for (int i = 0; i < 9; i++) {
//        sum = num1 + num2;
//            System.out.print(sum + ", ");
//            num1 = num2;
//            num2 = sum;
//        }


//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        int j = 0;
//        do {
//            System.out.println(j);
//        } while (j == 1);

//        int i = 0;
//        while (i < 10) {
//            i++;
//            if (i == 5) {
//                continue;
//            }
//
//            if (i == 7) {
//               break;
//            }
//
//            System.out.println(i);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter integer number from 10 to 20");
            if (sc.hasNextInt()) {
                int userValue = sc.nextInt();
                if (userValue >= 10 && userValue <= 20) {
                    System.out.println("user value = " + userValue);
                    break;
                } else {
                    System.out.println("FROM 10 TO 20!!!");
                }
            } else {
                System.out.println("Wrong data! Try again!");
            }
            sc.nextLine();

        }


//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int i = 10;
//        while (i >= 0) {
//            int randomNumber = (int) (Math.random() * 101);
//            System.out.println("randomNumber " + randomNumber);
//            if (randomNumber >= 85 && randomNumber <= 100) {
//                System.out.println("WIN!!!!!!!!!!");
//                break;
//            }
//            System.out.println(i);
//            if (i == 0) {
//                System.out.println("BOOOOOOOOM!!!");
//            }
//            i--;
//        }


//        int counter = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i == 4 || i == 9) {
//                continue;
//            }
//            counter++;
//            System.out.println(i);
//        }

//        System.out.println("counter = " + counter);

//        int randomNumber = (int) (Math.random() * 11);
//        System.out.println("randomNumber " + randomNumber);
//        if (randomNumber < 2) {
//         System.out.println("The entered number is greater than the specified");
//        } else {
//         System.out.println("The entered number is less than specified");
//        }

//        version 1
//        int counter = 0;
//        for (int i = 1; i < 156; i++) {
//            if (i % 10 == 4 || i / 10 == 4) {
//                continue;
//            }
//            if (i % 10 == 9 || i / 10 == 9) {
//                continue;
//            }
//            if (i % 100 / 10 == 40 / 10) {
//                continue;
//            }
//            if (i % 100 / 10 == 90 / 10) {
//                continue;
//            }
//            counter++;
//            System.out.println("Shuttles " + i);
//        }
//        System.out.println("Of all shuttles = " + counter);


//        int maxShuttlesNoUnluckyNumbers = 100;
//        int initialNumberShuttles = 0;
//        int numberShuttles = 160;
//        int counter = 0;
//
//        if (initialNumberShuttles < numberShuttles) {
//        while (initialNumberShuttles < numberShuttles) {
//            initialNumberShuttles++;
//
//            if (initialNumberShuttles % 10 == 4 || initialNumberShuttles / 10 == 4) {
//                continue;
//            }
//            if (initialNumberShuttles % 10 == 9 || initialNumberShuttles / 10 == 9) {
//                continue;
//            }
//            if (initialNumberShuttles % 100 / 10 == 40 / 10) {
//                continue;
//            }
//            if (initialNumberShuttles % 100 / 10 == 90 / 10) {
//                continue;
//            }
//            if (counter == maxShuttlesNoUnluckyNumbers){
//               break;
//            }
//            System.out.println("Shuttles " + initialNumberShuttles);
//            counter++;
//       }
//        System.out.println("The total number of shuttles to transport people to Mars = " + counter);
//    } else if (initialNumberShuttles > numberShuttles) {
//            while (initialNumberShuttles > numberShuttles) {
//                initialNumberShuttles--;
//
//                if (initialNumberShuttles % 10 == 4 || initialNumberShuttles / 10 == 4) {
//                    continue;
//                }
//                if (initialNumberShuttles % 10 == 9 || initialNumberShuttles / 10 == 9) {
//                    continue;
//                }
//                if (initialNumberShuttles % 100 / 10 == 40 / 10) {
//                    continue;
//                }
//                if (initialNumberShuttles % 100 / 10 == 90 / 10) {
//                    continue;
//                }
//                if (counter == maxShuttlesNoUnluckyNumbers){
//                    break;
//                }
//                System.out.println("Shuttles " + initialNumberShuttles);
//                counter++;
//            }
//            System.out.println("The total number of shuttles to transport people to Mars = " + counter);
//        }
//
//        int i = 2354;
//        int result1 = i / 100 / 10;
//        int result2 = i / 100 % 10;
//        int result3 = i % 100 / 10;
//        int result4 = i % 10;
//
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
    }
}


