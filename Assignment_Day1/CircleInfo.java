//5. Write a Java program to enter radius of a circle and find its diameter, circumference and area.

class CircleInfo
{
     public static void main(String[] args)
     {
          float radius = 4.5f;
          float area = 3.14f * (radius * radius);

          System.out.println("Area of circle is : "+area); 
          System.out.println("Diameter of circle is :"+(2*radius));  
          System.out.println("Circumference of circle is : "+(2*3.14*radius));
     }
}