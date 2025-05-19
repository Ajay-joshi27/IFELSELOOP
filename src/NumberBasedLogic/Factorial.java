package NumberBasedLogic;
public class Factorial {
public static void main(String[] args) {
    int digit=1;
    int n=5;

    for (int i = n; i>0 ; i--) {
        digit*=i;
    //    System.out.print(i+" ");
     //   System.out.print(digit+" ");
    }
    System.out.println(digit);
    
}
}
