import java.util.Scanner;

public class ВернутьСловоБезЦифр {
    /*
     * - public static String result (String text)
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите буквы и цифры вперемешку и я удалю все цифры! Я - молодец!");
        String text = console.nextLine();

        System.out.println("Ваше слово: " + result(text));
    }

    public static String result(String text) {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            for (int j = 0; j < numbers.length; j++) {
                if ( ch == numbers[j]){
                    text = text.replace(ch, '\u0000');
                    break;
                }

            }
        }
        return text;
    }
}
