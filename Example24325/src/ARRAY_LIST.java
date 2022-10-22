import java.net.BindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ARRAY_LIST {
    // Array list of String Creates only Strings and for Int =, Vice versa
    // Array List can Grow, size can increase but arrays are fixed and can't be modified
    // made of single arrays
    // because the constructor to
    //
    public static void main(String[] args) {
        //CREATION OF ARRAY LIST
        ArrayList<String> studNames = new ArrayList<>();
        // This is How to Declare Array List
        ArrayList<String> newNames = new ArrayList<String>();
        // Once it is written <in the first <> , the Second can be ignored>

        ArrayList<Integer> StudMarks = new ArrayList<>();
        // CHECK METHODS IN ARRAY LIST
        // studNames. Plus control space pops the options

        studNames.add("Corrie");
        studNames.add("Cyril ");
        newNames.add("Lydia"); //.add adds up to the Array list
        StudMarks.add(56);
        StudMarks.add(57);
        StudMarks.add(58);
        StudMarks.add(59);
        StudMarks.add(60);
        StudMarks.add(-60);
        studNames.add("32323.2338");
        // PRINTOUT THE CONTENT OF ARRAY LIST
        System.out.println("Student Names : "+ studNames);
        System.out.println("Student Marks : "+ StudMarks);

        System.out.println("       ");

        // how to remove a content
        //studNames.add("32323.2338");

        studNames.remove(2);
        System.out.println("Student Names : "+ studNames);

        System.out.println("       ");

        //HOW TO ADD ALL THE CONTENT OF ONE ARRAY LIST TO ANOTHER
        newNames.addAll(studNames);
        // from studNames to newNames


        System.out.println("New List of New Names : "+ newNames);
        System.out.println("Old list of StudNames : "+ studNames);
// FINDING THE LENGTH OF AN ARRAYLIST USING THE  .LENGTH
        // how will you know the size of an integers in an Arrays



        // HOW TO REMOVE OR CLEAR ALL CONTENT OF AN ARRAY LIST
        // // newNames.clear();

        //after clear
      ////   System.out.println(" After Clear : "+newNames);

        System.out.println("The Size of New Names are  : "+ newNames.size());
        // to find the size of an arraylist

        //finding the arrays' elements
        System.out.println("Does New-Names contains Kofi? "+ newNames.contains("Kofi"));
        // this prints true or false statements
        System.out.println("Does New-Names contains Lydia? "+ newNames.contains("Lydia"));


        //if you make it small letter it won't work
        System.out.println("Does New-Names contains lydia? "+ newNames.contains("lydia"));


        /// HOW TO RETRIEVE AN ELEMENT AT AN INDEX

        System.out.println("to retrieve an array element using .get has  : "+ newNames.get(2));


        //HOW TO REMOVE AN ELEMENT WITHOUT SPECIFYING AN INDEX
        StudMarks.remove("56");

        System.out.println(StudMarks);
        System.out.println("  Space   ");


        System.out.println( " New Names Before sorting : "+ newNames);
        // IT SORTS IN ALPHABETICAL ORDER

        //USING SORTING IN ARRAYLIST
        Collections.sort(newNames);
        System.out.println( " New Names After  sorting : "+ newNames);


        System.out.println("  Space   ");
        Collections.reverse(newNames);
        System.out.println( " New Names After  Reverse : "+ newNames);

        Collections.reverse(StudMarks);
        System.out.println( " New  Marks After  Reverse : "+ StudMarks);

        Collections.sort(StudMarks);
        System.out.println( " New Marks after Sorting : "+ StudMarks);

    }



}
