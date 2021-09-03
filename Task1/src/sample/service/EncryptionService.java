package sample.service;

import java.util.Arrays;

public class EncryptionService {

    public StringBuilder encrypt(StringBuilder stringBuilder, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.toString().charAt(i);
            int index;
            if (ch >= 65 && ch <= 90) {
                index = (ch - 64 + key) % 26 + 64;
            } else if (ch >= 97 && ch <= 122) {
                index = ((ch - 96 + key) % 26) + 96;
            } else {
                index = ch;
            }

            result.append(Character.toChars(index));
        }

        return result;
    }

    public StringBuilder decrypt(StringBuilder stringBuilder, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.toString().charAt(i);
            int index;
            if (ch >= 65 && ch <= 90) {
                index = (ch - 64 + 26 - key) % 26 + 64;
            } else if (ch >= 97 && ch <= 122) {
                index = ((ch - 96 + 26 - key) % 26) + 96;
            } else {
                index = ch;
            }

            result.append(Character.toChars(index));
        }

        return result;
    }
}
