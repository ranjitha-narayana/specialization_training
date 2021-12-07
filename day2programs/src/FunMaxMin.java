import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

public class FunMaxMin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
         int num1=sc.nextInt();
         int num2= sc.nextInt();
         int num3= sc.nextInt();
         int l=large(num1,num2,num3);
         System.out.println("maximum number is:"+l);
         int s=small(num1,num2,num3);
        System.out.println("minimum number is:"+s);


    }
    public  static int large(int num1,int num2,int num3){
        int max=num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        return max;
    }
    public  static int small(int num1,int num2,int num3){
        int min=num1;
        if(num2<min){
            min=num2;
        }
        if(num3<min){
            min=num3;
        }
        return min;
    }
}
