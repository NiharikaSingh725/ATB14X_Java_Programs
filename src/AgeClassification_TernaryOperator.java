import java.util.Scanner;

public class AgeClassification_TernaryOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter your age:-");
        int age=sc.nextInt();
        System.out.println(age<=18&&age!=0&&age>0?"Minor":(age>=60?"Senior citizen":(age!=0&&age>0?"Adult":"Age can not be Zero ans Negative value")));
    }
}
