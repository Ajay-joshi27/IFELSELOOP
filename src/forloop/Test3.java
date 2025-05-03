package forloop;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i <=n; i+=2) {
            System.out.println(i);
        }
    }

}
