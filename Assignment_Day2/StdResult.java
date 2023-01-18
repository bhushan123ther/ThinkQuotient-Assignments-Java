// 2. Write a Java program to enter marks of five subjects and calculate total, average and percentage

import java.util.Scanner;

class StdResult
{
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks of first subject : ");
             float sub1 = sc.nextFloat();

            System.out.println("Enter marks of second subject : ");
             float sub2 = sc.nextFloat();

            System.out.println("Enter marks of third subject : ");
             float sub3 = sc.nextFloat();
 
            System.out.println("Enter marks of fourth subject : ");
             float sub4 = sc.nextFloat();

            System.out.println("Enter marks of fifth subject : ");
             float sub5 = sc.nextFloat();

            double total = sub1 + sub2 + sub3 + sub4 + sub5;
            
            double average = total/5;
 
            double percentage = (total/500)*100;

            System.out.println("Total is : "+total);
            System.out.println("Average is :"+average);
            System.out.println("Percentage is :"+percentage+" %");
      }

}