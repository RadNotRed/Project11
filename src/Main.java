import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new instance of the Worker class
        Worker worker;
        // allow for input
        Scanner input = new Scanner(System.in);
        // ask for the message
        System.out.println("Enter the message to encrypt or decrypt:");
        // store the message
        String message = input.nextLine();
        // ask for the shift
        System.out.println("Enter the shift:");
        // store the shift
        int shift = input.nextInt();
        // create a new instance of the Worker class
        worker = new Worker(message, shift);

        // Encrypt and decrypt the message
        String encryptedMessage = worker.encrypt();
        String decryptedMessage = worker.decrypt();

        // Print the results
        System.out.println("Original message: " + worker.message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}
