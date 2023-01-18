//3. Write a Java program to enter length and breadth of a rectangle and find its perimeter.

class PerimeterOfRect
{
     public static void main(String[] args)
     {
          float length = 8.2f;
          float breadth = 4.5f;

          double perimeter = 2 * (length + breadth);
          System.out.println("The perimeter of rectangle is : "+perimeter);
     }
}