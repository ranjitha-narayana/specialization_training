import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of student");
        int marks = sc.nextInt();
        CheckGrade(marks);
    }

    static void CheckGrade(int marks) {
        if (marks >= 91 && marks <= 100)
            System.out.println("Grade is:AA");

        if (marks >= 81 && marks <= 90)
            System.out.println("Grade is:AB");
        if (marks >= 71 && marks <= 80)
            System.out.println("Grade is:BB");
        if (marks >= 61 && marks <= 70)
            System.out.println("Grade is:BC");
        if (marks >= 51 && marks <= 60)
            System.out.println("Grade is:CD");
        if (marks >= 41 && marks <= 50)
            System.out.println("Grade is:DD");
        else if(marks<=40){
            System.out.print("Fail........");
        }

    }
}

