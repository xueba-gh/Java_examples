import javax.naming.Name;

public class CharacterStrings {
    public static void main(String[] args) {
        //CHARACTERS
        char letter = 'A';
        int number = '5';
        //String is just a concatenation of two or more characters; just like a word - boom!!!

        System.out.println("Decimal Value of the Letter "+letter+ " is "+ (int)letter); // answer is 65 // casting
        System.out.println("Character Value of the Number "+number+ " is "+ (char)number);
        System.out.println((char) 10084);
        System.out.println((char) 99079);
        System.out.println("Is  "+letter+ " a digit ?  " + Character.isDigit(letter));
        System.out.println("Is  "+number+ " a digit ?  " + Character.isDigit(number));
        //to check whether a character is a digit or a number by true or False Statements

        System.out.println("Is "+ letter+ " Lower Case? "+ Character.isLowerCase(letter));
        System.out.println("Convert the Letter  "+ letter+ " to a Lower Case for Me Please, Oh! I beg. "+ Character.toLowerCase(letter));

        // Learn to compare two strings based on the above table of String Data types


        //Theory Quiz;  chapter 1-3

        // Practical Quiz = chapter 1-3
        //
        // all On LocalDateTime = LocalDateTime.of(2022, 08, 08, 5:30PM)


        System.out.println("       ");
        System.out.println("       ");
        System.out.println("       ");
        /// Just some Space

        // STRINGS
        String name = "Cyril Corrie";
        String anoName = "cyril Corrie";
        String firstName = "Corrie";
        System.out.println("Length Of Name "+name+ " Is "+ name.length());
        // this counts the white spaces as well, Take NOte

        System.out.println(name + "to Capital "+name.toUpperCase());
        //converts the Name to Uppercase


        System.out.println("Character at index 7 is : "+ name.charAt(7));
        // This Prints the Character with the Array Number 7. This Prints o. Because o is an Ocean - Oh! Yes!

        System.out.println("aaaa "+anoName+ "  aaaa");
        //to test the White SPace Before and After. Just Like After

        System.out.println("aaaa "+anoName.trim() + " aaaa");
        // We Trim the White Spaces , Before And After Not In Between, so Take Note.  Let's Trim Some Hairs, Oops! White Spaces.LOL

        System.out.println("Are the Names Equal "+name.equals(anoName));
        //this checks if the String is equals the anoName


        System.out.println("Name equals Ignore Case "+ name.equalsIgnoreCase(anoName));
        // this Ignores the Character Sensitivity, even if they're mixed with Upper and Lower Cases


        //we want to see if the names contain certain characters eg. orr
        System.out.println("Does the Name "+ anoName +" contain orr? " +  name.contains("orr"));

        //play with the Substring, endswith, and the startswith, comparesto

    }
}
