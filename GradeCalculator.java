import java.util.Scanner;

public class GradeCalculator {

    public static void gradeCalculation(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of Subjects :");
        int n=kb.nextInt();
        double total=0,avg;
        for(int i=1;i<=n;i++){
            System.out.println("Enter your marks (out of 100) in subject "+i);
            int marks=kb.nextInt();
            total+=marks;
        }
        avg=total/n;
        System.out.println("Your total marks is "+total);
        System.out.println("Your average percentage is "+avg+" %");
        if(avg>=90){
            System.out.println("You got grade 'A'");
        }
        else if(avg>=80){
                System.out.println("You got grade 'B'");
        }
        else if(avg>=60){
            System.out.println("You got grade 'C'");
        }
        else{
                System.out.println("You got grade 'D'");
        }
    }

    public static void main(String[] args) {
        gradeCalculation();
    }
}
