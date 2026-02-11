import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = input.nextInt();
        int original = num;
        int count = 0;
        int sum = 0;

        while(num > 0) {
            count++;
            num = num / 10;

        }
        num = original;
        while(num > 0) {
            int digit = num % 10;
            int power = 1;

            for (int i = 1; i <= count;i++) {
                power = power * digit;

            }
            sum = sum + power;
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        }  else {
            System.out.println("Not Armstrong Number");
        }
    }
}
