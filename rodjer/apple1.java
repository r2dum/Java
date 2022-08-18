package rodjer;

import java.util.Scanner;

public class apple1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scan.nextInt();
        System.out.print("Введіть число: ");
        int k = scan.nextInt();
        System.out.println(k%n);
    }
}