import java.util.Scanner;

public class FirstAndLastDigitSame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int firstNum = 0;
        int lastNum;
        lastNum=n%10;
        while(n!=0){
            firstNum=n%10;
            n=n/10;
        }
        if(firstNum==lastNum) {
            System.out.println("numbers are same");
        }
        else {
            System.out.println("numbers are different");
            
        }
    }
}
