package rodjer;

public class one_to_oneh {

    public static void main(String[] args) {
        int a = 1;
        do{
            if(a%5 == 0){
                System.out.println(a);
                a++;
            }
            else {
                a++;
            }
        }
        while(a < 101);
    }
}
