import java.util.Scanner;

public class UpercaseORLowercase {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    char ch=s.next().charAt(0);
    if (ch>='A' && ch<='Z') {
        System.out.println(ch+" ::is upercase");
    } else if((ch>='a' && ch<='z')) {
        System.out.println( ch+" ::is lower case");
    }
    else
    System.out.println("enter correct character");
}
}
