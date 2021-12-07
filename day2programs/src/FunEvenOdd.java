import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class FunEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        EvenOdd(num);
    }

    static   void EvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}

