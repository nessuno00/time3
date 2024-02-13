import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);


        int year = dateTime.getYear();
        System.out.println("Anno: " + year);


        int month = dateTime.getMonthValue();
        System.out.println("Mese: " + month);

        // Ottenere il giorno
        int day = dateTime.getDayOfMonth();
        System.out.println("Giorno: " + day);


        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        System.out.println("Giorno della settimana: " + dayOfWeekString);
    }


}
