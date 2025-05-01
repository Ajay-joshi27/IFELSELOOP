public class FirstCharacterIsUpperCase {
public static void main(String[] args) {
    String s="Good Morning";
  if (!s.isEmpty()&& Character.isUpperCase(s.charAt(0))) {
    System.out.println("FIRST CHARACTER IS CAPITAL ");
  } else {
    System.out.println("FIRST CHARACTER IS NOT CAPITAL");
  }
        
    }
}

