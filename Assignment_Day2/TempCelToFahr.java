//Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.

import java.util.Scanner;

class TempCelToFahr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celsius : ");
        double cel = sc.nextDouble();
        double fahrenheit = (cel * 1.8) + 32;
        System.out.println("The temperature in fahrenheit : "+fahrenheit);
    }
}