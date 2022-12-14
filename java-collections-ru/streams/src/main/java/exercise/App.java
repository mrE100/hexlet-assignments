package exercise;

import java.util.List;
import java.util.function.Predicate;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        Predicate<String> if1 = mail -> mail.endsWith("gmail.com");
        Predicate<String> if2 = mail -> mail.endsWith("yandex.ru");
        Predicate<String> if3 = mail -> mail.endsWith("hotmail.com");

        return (int) emails.stream()
                .filter(if1.or(if2.or(if3)))
                .count();
    }
}
// END
