import java.util.HashMap;
import java.util.Map;

public class PracticalsTry {
    public static void main(String[] args) {
        HashMap<String, Integer> studIndex = new HashMap<>();
        studIndex.put("42200213", 89);
        studIndex.put("42225413", 65);
        studIndex.put("42234513", 83);
        studIndex.put("42222413", 78);

        //System.out.println(studIndex.entrySet());
        for (Map.Entry<String, Integer>entry: studIndex.entrySet()){
            //System.out.println(entry);
//            sum = sum+entry.getValue();
            //System.out.println(entry.getValue());
            //System.out.println(entry.getKey());
            System.out.println("Key is : "+ entry.getKey() + " And Value: "+ entry.getValue());// if you want them on the same line,

        }
    }

}
