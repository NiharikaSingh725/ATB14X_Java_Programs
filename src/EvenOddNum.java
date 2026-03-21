import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        System.out.println("Could you please enter number to find out if it is an even number or an odd number? ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        String result=a%2==0?"is an even number.":"is an odd number.";
        System.out.printf("Thank you!%nYour entered number'%d'%s",a,result);
    }
}
