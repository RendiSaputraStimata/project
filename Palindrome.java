import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] words = input.nextLine().split(" ");

        if (words.length > 1) {
            System.out.println("Tidak boleh menggunakan spasi");
            System.exit(1);
        }

        char[] characters = words[0].toCharArray();

        for (int i = characters.length - 1; i >= 0; i--)
        {
            if (characters[i] == 'n' && characters[i+1] == 'g') {
                System.out.print(characters[i+1]);
            } else if(characters[i] == 'g' && characters[i-1] == 'n') {
                System.out.print(characters[i-1]);
            } else if(characters[i] == 'n' && characters[i+1] == 'y') {
                System.out.print(characters[i+1]);
            } else if(characters[i] == 'y' && characters[i-1] == 'n') {
                System.out.print(characters[i-1]);
            } else {
                System.out.print(characters[i]);
            }
        }
    }
}
