package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {

    public static boolean scrabble(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        ArrayList<Character> firstWordArray = new ArrayList();
        for (char ch : firstWord.toCharArray()) {
            firstWordArray.add(ch);
        }
        for (char ch : secondWord.toCharArray()) {
            if (firstWordArray.contains(ch)) {
                int i = firstWordArray.indexOf(ch);
                firstWordArray.remove(i);
            } else {
                return false;
            }
        }
        return true;
    }
}

//END
