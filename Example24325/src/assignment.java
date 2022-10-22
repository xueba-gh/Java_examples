import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {


        class methods1 {
            double l = 1;
            double b = 1;
            double h = 1;
            double results =l*b*h;
            methods1(){
                //default constructor
            }
            Scanner input = new Scanner(System.in);
            methods1(double newLength, double newBreadth, double newHeight) {
                l=newLength;
                b=newBreadth;
                h=newHeight;
                input.close();
            }

            double findArea(){
                System.out.print("enter length in cm: ");
                double newLength= input.nextDouble();
                if (newLength<0){
                    System.out.println("invalid length!");
                    return results;
                }
                System.out.print("enter breadth in cm: ");
                double newBreadth = input.nextDouble();
                if (newBreadth<0){
                    System.out.println("invalid breadth");
                    return results;
                }
                return newLength*newBreadth;
            }


            double findVol(){
                System.out.print("enter length in cm: ");
                double newLength= input.nextDouble();
                if (newLength<0){
                    System.out.println("invalid length");
                    return results;
                }
                System.out.print("enter breadth in cm: ");
                double newBreadth = input.nextDouble();
                if (newBreadth<0){
                    System.out.println("invalid breadth");
                    return results;
                }
                System.out.print("enter height in cm: ");
                double newHeight = input.nextDouble();
                if (newHeight<0){
                    System.out.println("invalid height");
                    return results;
                }else {
                    return newLength*newBreadth*newHeight;
                }
            }
        }
    }
}
