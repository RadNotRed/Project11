public class Worker {

    public String message;
    private final int shift;

    public Worker(String message, int shift) {
        this.message = message;
        this.shift = shift;
    }

    public String encrypt() {
        // Create a new string to store the encrypted message
        String encryptedMessage = "";

        // Loop through each character in the message
        for (char c : message.toCharArray()) {
            // If the character is a letter (A-Z or a-z), shift it by the specified amount
            if (Character.isLetter(c)) {
                encryptedMessage += (char)((c + shift - (Character.isLowerCase(c) ? 'a' : 'A')) % 26 + (Character.isLowerCase(c) ? 'a' : 'A'));
            } else {
                // If the character is not a letter, just add it to the encrypted message
                encryptedMessage += c;
            }
        }

        return encryptedMessage;
    }

    public String decrypt() {
        // Create a new string to store the decrypted message
        String decryptedMessage = "";

        // Loop through each character in the message
        for (char c : message.toCharArray()) {
            // If the character is a letter (A-Z or a-z), shift it by the specified amount
            if (Character.isLetter(c)) {
                decryptedMessage += (char)((c - shift - (Character.isLowerCase(c) ? 'a' : 'A') + 26) % 26 + (Character.isLowerCase(c) ? 'a' : 'A'));
            } else {
                // If the character is not a letter, just add it to the decrypted message
                decryptedMessage += c;
            }
        }
        return decryptedMessage;
    }
}
