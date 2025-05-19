package forloop;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int number=s.nextInt();
        int original=number;
        int digit=0;
        int count=0;
        int sum=0;
            //this for loop is to count how many number of digit are there 
        for (int i =1;number>0; i++) {
            number=number/10;
            count++;
        }
         number=original;
    //          this logic is for armstrong number  
        for(int i =1;number>0;i++){
            digit=number%10;
             sum+=(int)Math.pow(digit,count);
            number=number/10;
            
        }
        if (original==sum) {
            System.out.println(original+" is a armstrong number");
        }
            else{
                System.out.println(original+" is not an armstrong number");
            }
            
       
    }
}