package sample.model;

import javafx.scene.control.TextArea;
import sample.utils.CaseChanger;
import sample.utils.Constants;
import sample.utils.FileUtils;
import sample.utils.LetterChecker;

import java.io.IOException;
import java.util.*;
import java.util.List;

public class TextChanger {
  private static Set<List<String>> letters = new HashSet<>();
  private static String[] textChars;

  public String encryptText(String text, int key) {
    StringBuilder result = new StringBuilder();
    byte[] bytes = text.getBytes();
    int shift;

    for (byte value : bytes) {
      char ch = (char) value;
      if (Character.isAlphabetic(ch)) {
        shift = LetterChecker.checkLetter(ch);
        char newChar = Character.toLowerCase((char)((ch - shift) * key % Constants.powerLetters + shift + 1));
        result.append(Character.toChars(CaseChanger.caseChange(newChar, LetterChecker.isCaseLetterIsUpper())));
      } else {
        result.append(ch);
      }

    }
    return result.toString();
  }

  public static void collectLetters(String text) {
    textChars = text.split("");
    Arrays.stream(textChars)
        .sorted()
        .map(ch -> Character.toString((Character.toLowerCase(ch.charAt(0)))))
        .forEach(ch -> letters.add(Arrays.asList(ch)));
  }

  public static List<List<String>> makeStatistic(String text) {
    collectLetters(text);
    float lenText = textChars.length;

    List<List<String>> lst = new ArrayList<>(letters);

    for (int i = 0; i < lst.size(); i++) {
      List<String> strList = new ArrayList<>(lst.remove(0));
      strList.add(String.format(
              "%.4f",
              Arrays.stream(textChars).filter(ch -> ch.equals(strList.get(0))).count()
                      / lenText));
      lst.add(strList);
    }

    return lst;
  }

  public String decryptText(String text, TextArea textAreaDecryptIn) throws IOException {
    List<List<String>> table = FileUtils.fileIn();
    List<List<String>> stat = makeStatistic(textAreaDecryptIn.getText());

    for (List<String> tempStat : stat) {
      Iterator<List<String>> iteratorTable = table.iterator();
      double valueStat = Double.parseDouble(tempStat.get(1).replaceAll(",", "\\."));

      while (iteratorTable.hasNext()) {
        List<String> tempTable = iteratorTable.next();
        double valueTable = Double.parseDouble(tempTable.get(1));

        if (valueStat < 1.02 * valueTable && valueStat > 0.98 * valueTable) {
          text = text.replace(tempStat.get(0), tempTable.get(0));
        }
      }
    }
    System.out.println(table);
    System.out.println(stat);
    return text;
  }
}
