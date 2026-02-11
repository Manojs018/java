import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean prime = true;
        int num = in.nextInt();
        for(int i = 2; i >= num; i++){
            if(i % 2 == 0) {
                prime = false;
            }
        }
        System.out.println(prime);
    }
}
