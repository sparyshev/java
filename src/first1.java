import java.util.Scanner;

public class first1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = keyboard.nextInt();
        System.out.println("enter an next integer");
        int b = keyboard.nextInt();
        int c = lowerest(a,b);
        System.out.println("lower is " + c);
    }
    public static int lowerest(int n1, int n2){
        int min;
        if (n1>n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}