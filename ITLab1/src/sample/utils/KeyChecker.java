package sample.utils;


import javafx.scene.control.TextField;

public abstract class KeyChecker {

    public static void checkKey(TextField keyIn) {
        String key = keyIn.getText();
        if (key.length() == 0 || !key.matches("^[0-9]+$")
                || !GeneratorNumbers.isPrime(Integer.parseInt(key), Constants.powerLetters)) {
            keyIn.setText(Integer.toString(GeneratorNumbers.generateKey()));
        }
    }
}
