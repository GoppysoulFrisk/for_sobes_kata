/*Вернуть отдельно сумму четных и нечетных массива / без возвращения вывести в консоль
 *
 *- public static int [] sumOfEvenAndOdd (int [] array)
 *    or
 *- public static void sumOfEvenAndOdd (int [] array)*/

public class Task7 {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8};
        int[] summa = sumOfEvenAndOdd(array);
        System.out.println("сумма четных: "+ summa[0] + "\nсумма нечетных: " +summa[1]);
    }
    public static int [] sumOfEvenAndOdd (int [] array){
        int sumEVEN = 0, sumODD = 0;

        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0){
                sumEVEN += array[i];
            } else sumODD += array[i];
        }
        return new int[] {sumEVEN, sumODD};
    }

}
