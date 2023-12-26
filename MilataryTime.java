import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MilataryTime {
    public static String convertToMilitaryTime(String input) throws ParseException {
        DateFormat englishFormat = new SimpleDateFormat("hh:mm:ss aa");

        DateFormat militaryFormat = new SimpleDateFormat("HH:mm:ss");
        Date time = englishFormat.parse(input);

        return militaryFormat.format(time);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(convertToMilitaryTime("09:05:45 PM"));
    }
}
