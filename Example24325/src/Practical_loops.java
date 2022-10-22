public class Practical_loops {
    public static void main(String[] args) {

                //Multiples of both two and there
        int count=0;
        for (int i=1; i<20; i++){
            if( (i%2==0)&&(i%3==0)){
                System.out.println(i);
                count++;
            }
            if (count==10)
                break;
        }

        //Multiples of either 2 or 3 ||
        int count1=0;
        for (int i=1; i<20; i++){
            if( (i%2==0)&&(i%3==0)){
                System.out.println(i);
                count1++;
            }
            if (count1==10)
                break;
        }

        // Multiples of only 2 or 3  ^
        int count2=0;
        for (int i=1; i<20; i++){
            if( (i%2==0)^(i%3==0)){
                System.out.println(i);
                count2++;
            }
            if (count2==10)
                break;
        }
    }
}
