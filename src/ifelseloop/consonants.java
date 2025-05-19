import java.util.Scanner;

public class consonants {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner s = new Scanner(System.in);

        // Prompt user to enter a character
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0); // Read a single character from user input

        // Check if the character is a consonant
        if (isc(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a consonant.");
        }

        // Close the scanner object to prevent resource leak
        s.close();
    }

    // Method to check if a character is a consonant
    public static boolean isc(char chara) {
        // Convert to lowercase to handle both uppercase and lowercase characters
        chara = Character.toLowerCase(chara);

        // Check if the character is a letter and not a vowel
        return (chara >= 'a' && chara <= 'z') && !(chara == 'a' || chara == 'e' || chara == 'i' || chara == 'o' || chara == 'u');
    }
}
