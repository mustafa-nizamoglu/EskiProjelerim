package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C10_OCA02 {
    public static void main(String[] args) {
      /*TODO
   Which of the following can be inserted into the blank to create a date of June 21, 2014?
   21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
   A. new LocalDate(2014, 5, 21);
   B. new LocalDate(2014, 6, 21);
   C. LocalDate.of(2014, 5, 21);
   D. LocalDate.of(2014, 6, 21);
   F. LocalDate.of(2014, Month.JUNE, 21);
 */
        LocalDate x=LocalDate.of(2014, 6, 21);
        System.out.println("x = " + x);                                    //x = 2014-06-21
        LocalDate Y=LocalDate.of(2014, Month.JUNE, 21);
        System.out.println("Y = " + Y);                                    //Y = 2014-06-21
        
    }
}
