import java.util.Scanner;

public class Find_EvenOdd_Number_TernaryOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no=sc.nextInt();
        int a=no%2;
        System.out.println(a==0?"Entered Number is even":"Entererd Number is odd");

    }
}
