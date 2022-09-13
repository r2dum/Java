package rodjer;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scan.nextInt();
        System.out.print("Введіть число: ");
        int b = scan.nextInt();
        System.out.println(sumInt(a, b));
        System.out.println(subInt(a, b));
        System.out.println(umnojInt(a, b));
        System.out.println(delInt(a, b));
    }
    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static int subInt(int a, int b) {
        return a - b;
    }

    public static int umnojInt(int a, int b) {
        return a*b;
    }

    public static int delInt(int a, int b) {
        return a/b;
    }
}
