import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MULTIDIMENTIONAL_ARRAYS {
    public static void main(String[] args) {

        // you can draw dimensions up to 252
        /// time , space, location - You'll use the 3 dimensional only t=in the fields before
        // the length of your multidimensional depends on your rows and columns
        double marks [] [] = new double[5][2]; // 5 rows and 2 column multi
        double [] [] newMarks = new double[2][5];

        // MANUAL ADDITION OF CONTENT
        marks [2] [0] = 50; // adding to row 3, col 1
        marks [4] [1] = 60; // adding to row 3, col 1

        //ADDING CONTENT TO 2 DIMENS. ARRAY WITH FOR-LOOP.

for (int row=0; row< marks.length; row++){

    for (int col = 0; col<marks[row].length; col++){ // marks[row].length is for the inner rows and column
//         System.out.println(col + " ");
//         System.out.println(row+ " ");

        marks[row][col] = 4* row + (col-35); // write any formula in the rows and columns

    }
// System.out.println("    ");
}
        for (int row=0; row< marks.length; row++){

            for (int col = 0; col<marks[row].length; col++){ // marks[row].length is for the inner rows and column
//         System.out.println(col + " ");
    System.out.print(marks [ row][col] + " ");

                marks[row][col] = row* col; // write any formula in the rows and columns

            }
            //System.out.println();
        }

        System.out.println("After Sorting ");

        // sorting two-dimensional ARRAYS
        Arrays.sort(marks, new Comparator<double[]>() { // Double Comparator comes because we used the double
            @Override
            public int compare(double[] x, double[] y) {
                return Double.compare(x[1], y[1]);
            }
        });

//creating and initializing at the same time
//Double ages [][ ]= {{3, 4}, {4,4}};




//        System.out.println(marks[3][1]);


        // HOW TO CREATE JAGGED MULTI ARRAYS
double CE2Marks [] [] = {{29.8}, {67, 90, 56}, { 49, 69, 30, 53, 49.98}, {25, 15}};
        System.out.println(Arrays.deepToString(CE2Marks));
        double newJagged [][] = new double[5][];
        newJagged [0] = new double[1];
        newJagged [1] = new double[2];
        newJagged [2] = new double[5];
        newJagged [3] = new double[2];

        System.out.println(Arrays.deepToString(newJagged));

    }

}
