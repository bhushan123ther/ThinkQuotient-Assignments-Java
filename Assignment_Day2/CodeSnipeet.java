import java.util.Scanner;

class CodeSnipeet
{
     public static void main(String[] args) {
     int a,b;
     int resulta,results,resultm;
     float resultd;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a:");
     a=sc.nextInt();

     System.out.print("Enter b:");
     b=sc.nextInt();

     resulta = a+b; // 30

     results = a-b; // 10

     resultm = a*b; // 200

     resultd = (float)a/b; //2.0

     System.out.println("The result of adding is "+resulta);
     System.out.println("The result of subtracting is "+results); 
     System.out.println("The result of multiplying is "+resultm);
     System.out.println("The result of dividing is "+resultd);
  }
}