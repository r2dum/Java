package rodjer;

import java.util.Scanner;

public class Hepotenuza {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scan.nextInt();
        System.out.print("Введіть число: ");
        int b = scan.nextInt();
        System.out.println(Math.sqrt(a*a + b*b));
    }
}