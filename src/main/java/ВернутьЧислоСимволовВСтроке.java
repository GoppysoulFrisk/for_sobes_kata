
import java.util.Scanner;

public class ВернутьЧислоСимволовВСтроке {
    /*1. Вернуть число встречающихся символов в слове

- public static int num (String text, char b)
    or
- public static int num (String text, String b)
*/

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = console.nextLine().toLowerCase();
        System.out.println("Введите символ: ");
        String symbol = console.nextLine().toLowerCase();
        char b = symbol.charAt(0);
        System.out.println("Вот столько символов " + b + " в строке: " + num(text, b));

        console.close();
    }


    public static int num(String text, char b) {
        int howMuch = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == b) howMuch++;
        }
        //String[] regexText = text.split(b);
        return howMuch;
    }
}