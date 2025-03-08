import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        b = a++;
        System.out.println("Post Increment(a) : " + a);
        System.out.println("Post Increment(b) : " + b);

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        y = ++x;
        System.out.println("Pre Increment(x) : " + x);
        System.out.println("Pre Increment(y) : " + y);

    }
}