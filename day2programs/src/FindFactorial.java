import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find factorial");
        long num = sc.nextLong();
       long res=Factorial(num);
        System.out.println("factorial of given number is"+res);
}
static int Factorial(long num){
        int i,fact=1;
        //for(i=1;i<=num;i++){
       // fact=fact*i;
   // if(num==0)
       // return 0;
     return (num==1|| num==0)? 1: (int) (num * Factorial(num - 1));

    }
}

