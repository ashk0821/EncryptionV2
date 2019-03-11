
package Lab3;

class EncryptionV2 {
    private static final int CIRCLE_SIZE = 95;
    private static final int START_ASCII = 32;

    public static String encrypt (int key, String text) {
        char[] letters = text.toCharArray();
        String encryption = "";

        for (int i = 0; i < text.length(); i++) {
            key += letters[i];
            encryption += (char) ((key - START_ASCII) % CIRCLE_SIZE + START_ASCII);
        }
        return encryption;
    }

   public static String decrypt (int key, String text) {
        char[] letters = text.toCharArray();
        String decryption = "";

        for (int i = 0; i < text.length(); i++) {
            // CIRCLE_SIZE * 10 to stay in loop
            decryption += (char) ((letters[i] - key - START_ASCII + (CIRCLE_SIZE * 10)) % CIRCLE_SIZE + START_ASCII);
            key = letters[i];
        }
        return decryption;
    }
}

