package j13_Brek_Continue;

public class C05_OCA_type {
    public static void main(String[] args) {
        int count = 0;

        for (int row = 1; row <= 3; row++){
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ;  // raw*col çift ise count artmaz sadece teklerde artar
                count++;
            }
            }
        System.out.println(count);


 //     int count = 0;
 //     ROW_LOOP:
 //     for (int row = 1; row <= 3; row++)  // dış loop
 //         for (int col = 1; col <= 2; col++) {   //iç loop
 //             if (row * col % 2 == 0) continue ROW_LOOP;
 //             count++;
 //         }
 //     System.out.println(count);



    }
}
