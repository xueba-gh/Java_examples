package Examples;

import java.time.*;

public class CurrentTime {
    public static void main(String[] args) {

        //date
        /*LocalDate ld = LocalDate.from(LocalDateTime.of(2022, 05, 05,12,30 ));*/
        /*System.out.println(ld);*/

        //Date
        LocalDate localdate =LocalDate.of(2022, 8, 5);

        //Local Time
        LocalTime localtime = LocalTime.of(12, 30);

        //time and date

        LocalDateTime localDate_andTime = LocalDateTime.of(localdate , localtime);

        System.out.println("Your Date and Time Is : "+ localDate_andTime + " PM GMT");


        //date and time
        /*LocalDateTime ldt = LocalDateTime.of(localdate, );*/
        //zones date and times




        /*import java.time.location.Localtime*/




    }
}
