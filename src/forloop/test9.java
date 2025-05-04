package forloop;

public class test9 {
public static void main(String[] args) {
    int num=43;
    int count=0;
    int digit=0;
    for (int i = 1; i<=num;i++ ) {
        if(num%i==0){
             digit=num;
             System.out.println(digit);
        count++;
    }}
  
    if (count==2) {
        System.out.println(num+"  is a prime number");
    }
    else {
        System.out.println(num+" it is not prime number");
    }
  
}
}
