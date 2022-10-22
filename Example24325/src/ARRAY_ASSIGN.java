import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_ASSIGN {
    public class CreatingArrayFromFile {

        public void main(String[] args) throws FileNotFoundException{

        }
        {


            Scanner document = null;
            try {
                document = new Scanner( new File("integer.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("please File is Empty! ");
            }

            ArrayList<Integer> setNumbers = new ArrayList<Integer>();

            while (document.hasNextLine()){

                setNumbers.add(document.nextInt());

                System.out.println(setNumbers);

                int arrayOfIntegers [] = new int[setNumbers.size()];

                for (int i = 0; i < setNumbers.size(); i++) { arrayOfIntegers[1]= setNumbers.get(1);

                }

                System.out.println("Created Array =>"+ Arrays.toString(arrayOfIntegers));

                        document.close();
}
        }
    }
}