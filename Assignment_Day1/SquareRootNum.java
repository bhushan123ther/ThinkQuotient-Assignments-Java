import java.util.Scanner;

class SquareRootNum
{
     public static void main(String[] args)
     {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter any number to find the square root : ");
           double number = sc.nextDouble();

           double sqr = Math.sqrt(number);
           System.out.println("The square root of "+number+" is "+sqr);
     }
}