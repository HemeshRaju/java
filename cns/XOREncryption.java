public class XOREncryption {
    public static void main(String[] args) {
        String plaintext = "Hemesh!";
        String key = "key";

        String encrypted = xorEncryptDecrypt(plaintext, key);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = xorEncryptDecrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String xorEncryptDecrypt(String input, String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            result.append((char) (input.charAt(i) ^ key.charAt(i % key.length())));
        }

        return result.toString();
    }
}