package forloop;

import java.util.Scanner;

public class Test6 {
    
public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
        double n=s.nextDouble();
         double sum=1;
    for (double i = 1; i <=n; i++) {
         sum =sum*i;
         System.out.println(sum);
    }
    System.out.println(sum);
}
}
