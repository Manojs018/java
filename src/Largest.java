import java.util.Scanner;
public class Largest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (a < b) {
            max = b;
        }
        if (a < c) {
            max = c;
        }
        System.out.println("The largest number is: " + max);
    }
}
