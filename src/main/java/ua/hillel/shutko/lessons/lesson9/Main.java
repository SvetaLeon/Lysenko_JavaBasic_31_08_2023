package ua.hillel.shutko.lessons.lesson9;

public class Main {
    public static void main(String[] args) {

//       *** Two-dimensional array
//        int[][] array = new int[3][4];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//               array[i][j] = (int) (Math.random() * (20 - 10 + 1) + 10);
//            }
//        }
//        System.out.println(Arrays.deepToString(array));
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//
//        System.out.println();
//
//        System.out.println("Number string 1 column 1 = " + array[1][1]);

//        int[][] array2 = {
//                {5, 6, 5},
//                {6, 5, 6},
//                {5, 6, 5}
//        };
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] array3 = {
//                {5, 5, 5, 5},
//                {6, 6, 6},
//                {5, 5},
//                {6}
//        };
//
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                System.out.print(array3[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        System.out.println(array3.length);
//        System.out.println(array3[0].length);
//        System.out.println(array3[1].length);
//        System.out.println(array3[2].length);
//        System.out.println(array3[3].length);

        // TASK 1

// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//       0 1 2 3 4

//0      1 0 0 0 0  // 00
//1      0 1 0 0 0  // 11
//2      0 0 1 0 0  // 22
//3      0 0 0 1 0  // 33
//4      0 0 0 0 1  // 44

//       0 1 2 3 4

//0      0 0 0 0 1  // 04
//1      0 0 0 1 0  // 13
//2      0 0 1 0 0  // 22
//3      0 1 0 0 0  // 31
//4      1 0 0 0 0  // 40

//        int[][] array4 = new int[5][5];

//        version 1
//        for (int i = 0; i < array4.length; i++) {
//            for (int j = 0; j < array4[i].length; j++) {
//                if (i == j) {
//                  array4[i][j] = 1;
//                }
//            }
//        }

//         version 2
//        for (int i = 0; i < array4.length; i++) {
//            array4[i][i] = 1;
//        }
//        version 1
//        for (int i = 0; i < array4.length; i++) {
//            for (int j = 0; j < array4[i].length; j++) {
//                if ((i + j) == array4[i].length - 1) {
//                    array4[i][j] = 1;
//                }
//            }
//        }

//        version 2
//        for (int i = 0, j = array4.length - 1; i < array4.length; i++, j--) {
//                    array4[i][j] = 1;
//        }

//        version 3
//        for (int i = 0; i < array4.length; i++) {
//                  array4[i][array4[i].length - 1 - i] = 1;
//        }
//
//        for (int i = 0; i < array4.length; i++) {
//            for (int j = 0; j < array4[i].length; j++) {
//                System.out.print(array4[i][j] + "\t");
//            }
//            System.out.println();
//        }

        // TASK 2

//      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W  //00, 02, 04, 06   0, 2, 4, 6
//      W B W B W B W B  //11, 13, 15, 17   2, 4, 6, 8
//      B W B W B W B W  //20, 22, 24, 26   2, 4, 6, 8
//      W B W B W B W B  //31, 33, 35, 37   4, 6, 8, 10
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B

//        char[][] chess = new char[8][8];
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    chess[i][j] = 'B';
//                } else {
//                    chess[i][j] = 'W';
//                }
//            }
//        }
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//          }

//       *** Three-dimensional array

//            int[][][] array5 = new int[3][2][4];

//            int[][][] array6 = {
//                    {
//                            {1, 2, 3, 4},
//                            {4, 3, 2, 1}
//                    },
//                    {
//                            {5, 6, 7, 8},
//                            {8, 7, 6, 5}
//                    },
//                    {
//                            {1, 2, 3, 4},
//                            {4, 3, 2, 1}
//                    }
//            };

//        System.out.println(array6[0][1][0]);
//
//        System.out.println();
//
//        System.out.println(Arrays.toString(array6[0]));
//        System.out.println(Arrays.toString(array6[0][0]));
//
//        System.out.println();
//
//        System.out.println(array6.length);
//        System.out.println(array6[0].length);
//        System.out.println(array6[0][0].length);

//        for (int i = 0; i < array6.length; i++) {
//            for (int j = 0; j < array6[i].length; j++) {
//                for (int k = 0; k < array6[i][j].length; k++) {
//                    System.out.print(array6[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

//       *** Four-dimensional array
//        int[][][][] array =
//                {
//                        {
//                                {
//                                        {18, 28},
//                                        {45, 90, 45}
//                                },
//                                {
//                                        {97, 15, 50},
//                                        {54, 89}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {78, 54, 35}
//                                }
//                        },
//                        {
//                                {
//                                        {18, 85, 24},
//                                        {45, 90, 45, 60}
//                                },
//                                {
//                                        {37, 25, 50, 55},
//                                        {20, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {11, 17, 38, 11}
//                                }
//                        }
//                };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    for (int l = 0; l < array[i][j][k].length; l++) {
//                        System.out.print(array[i][j][k][l] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

//      ***  Dynamic array
//        int[] array7 = {1, 2, 3};
//
//        int[] array8 = new int[array7.length + 2];
//
//        for (int i = 0; i < array7.length; i++) {
//            array8[i] = array7[i];
//        }
//
//        System.out.println(Arrays.toString(array8));
//
//        array8[3] = 4;
//        array8[4] = 5;
//
//        System.out.println(Arrays.toString(array8));
//
//        array7 = array8;
//
//        System.out.println();
//        System.out.println(Arrays.toString(array7));


//        int[] array9 = {1, 2, 3};
//
//        int[] qwe = Arrays.copyOf(array9, array9.length + 2);
//
//        System.out.println(Arrays.toString(array9));
//        System.out.println(Arrays.toString(qwe));


//        int[][] array10 = new int[2][3];
//        System.out.println(array10.length);
//        System.out.println(array10[0].length);
//        System.out.println(array10[1].length);
//
//        array10 = Arrays.copyOf(array10, 3);
//
//        array10[2] = new int[3];
//        System.out.println();
//
//        System.out.println(array10.length);
//        System.out.println(array10[0].length);
//        System.out.println(array10[1].length);
//        System.out.println(array10[2].length);
//
//        System.out.println();
//
//        for (int i = 0; i < array10.length; i++) {
//            for (int j = 0; j < array10[i].length; j++) {
//                System.out.print(array10[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] array11 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int[] ints : array11) {
//            for (int value: ints) {
//                System.out.print(value + "\t");
//            }
//            System.out.println();
//        }


        // Оголошення та ініціалізація п'ятивимірного масиву
        int[][][][][] fiveDimArray = {
                {
                        {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}},
                        {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}
                },
                {
                        {{{17, 18}, {19, 20}}, {{21, 22}, {23, 24}}},
                        {{{25, 26}, {27, 28}}, {{29, 30}, {31, 32}}}
                }
        };

        // Виведення значень п'ятивимірного масиву
        for (int i = 0; i < fiveDimArray.length; i++) {
            for (int j = 0; j < fiveDimArray[i].length; j++) {
                for (int k = 0; k < fiveDimArray[i][j].length; k++) {
                    for (int l = 0; l < fiveDimArray[i][j][k].length; l++) {
                        for (int m = 0; m < fiveDimArray[i][j][k][l].length; m++) {
                            int value = fiveDimArray[i][j][k][l][m];
                            System.out.println("fiveDimArray[" + i + "][" + j + "][" + k + "][" + l + "][" + m + "] = " + value);
                        }
                    }
                }
            }
        }

        for (int[][][][] arr1 : fiveDimArray) {
            for (int[][][] arr2 : arr1) {
                for (int[][] arr3 : arr2) {
                    for (int[] arr4 : arr3) {
                        for (int value : arr4) {
                            System.out.print(value + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
