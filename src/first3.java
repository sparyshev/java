import java.util.Scanner;
import java.util.Arrays;

public class first3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = keyboard.nextInt();
        System.out.println("enter an next integer");
        int b = keyboard.nextInt();
        System.out.println("enter an next integer");
        int v = keyboard.nextInt();
        System.out.println("enter an next integer");
        int z = keyboard.nextInt();
        int c = lowerest(a,b,v,z);
        System.out.println("lower is " + c);
    }
    public static int lowerest(int n1, int n2, int n3, int n4){
        int list[]={n1,n2,n3,n4};
        int min = Arrays.stream(list).min().getAsInt();
        return min;
        }
    }