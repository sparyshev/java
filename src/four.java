import java.util.Arrays;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = keyboard.nextLine();
        System.out.println("Теперь введите что найти:");
        String a = keyboard.nextLine();
        System.out.println(finder(text,a));
    }

    public static int finder(String text, String a) {
        int x = 0;
        char[] array = text.toCharArray();
        char[] array2 = a.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array2[0]){
                x+=1;
            }
        }
        return x;
    }
}
