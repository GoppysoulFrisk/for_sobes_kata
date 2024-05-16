public class СреднееАрифметическое {
    /*
    *3. Вернуть число среднее арифметическое всех элементов массива / вернуть в дабл
    *
    * - public static int average (int [] array)
    * or
    *
    *
    */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Среднее арифметическое массива "+average(array));

    }
    public static double average (int [] array){
        double average = array[0];
        for (int i = 1; i < array.length; i++) {
            average += array[i];
        }
        average = average/array.length;
        return average;

    }
}
