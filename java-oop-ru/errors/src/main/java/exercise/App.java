package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            System.out.print(Math.round(circle.getSquare()) + "\n");
        } catch (NegativeRadiusException e) {
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
