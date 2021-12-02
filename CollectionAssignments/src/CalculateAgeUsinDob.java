import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAgeUsinDob {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Dob (yyyy-mm-dd format only)");
        String str=sc.nextLine();
        LocalDate dob;
        dob=LocalDate.parse(str);
        System.out.println("Age is:"+calcAge(dob));
    }
    static  int calcAge(LocalDate dob){
        LocalDate cur_date=LocalDate.now();
        int age= Period.between(dob,cur_date).getYears();
        return age;
    }
}
