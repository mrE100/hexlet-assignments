package exercise;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        if (array.length == 0) {
            return array;
        }
        String[][] result = new String[array.length * 2][array[0].length * 2];
        for (int i = 0; i < array.length; i++) {
            int k = i * 2;
            for (int j = 0; j < array[0].length; j++) {
                int l = j * 2;
                result[k][l] = array[i][j];
                result[k][l + 1] = array[i][j];
                result[k + 1][l] = array[i][j];
                result[k + 1][l + 1] = array[i][j];
            }
        }
        return result;
    }
}
// END
