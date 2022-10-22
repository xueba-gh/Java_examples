public class Loop_assign {
    public static void main(String[] args) {

        int sum=0;
        int count=1;
        do{
            sum=sum+count;
            count++;
        }while (count<101);
        System.out.println("the do while sum is : "+sum);


   /*    int count=0;
        for (int i=3; i<101; i++) {
            int sum = 0;
            if ((i % 5 == 0) || (i % 7 == 0)) {
                sum = i + count;
                count++;

                System.out.println(+sum);
            }
            if (count == 101)
                break;
        }*/
}

    }


// int sum =0;
//for ( int count=3;count<101;count++){

// sum= sum+count;
//System.out.println(sum);

