import javax.naming.PartialResultException;
import java.util.Arrays;

public class Arrays_Practicals {
    public static void main(String[] args) {


        // TO CREATE ARRAYS OF DECIMALS
        Double [] marks = new Double[5];
        double mark [] = new double[5];
String names [] = new String[5];
marks [4] = Double.valueOf(5);
names [2] = "Priscilla";
names [0] = "Lydia";
names [1] = "Eleanor";


// Copying Arrays By Referencing the Content

String newNames [ ] = names; // modification of either affects the Other
names[1] = "CLinton";
        System.out.println("NewNAmes Content "+Arrays.toString(newNames));
// when you sue the assignment you ae not creating a different thing, but only Modifying it


        // HOW DO YOU MODIFY WITHOUT THE AFFECTION OF THE OTHER?
        newNames = names.clone();
// it modify the old one to the new, and any modification doesn't affect the other.

        



//Arrays.sort(names);


        // HOW TO COPY ARRAYS AND SEARCHING FOR AN ELEMENT IN AN ARRAY



        System.out.println("Before String Array Sorting ");
        System.out.println(Arrays.toString(names));
        //Arrays.sort(names);
        System.out.println("After Sorting1100");



//Using a FOR LOOP  to add Content
        for (int i=0; i <marks.length; i++ ){

            marks[i] = (i +2 )* 3.2;
            // to convert to string
//            marks [i]=i;
//            names[i] = "String" +i
        }


//JAVA doesn't allow negative indexes



        //how to assign a value to an index in an  array

        // sorting Single arrays
         marks [4] = 6.4;
        System.out.println("Marks before sorting ");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(names));


        // Arrays.sort(marks); // Sorting Everything in the Arrays
        Arrays.sort(marks, 2, marks.length);
        // means length

        System.out.println("Marks after Sorting ");
        System.out.println(Arrays.toString(names));


//    double [] newMarks2 = new double[3];
//    newMarks2 [0]= 83;
//    newMarks2 [1] = 76;
//    newMarks2 [2] = 80;

 // for( int a = 0; a < newMarks2.length; a++){ newMarks2[a] = (a+2)*3;
//}


// FRIDAY
// ACCESS ITEM AT AN INDEX FROM AN ARRAY
double value =  marks[2];
        System.out.println("Value at Index Two: " + value);

        // explain the why for loops.
        // you won't get the out of bounce exception for the index


        //// FOR LOOP TO PRINT ARRAY CONTENT

        // USING DIFFERENT WAYS TO PRINT ARRAYS

        for (int index = 0; index < marks.length; index++){

            System.out.println(marks[index]);       }
        System.out.println( );


        // PRINT EACH ENTRY AT A GO
        for ( double entry : mark){ // this will print every entry in the marks array

            System.out.println(entry);
        }
        System.out.println(" DONE ");




        // EXCEPTION HANDLING, OUT OF BOUNCE INDEX
        for (int index = 0; index < marks.length + 1; index++){

            try {
                System.out.println(marks[index]);
            } catch (Exception e) {

                // we can also use the break to come out of the for Loop
                break;
//                System.out.println("Invalid Index ! ");
            }
        }


        System.out.println( "EXCEPTION HANDLING ");
///



        }
}
