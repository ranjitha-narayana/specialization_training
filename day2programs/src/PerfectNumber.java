import java.util.Scanner;

public class PerfectNumber {
    //Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
    //  [An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3].
    public static void main(String[] args) {
        int num, p;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check if it is perfect num or not");
        num = sc.nextInt();
        p = CheckPerfectOrNot(num);
        if (p == num)
            System.out.println("It is A perfect number...." );
        else
            System.out.println("it is not a perfect number..." );
    }

    static int CheckPerfectOrNot(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}