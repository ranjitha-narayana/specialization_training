import java.util.Scanner;

public class EligibleForVote {
    //A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age");
    int age=sc.nextInt();
    CheckEligible(age);
}
static void CheckEligible(int age){
    if(age>=18){
        System.out.println("eligible to vote");
    }else{
        System.out.println("not eligible to vote");
    }
}
}
