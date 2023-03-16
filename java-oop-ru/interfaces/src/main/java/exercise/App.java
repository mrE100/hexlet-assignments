import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static void main(String[] args) {
        List<exercise.Home> apartments = new ArrayList<>(List.of(
                new exercise.Flat(41, 3, 10),
                new exercise.Cottage(125.5, 2),
                new exercise.Flat(80, 10, 2),
                new exercise.Cottage(150, 3)
        ));
        List<String> result = App.buildApartmentsList(apartments, 3);
        System.out.println(result);
        CharSequence text = new ReversedSequence("abcdef");
        System.out.println(text);

    }

    public static List<String> buildApartmentsList(List<exercise.Home> apartments, int size) {

        List.sort(apartments, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        ArrayList<String> result = new ArrayList<>();
        if (apartments.size() >= 1) {
            for (int i = 0; i < size; i++) {
                result.add(apartments.get(i).toString());
            }
        }
        return result;
    }

}
// END
