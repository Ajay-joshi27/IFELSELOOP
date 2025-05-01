public class AlphabetOrNot {
public static void main(String[] args) {
    char c='b';
    if ((c>='A' && c<='Z')||(c>='a' && c<='z')) {
        System.out.println(c+"::is a character");
    }
    else{ 
        System.out.println("it is not a character");
    }
}
}
