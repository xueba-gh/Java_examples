public class practLoop {
    public static void main(String[] args) {
        // NO.1 First 10 Multiples of both 3 and 2
        int count = 0;
        for (int i= 1; i < 20; i++){

            if ((1%2==0) && (i %3==0)){
                //logical && (and)
                // logical == operator
                System.out.println(i);
                count++;
            }
            if (count==10)
                break;

            // break and continue aer keywords to use in the loops in java
// this will give you multiples of either 3 or 2 ( || or)
            // || is or

            if ((1%2==0) || (i %3==0)){
                //logical && (and)
                // logical == operator
                System.out.println(i);
            }
            // ^ is Exclusive or
            if ((1%2==0) ^ (i %3==0)){
                //logical && (and)
                // logical == operator
                System.out.println(i);
            }
        }

    }
}
