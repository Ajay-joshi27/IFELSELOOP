package forloop;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n=0;
       int sum=0;
       int original=num;


       for (int i =num; i>0; i/=10) {
        n++;
       }
       for (int i =num; i>0; i/=10) {
        int digit=num%10;
        sum+=Math.pow(digit,n);
       }
       if (sum==original) {
        System.out.println("armstring number");
       }
       else{
        System.out.println("not armstring");
       }
    }
}



