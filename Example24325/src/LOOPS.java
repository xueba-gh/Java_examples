public class LOOPS {
    public static void main(String[] args) {
        // WHILE LOOPS
        // PRINT FIRST 5 MULTIPLES OF 2
        int count = 1;
        while (count<6) {

            System.out.println(" Multiples of Two: ");

            // the Location of your incrementation is very important
            System.out.println(count*2);
            count++;

            /*count = count+1;*/
        // if you don't add the count increment, it will keep printing 2,2,2,2,,2,2,2

        }

        // find the sum of the first 8 positive integers
        int count2 = 1;
        int sum =0;
        while ( count2<9){
            System.out.println(" Sum of first 8 integers are : "+ sum);
         sum = sum + count2;
            count2 = count2 + 1 ;
         // same as count2++;
        }
        System.out.println(" Sum of first 8 integers are : "+ sum);



        // DO WHILE LOOPS

        int sum2 = 0;
        int count3 = 1;
        do {
            sum2 = sum2 +count3;
            count3++;

        } while (count3 <=8);
        System.out.println("Do While: "+ sum2);

        //FOR LOOPS

        // find sum of first 10 positive integers
        int sum3 = 0;
        int count5;

        // for for loop, you add the incrementation in the signature();
        for (count5 = 0; count5 <9; count5++){
            sum3 = sum3 +count3;

        }
        System.out.println("FOR LOOP : "+ sum3);


        // ASSIGNMENTS AND PRACTICALS
        //find the sum of
    }
}
