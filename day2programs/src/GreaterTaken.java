import java.util.Scanner;

public class GreaterTaken {

        public static void main(String[] args) {
         //   Write a program to display a number whose digits are 3 greater than the corresponding digits of the number TAKEN.


                  //  For example, if the number is 5696, then output should be 8929


            // 5696.....
            // 8929... 1000 * 8 + 9 * 100 + 2* 10 + 9 * 1

            // 5696...

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int p = 1;
            int res =0;
            for(int r=0; n != 0 ;) {

                r = n % 10;// 5696 % 10....6
                n = n /10; // 569... 56 5 0
                r = r+3;  // rather than using if condition we can use r=r%10
                if(r >=10) {
                    r = r - 10;// 9+3=12-10=2
                    //r = r % 10;// 12 % 10===2
                }
                res = res + r * p;
                p = p* 10;

            }

            System.out.println("result...."+res);
        }

    }


