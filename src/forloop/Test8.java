package forloop;

public class Test8 {
public static void main(String[] args) {
    int number=1234;
   // int original=number;
   int sum=1;
    int count=0;
    if (number<0) {
        System.out.println("enter positive number");
    }
    else if(number==0){
        count=1;
    }
    else if (number>0) {
        for(;number>0;number=number/10){
              count++;
        }
           System.out.println(count+"::: is the number count"); 
        
    }
    for (int i = count; i>0; i--) {
        sum *=i;
    }
    System.out.println(sum);
}
}
