import java.util.Arrays;
import java.util.Scanner;

public class second1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrlen = keyboard.nextInt();
        System.out.println("Что найти?");
        int a = keyboard.nextInt();
        System.out.println(arrayfind(arrlen,a) == 1 ? "true" : "false");
    }
    public static int arrayfind(int n1, int n2){
        int answer = 0;
        int []array = new int[n1];
        for (int i=0;i<array.length;i++) {
            array[i] = (int)(Math.random()*20);
        }
        System.out.println(Arrays.toString(array));
        long startTime = System.nanoTime();
        for (int i=0;i<array.length;i++) {
            if (i==n2){
                answer = 1;
                break;
            }
            else{
                continue;
            }
        }
        long timeSpent = System.nanoTime() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " наносекунд");
        return answer;
        }
    }