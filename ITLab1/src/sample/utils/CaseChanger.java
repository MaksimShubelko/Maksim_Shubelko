package sample.utils;

public abstract class CaseChanger {
    public static char caseChange(char ch, boolean caseLetter) {
        if (caseLetter) {
            return Character.toUpperCase(ch);
        }
        return ch;
    }
}
