import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1 - 4");
        //первый массив
        int[] arrayOne = {1, 2, 3};
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(arrayOne[2] + ", " + arrayOne[1] + ", " + arrayOne[0]);
        //второй массив
        float[] arrayTwo = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(arrayTwo[2] + ", " + arrayTwo[1] + ", " + arrayTwo[0]);
        //третий массив
        String[] arrayThree = {"One", "Two", "Three"};
        System.out.println(Arrays.toString(arrayThree));
        System.out.println(arrayThree[2] + ", " + arrayThree[1] + ", " + arrayThree[0]);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        System.out.println("Задача 5");
        int[] arr = generateRandomArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей");

    }

    public static void task3() {
        System.out.println("Задача 6");
        int[] arr1 = generateRandomArray();
        int min = 200_001;
        int max = 99_999;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min / 30 + " рублей. Максимальная сумма трат за день составила " + max / 30 + " рублей");
        // Я не уверен что стоило переводить в дни, может задачу не совсем правильно понял, осталось ощущение что не до конца условия понятны)
    }

    public static void task4() {
        System.out.println("Задача 7");
        int[] arr2 = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        float medium = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей");

    }
    public static void task5 () {
        System.out.println("Задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}