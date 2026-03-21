import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Please enter any three numbers of your choice, and we will tell you which one didgit is the largest among the three entered number");
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first number:-");
        int a=input.nextInt();
        System.out.println("please enter second number:-");
        int b=input.nextInt();
        System.out.println("please enter third number:-");
        int c=input.nextInt();
        int result=a>b?(a>c?a:c):(b>c?b:c);
        System.out.printf("%nThank you!%n%d is the largest number among %d %d %d ! ",result,a,b,c);
    }
}
