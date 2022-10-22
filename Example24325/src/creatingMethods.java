
    import java.util.ArrayList;
import java.util.Arrays;

    public class creatingMethods {
        public static void main(String[] args) {
            ArrayList <String> stdName = new ArrayList<>();
            ArrayList <String> stdHomet = new ArrayList<>();
            ArrayList <Integer> stdAge = new ArrayList<>();
            ArrayList <Integer> stdMarks = new ArrayList<>();
            double [][] marks = new double[3][5];
            for (int i=0; i< marks.length;i++){
                for (int k=0; k<marks[i].length;k++){
                    marks[i][k] =(i-23)*(k+13);
                }
            }
            System.out.println(Arrays.deepToString(marks));


            stdName.add("Martha ");
            stdName.add("Francis");
            stdName.add("Peter");

            stdHomet.add("Bogoso");
            stdHomet.add("Paris");
            stdHomet.add("Kumasi");

            stdAge.add(12);
            stdAge.add(34);
            stdAge.add(54);

            stdMarks.add(95);
            stdMarks.add(89);
            stdMarks.add(91);

            int stdsumMarks = sumIntArraylist(stdMarks);
            int avgMark = stdsumMarks / stdMarks.size();

            System.out.println("average mark = "+avgMark);




            // to sum up the content in an ArrayList of integers
            System.out.println("Student ages: ");
            System.out.println(sumIntArraylist(stdAge));
//        System.out.println(sum);
            System.out.println("student marks: ");
            System.out.println(sumIntArraylist(stdMarks));


            //creating the method
            System.out.println("student names: ");
            printString_arrayList(stdName);

            System.out.println("student Hometowns: ");
            printString_arrayList(stdHomet);

        }

        private static int sumIntArraylist(ArrayList<Integer> stdAge) {
            int sum=0;
            for (int i = 0; i< stdAge.size(); i++){
                sum= sum + stdAge.get(i);
            }
            return sum;
        }

        private static void printString_arrayList(ArrayList<String> stdName) {
            for (int i = 0; i< stdName.size(); i++){
                System.out.println(stdName.get(i));
            }
        }

        /***
         *
         * @param first
         * @param second
         * @return
         */
        public static double addition (double first, double second) {
            double results = first +second;

            return results;
        }
    }

