public class меняетЗначенияМестами {


    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int temp = 0;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {

            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            if ((array.length % 2 != 0) && (i == j)) {
                return;
            } else {
                if (i == array.length / 2) return;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

