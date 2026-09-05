import java.util.Scanner;

public class AlphaeticCounter {
    static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        String v = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isAlphabetic(c))
                continue;
            if (v.indexOf(c) != -1)
                vowels++;
            else
                consonants++;
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter title: ");
            String text = sc.nextLine();
            countVowelsAndConsonants(text);
        }
    }
}
