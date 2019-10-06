package age_in_days;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Application {
    public static void main(String [] args){
        System.out.println(ageInDays(5,3,1990));
    }

    public static long ageInDays(int day, int month, int year) {
        LocalDate birthday = LocalDate.of(year, month, day);
        return ChronoUnit.DAYS.between(birthday, LocalDate.now());
    }
}
