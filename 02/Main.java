import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR\n");
        System.out.println("Enter the Marks Out of 100");
        System.out.println("Maths: ");
        double math = in.nextDouble();
        System.out.println("Network: ");
        double network = in.nextDouble();
        System.out.println("Physics: ");
        double physics = in.nextDouble();
        System.out.println("CS: ");
        double cs = in.nextDouble();
        System.out.println("DBMS: ");
        double dbms = in.nextDouble();

        double total_marks = math+network+physics+cs+dbms;
        double percentage = (total_marks)/5;
        if(total_marks<=500 && total_marks>=0){
        
        System.out.println("\nTotal Marks: "+total_marks);
        System.out.println("Percent: "+percentage);
        if(percentage>80){
            System.out.println("\nGrade: A\n");
        }
        else if(percentage<80 && percentage>60){
            System.out.println("\nGrade: B\n");
        }
        else if(percentage<60 && percentage>40){
            System.out.println("\nGrade: C\n");
        }
        else if(percentage<40 && percentage>33){
            System.out.println("\nGrade: D\n");
        }
        else if(percentage<33 && percentage>0){
            System.out.println("\nStudent has Failed the Exams\n");
        }
        }
        else{
            System.out.println("Invalid input of marks");
        }
        System.out.println("Scores:");
        System.out.println("Maths: "+math);
        System.out.println("Networks: "+network);
        System.out.println("Physics: "+physics);
        System.out.println("CS: "+cs);
        System.out.println("DBMS: "+dbms);
in.close();
    }
}
