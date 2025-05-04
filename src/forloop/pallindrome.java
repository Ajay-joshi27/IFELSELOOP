package forloop;

public class pallindrome {
public static void main(String[] args) {
    int num=12212;
    int original=num;
    int reversed=0;
    for (int i = 0; num>0; i++) {
        int digit=num%10;
         reversed=digit+(reversed*10);
         num=num/10;
    }
        if (reversed == original) {
            System.out.println(reversed+" ::it is pallindrome");
        }
        else{
            System.out.println(reversed+" ::it is not pallindrome");
        }
}
}
