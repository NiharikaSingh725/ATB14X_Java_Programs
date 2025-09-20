import java.util.Scanner;

public class FindMaxNumber_TernaryOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no :-");
        int num1=sc.nextInt();
        System.out.print("Enter second no :-");
        int num2=sc.nextInt();
        System.out.print("Enter third no :-");
        int num3=sc.nextInt();
        int max=(num1>num2&&num1>num3?num1:(num2>num3?num2:num3));
        System.out.printf("The maximum no is : %d",max);


    }
}
