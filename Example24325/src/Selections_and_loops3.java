public class Selections_and_loops3 {
    public static void main(String[] args) {
        //LOOPs

        //The while LOOP        to print the first 5 multiples of 2
        int count =1;
        while (count<6){
            System.out.println(count*2);
            count++; // increment count by 1        the position of the increment affects the outcome of the program
        }

        // to find the sum of the first 8 positive integers using The While LOOP
        int count2=1;
        int sum=0;
        while (count2<9){
            sum=sum+count2;
            System.out.println("the while loop sum is "+sum);
            count2++;
        }

        // find the sum of the first 8 positive integers using the DO WHILE LOOP
        int sum2=0;
        int count3=1;
        do{
            sum2=sum2+count3;
            count3++;
        }while (count3<9);
        System.out.println("the do while sum is : "+sum2);

        // find the sum of first 10 positive integers using the FOR LOOP
        int forLoopSum=0;
        for(int count4=0;count4<11;count4++){
            forLoopSum =forLoopSum+count4;
        }
        System.out.println("for the FOR LOOP SUM is: "+forLoopSum);

        // write for loop to find the sum of the first


    }
}
