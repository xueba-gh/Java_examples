import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class HASH_SETS {

    // Set declaration
    // Set <element Type> hashset Ref
    //HashSet -- is the simplest and to store duplicate-free elements of the same type

    /// and LinkedHashSet

    // and TreeSet
    public static void main(String[] args) {

        //CREATING A HASH - SET
        HashSet<String> studNames = new HashSet<>();
        HashSet<String> newNames = new HashSet<String>();
        HashSet<Double> stuMarks = new HashSet<Double>();


        // CHECK SOME METHODS OF HASH SETS
        studNames.add("John ");
        studNames.add("Eunice ");
        studNames.add("Jacob ");

        /// to find the intercession and sets do not allow duplicates
        newNames.add("Cyril");
        newNames.add("Grace");
        newNames.add(" Kofi ");
        newNames.add(" Jacob");

//        // hashing concepts by giving it a hash number and storing it in a particular index. It enables you to search or retrieve contents faster
//
//
 System.out.println("This is New Names : "+newNames);
 System.out.println("This is Students Names : "+ studNames);
//
//        // addition of all content of one set to another by using the add all method
//
//        newNames.addAll(studNames);
//        System.out.println(" New Names after Add ALL : "+newNames);
//        System.out.println("Students Names After Add ALL : "+ studNames);
//
//
//// to remove all CONTENT OF ONE SET FROM ANOTHER
//newNames.removeAll(studNames);
//        System.out.println(" New Names after Remove ALL : "+ newNames);
//       System.out.println("Students Names After Remove ALL : "+ studNames);
//       //we can't remove at an index because of the hashing
//       studNames.remove("John");
//        studNames.remove("Kofi");
//        System.out.println(newNames);



        // SET INTERCESSION by using Retain all
        newNames.retainAll(studNames);
        //System.out.println("New Names After Intercession : "+ newNames);
        System.out.println("Student Names After Intercession : "+ newNames);


        //ADD ALL
        newNames.addAll(studNames);
        System.out.println("After Union "+ studNames);


    }
}
