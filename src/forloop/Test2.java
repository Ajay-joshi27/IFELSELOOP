package forloop;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i+" ");
        }
    }

}
