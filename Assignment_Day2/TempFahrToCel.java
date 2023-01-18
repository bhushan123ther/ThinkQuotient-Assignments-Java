//Write a Java program to enter temperature and convert it °Fahrenheit into °Celsius .

import java.util.Scanner;

class TempFahrToCel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tempereture in Fahrenheit : ");
        double pahr = sc.nextDouble();
        double celsius = (pahr - 32) / 1.8;
        System.out.println("The temperature in Celsius : "+celsius);
    }
}