package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    public NegativeRadiusException() {
        System.out.print("Не удалось посчитать площадь\n");
    }

    public NegativeRadiusException(String message) {
        System.out.print("Не удалось посчитать площадь\n");
    }
}
// END
