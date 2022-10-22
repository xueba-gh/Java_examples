public class practicalLoops2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i < 200; i++){
            if ((i%2==0) && (i%3==0)){
                System.out.println(i);
                count++;
            }
            if (count==10)
                break;


            // if you use != , it will print odd numbers
           /* if ((i%2==0) && (i%3==0)){
                System.out.println(i);
                count++;
            }
            if (count==10)
                break;*/

            //either 3 or 2     ASSIGNMENTS

            //1. 10 multiples of both 3 and 2
            //2. 20 multiples of either 3 and 2
            //3. 50 multiples of only 3 or 2
            //4. 10 numbers not multiples of 2 and 3
            //5. picture ASSIGNMENT
            // 6. RANDOM GUESS -  ELEMENTARY PROGRAMMING WE'LL DO THIS IN THE FUTURE

        }
    }
}
