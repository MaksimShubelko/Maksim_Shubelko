package sample.utils;

public abstract class LetterChecker {
    private static boolean caseLetterIsUpper = false;

    public static int checkLetter(char ch) {
        if (Character.isAlphabetic(ch)) {
            if (Character.isUpperCase(ch)) {
                caseLetterIsUpper = true;
                return Constants.upperShift;
            } else {
                caseLetterIsUpper = false;
                return Constants.lowerShift;
            }
        } else {
            return Constants.anotherShift;
        }
    }

    public static boolean isCaseLetterIsUpper() {
        return caseLetterIsUpper;
    }
}
