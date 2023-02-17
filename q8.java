import java.util.Scanner;

class Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public int subtract(int a, int b, int c, int d) {
        return a - b - c - d;
    }
}

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter 2 numbers to subtract");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 3 numbers to subtract");
        int c1 = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Enter 4 numbers to subtract");
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("Subtraction of 2 numbers is " + c.subtract(a, b));
        System.out.println("Subtraction of 3 numbers is " + c.subtract(c1, d, e));
        System.out.println("Subtraction of 4 numbers is " + c.subtract(f, g, h, i));
    }
}
