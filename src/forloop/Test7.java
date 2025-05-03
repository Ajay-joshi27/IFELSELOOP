package forloop;

import java.util.Scanner;

public class Test7 {
public static void main(String[] args) {
     Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int original=0;
        int count=0;
        for (int i = 0; i <n; i++) {
            if (n==0) {
                return;
            }
            original=n/10;
            count++;
        }
        System.out.println(count);
    
}
}
