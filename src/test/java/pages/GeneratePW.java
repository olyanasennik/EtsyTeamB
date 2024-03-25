package pages;

import lombok.Data;

import java.util.Random;

@Data
public class GeneratePW {
    public static void main(String[] args) {
        String password = generateRandomPassword();
        System.out.println("Random Password: " + password);
    }

    public static String generateRandomPassword() {
        int minLength = 4;
        int maxLength = 20;
        int passwordLength = new Random().nextInt(maxLength - minLength + 1) + minLength;

        StringBuilder passwordBuilder = new StringBuilder();

        while (passwordBuilder.length() < passwordLength) {
            char randomChar = (char) (new Random().nextInt(26 * 2 + 10) + 48);
            if (Character.isLetterOrDigit(randomChar)) {
                passwordBuilder.append(randomChar);
            }
        }

        return passwordBuilder.toString();
    }
}
