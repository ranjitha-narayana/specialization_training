import java.util.Scanner;
//Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumOfTwoNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any 2 numbers");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        Sum(num1,num2);
}
static void Sum(int num1,int num2){
    int add=num1+num2;
    System.out.println("sum of two numbers is:"+add);
    }
}