import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MApS {
    public static void main(String[] args) {
        // A Map is a container object that stores a collection of a key / value pairs.
        // a map cannot contain duplicate keys
        // enables fast retrieval , deletion and updating of the pair through the key
        // the time it takes to retrieve something is very short compared to the arrays
        // Know the corresponding key value before you can access the value in an index
        // Hashmaps also uses Hashing to store the keys but sets hashes whatever you give it
        // LET'S PRACTICE
        // WHAT IS THE DIFFERENCE BETWEEN THE KEY AND THE VALUE????
        // WE CAN HAVE A HASHMAP OF ANOTHER HASHMAP = TRUE, As many Nested hashmaps as we want.
        // key is the name of the student: (is the String) and the value is the assigned


        /// HOW TO CREATE HASHMAPS
        HashMap<String, Integer> studNames = new HashMap<>();

        // THE ABOVE HASHMAP WILL STORE KEY AS A STRING , VALUE AS AN INTEGER


        // NEXT, WE CHECK METHODS IN HASHMAPS
        //studNames.

// hashmaps prints in Curly Brackets {}, the rest print in Sqr Brackets []

        // how to add content to MY HASHMAP?
        studNames.put("Corrie", 35);
        studNames.put("Grace", 40);
        studNames.put("Cyril", 21);
        studNames.put("Frances", 12);
        studNames.put("Eleanor",30);
        studNames.put("Kennedy", 59);
        studNames.put("Abraham", 89);
        studNames.put("Zanitta", 19);

        // this prints in hashmap,  in the arrangement of the hashing order.
        System.out.println(studNames);

// how to CHECK IF HASHMAPS CONTAINS KEY
        System.out.println("Does the Student Names contain Kofi?  "+ studNames.containsKey("Kofi"));
        System.out.println("Does the Student Names contain Kennedy?  "+ studNames.containsKey("Kennedy"));

        //check if a HASHMAP CONTAINS A VALUE

        System.out.println("Does the Student Names contains 33  "+studNames.containsValue(33));
        System.out.println("Does the Student Names contains 30   "+studNames.containsValue(30));

        //if you enter a string , in the object side, it will find the hash of that string and return the value , if it matches,
        // it will print true, if not, it will print false.  But unlikely to print the  false

        System.out.println("Does the Student Names contains 35  "+studNames.containsValue(35));

///HOW TO GET ALL THE KEYS IN A HASHMAPS
        System.out.println(studNames.keySet());

//how to GET ALL VALUES IN HASHMAPS
        System.out.println(studNames.values());

        // printing both the KEYS AND VALUES WILL CORRESPOND TO EACH OTHER


        // USING FOR LOOP to print hashmaps contents
int sum =0;
        for (Map.Entry<String, Integer>entry: studNames.entrySet()){
            System.out.println(entry);
            sum = sum+entry.getValue();
            //System.out.println(entry.getValue());
            //System.out.println(entry.getKey());
            System.out.println("Key is : "+ entry.getKey() + " And Value: "+ entry.getValue());// if you want them on the same line,

        }
        //this prints the total sum of the values in the hashmaps

        System.out.println(sum);

        //solutions  TO EXAMPLE
        HashMap<String, ArrayList<Double>> studmarks = new HashMap<>();
        ArrayList<Double> graceArr = new ArrayList<>(Arrays.asList(23.5));
        ArrayList<Double> CyrilArr = new ArrayList<>(Arrays.asList(88.5));
        //how to add student and their markss to Hashmaps
        studmarks.put("Grace", graceArr);
        studmarks.put("Cyril", CyrilArr);
        System.out.println(studmarks);

    }
}
