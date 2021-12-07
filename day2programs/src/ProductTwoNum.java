import java.util.Scanner;

public class ProductTwoNum {
    //Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any 2 numbers");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        Product(num1,num2);
    }
    static void Product(int num1,int num2){
        int mul=num1*num2;
        System.out.println("Product of two numbers is:"+mul);
    }
}

