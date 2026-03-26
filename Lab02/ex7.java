package Lab02;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        int i = 0, j = 0, s = 0;
        for (int k = 0; k < sentence.length(); k++) {
            char ch = sentence.charAt(k);  
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                i++; 
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                j++;
            } else if (ch == ' ') {
                s++;
            }
        }
        System.out.println("Number of vowels: " + i);
        System.out.println("Number of consonants: " + j);
        System.out.println("Number of spaces: " + s);
    }
}
