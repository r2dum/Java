package rodjer;

public class Factorial {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 6);
        int b = 1;
        for(int i = 1; i <= a; i++){
            b *= i;
        }
        System.out.println(b);
    }
}
