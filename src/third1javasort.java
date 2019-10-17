import java.util.Arrays;
import java.util.Scanner;

public class third1javasort {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrlen = keyboard.nextInt();
        System.out.println(arrayfind(arrlen));
    }

    public static int arrayfind(int n1) {
        int[] array = new int[n1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return 0;
    }
}
