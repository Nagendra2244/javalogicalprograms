/* Write a JAVAprogram to print all ASCII character with their values.*/


public class All_ASCII_character_with_their_values {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            System.out.printf("Character: %c\tASCII Value: %d\n", i, i);
        }
    }
}


