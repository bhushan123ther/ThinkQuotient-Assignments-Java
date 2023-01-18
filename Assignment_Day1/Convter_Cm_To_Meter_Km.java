//6. Write a Java program to enter length in centimeter and convert it into meter and kilometer.

class Convter_Cm_To_Meter_Km
{
     public static void main(String[] args)
     {
          // convert cm to meter
          double cm = 100;
          double meter = cm / 100.0;
          System.out.println(cm+" cm  means => "+meter+" meter.");

         // convert cm to km
         double kilometer = cm / 100000.0;
          System.out.println(cm+" cm  means => "+kilometer+" kilometer.");
     }
}