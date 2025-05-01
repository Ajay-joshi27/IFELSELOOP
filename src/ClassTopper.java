import java.util.Scanner;

public class ClassTopper {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter your marks");

    System.out.println("ENTER A MARKS");
    int a=s.nextInt();

    System.out.println("ENTER A MARKS");
    int b=s.nextInt();

    System.out.println("ENTER A MARKS");
    int c=s.nextInt();

    if (a>b &a>c)
     {
        System.out.println("A is the topper of class");
    }
    else if(b>c& b>c)
    {
        System.out.println(" B is topper of class");
    }
    else if (c>a&c>b) 
    {
        System.out.println("C is topper of class");
    }
    else
    {
        System.out.println("all are having equal marks");
    }
}
}
