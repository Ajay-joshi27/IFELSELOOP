import java.util.*;
public class ifelse{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if ((n % 4 == 0 && n % 100 !=0 )||(n %400==0)) {
        System.out.println(n+"IS A LEAP YEAR");
    } else {
        System.out.println("it is not a leap year");
    }
    long year=s.nextLong();
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
    s.close();
}  

}