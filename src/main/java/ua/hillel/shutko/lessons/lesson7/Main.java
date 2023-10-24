package ua.hillel.shutko.lessons.lesson7;

public class Main {
    public static void main(String[] args) {
//        int [] array = new int[5];
//        array [0] = 1;
//        array [1] = 2;
//        array [2] = 3;
//        array [3] = 4;
//        array [4] = 5;
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


//        int[] array = new int[]{1, 2, 3, 4, 5};
//
//        int[] array = {1, 2, 3, 4, 5};
//
//        System.out.println(array.length);
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        int [] arr = new int[10]; // from 100 to 109
//        for (int i = 0; i < arr.length; i++) {
//            arr [i] = i + 100;
//            System.out.println(arr[i]);
//        }

//        int[] array = {1, 2, 3, 4, 5, 6};
//        for (int value : array) {
//            System.out.println(value);
//        }

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
//           int randomNumber = (int) (Math.random() * 11);
            numbers[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

//        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 90, 6};
//        int indexMaxValue = 0;
//        int maxValue = people[0];
//        for (int i = 1; i < people.length; i++) {
//            if (people[i] > maxValue) {
//                maxValue = people[i];
//                indexMaxValue = i;
//            }
//        }
//        System.out.println("max value = " + maxValue + ", index: "+ indexMaxValue);

        // BAD COPY VERSION!!!!
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = array1;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));


//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array1.length];
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//        }
//
//        array2[0] = 99;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOf(array1, array1.length);
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 55;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));


//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOfRange(array1, 2, 5);
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 55;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));


//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array1.length];
//
//        System.arraycopy(array1, 0, array2, 0, array1.length);
//        System.arraycopy(array1, 2, array2, 1, 3);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));




//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//        }
//        System.out.println(Arrays.toString(team));
//
//        int sumTeamMain = 0;
//        int sumTeamReserve = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                sumTeamMain += team[i];
//            } else {
//                sumTeamReserve += team[i];
//            }
//        }
//
//        System.out.println("team main = " + sumTeamMain);
//        System.out.println("team reserve = " + sumTeamReserve);
//
//        if (sumTeamMain > sumTeamReserve) {
//            System.out.println("Team main won!");
//        } else if (sumTeamReserve > sumTeamMain) {
//            System.out.println("Team reserve won!");
//        } else {
//            System.out.println("Draw!");
//        }

    }
}

