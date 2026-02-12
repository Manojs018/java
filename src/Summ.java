import java.util.Scanner;

public class Summ {
    static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
        String message = greet();
        System.out.println(message);
        int anss = sum3(10,30);
        System.out.println(anss);


    }
    // return type
    static int sum2() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;


    }
    static void sum() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    // return the String

    static String greet() {
        String greeting = "Hii Manoj";
        return greeting;
    }
    //Passing the arguements

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}


