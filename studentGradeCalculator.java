import java.util.Scanner;

public class studentGradeCalculator {
    public static void grade(int[] marks, int num) {
        int totalMarks = 0;
        for (int m : marks)
            totalMarks += m;
        float percentage = totalMarks / num;
        System.out.println("Total marks : "+ totalMarks);
        System.out.println(" Average Percentage : "+percentage);
        if (percentage > 90 && percentage <= 100)
            System.out.println("Grade : O");
        else if (percentage > 80 && percentage <= 90)
            System.out.println("Grade : A+");
        else if (percentage > 70 && percentage <= 80)
            System.out.println("Grade : A");
        else if (percentage > 60 && percentage <= 70)
            System.out.println("Grade : B");
        else if (percentage > 50 && percentage <= 60)
            System.out.println("Grade : C");
        else if (percentage > 40 && percentage <= 50)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("         GRADE CALCULATOR         ");
        System.out.println("==================================");
        System.out.println("Enter student name : ");
        String name = sc.next();
        System.out.println("Enter number of subjects: ");
        int num = sc.nextInt();
        System.out.println("Enter "+name +"'s marks : ");
        int[] marks = new int[num];
        for (int i = 0; i < num; i++)
            marks[i] = sc.nextInt();
        grade(marks, num);
    }

}
