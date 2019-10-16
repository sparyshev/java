import java.util.Scanner;

public class first2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = keyboard.nextInt();
        System.out.println("enter an next integer");
        int b = keyboard.nextInt();
        System.out.println("enter an next integer");
        int v = keyboard.nextInt();
        int c = lowerest(a,b,v);
        System.out.println("lower is " + c);
    }
    public static int lowerest(int n1, int n2, int n3){
        int min;
        if (n1<n2 && n1<n3) {
            min = n1;
        }
        else if (n2<n1 && n2<n3){
            min = n2;
            }
        else
            min = n3;
        return min;
        }
    }