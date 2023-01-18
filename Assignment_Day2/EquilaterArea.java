// 1. Write a Java program to calculate area of an equilateral triangle.

import java.util.Scanner;

class EquilaterArea
{
      public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter angle : ");
          float angle = sc.nextFloat();
          double area = ( 1.73 * angle * angle) / 4 ;
          System.out.println("The area of equilater triangle is :  "+area);  
      }
}