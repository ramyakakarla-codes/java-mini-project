import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the subject1 marks:");
        int m1 = sc.nextInt();
        System.out.println("Enter the subject2 marks:");
        int m2 = sc.nextInt();
        System.out.println("Enter the subject3 marks");
        int m3 = sc.nextInt();
        System.out.println("Enter the subject4 marks");
        int m4 = sc.nextInt();
        System.out.println("Enter the subject5 marks");
        int m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        double average = total/5.0;
        char grade;
        if(average>=90)
        grade ='A';
    else if(average>=80)
        grade = 'B';
    else if(average>=70)
        grade = 'C';
    else
    grade = 'D';
System.out.println("\n--- students report---");
System.out.println("Name:" + name);
System.out.println("marks:" + total);
System.out.println("average:" + average);
System.out.println("grade:" + grade);
sc.close();
        }
    
}

