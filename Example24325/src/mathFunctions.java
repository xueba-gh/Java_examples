public class mathFunctions {
    public static void main(String[] args) {
        //JAVA MATHS CONSTANTS PI & (E) EXPONENTS


        System.out.println("PI Value is: "+Math.PI);
        //final (f) in front of the PI and E, means that the Value can never Change


        System.out.println("Your E value is : "+ Math.E);
        System.out.println(Math.E);



        //JAVA TRIG FUNCTIONS Sin, Cos, Tan, etc


        //create a variable, a sin(90), cos(90), tan(90)
        double val = 90;

        System.out.println("Sin("+val+") is Equal to: "+ Math.sin(Math.toRadians((val)))); //converted the 90 to radians using the .toRadian method
        System.out.println("Sin("+val+") is in Radians "+ Math.sin(val));
        // for Sin

        //
        System.out.println("Cos("+val+") is Equal to: "+ Math.cos(Math.toRadians((val))));
        System.out.println("Cos("+val+") is in Radians "+ Math.cos(val));
        // For Cos

        System.out.println("Tan("+val+") is Equal to: "+ Math.tan(Math.toRadians((val))));


        System.out.println("Tan("+val+") is in Radians "+ Math.tan(val));
        // For Tan



        //java Exponential  Functions
        //29, 5^65 and cube root of 125
        System.out.println("Exponent e^5 is: "+Math.exp(5));
        System.out.println("Natural Log if 45 is : "+ Math.log(45));
        System.out.println("Square root of 29: "+ Math.sqrt(29));
        System.out.println("5^65 is : "+ Math.pow(5,5));
        // these above are for Power, Square and exponents


        // Just some space
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");

        //
        System.out.println("Cubic Roots of 125 is: "+Math.cbrt(125)); // you can use this one or that one.
        System.out.println("Cube root of Root 125 is:" + Math.pow(125, 1.0/3.0));
        // for cubic Roots. If you want a whole answer, use the cbrt or if you want the decimals, use Math.pow


        // Just some space
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");


        // Java ROUNDING FUNCTIONS ; ceil, floor , round , rint
        double val1 = 3.945;
        double val2 = 9.321;
        System.out.println("Floor of value "+ val1 +" is "+Math.floor(val1));

        System.out.println("Floor of value 2 "+ val2  +" is "+Math.floor(val2));
        // the Floor removes the decimals without rounding it. ### it is very dangerous: KEEP OFF

        System.out.println("               ");
        System.out.println("               ");
        //Just Some Space

        System.out.println("Ceil of value "+ val1 +" is "+Math.ceil(val1));

        System.out.println("Ceil of value 2 "+ val2  +" is "+Math.ceil(val2));

        // the Ceil Rounds it Up as in Above.. Again this is very TOXIC (X:))). KEEP OFF

        System.out.println("               ");
        System.out.println("               ");
        //Just Some Space

        System.out.println("rint of value "+ val1 +" is "+Math.rint(val1));

        System.out.println("rint of value 2 "+ val2  +" is "+Math.rint(val2));

        // teh Rint is the one which rounds the decimal close to the integer


        System.out.println("               ");
        System.out.println("               ");
        //Just Some Space

        System.out.println("Rounding of value "+ val1 +" is "+Math.round(val1));

        System.out.println("Rounding of value 2 "+ val2  +" is "+Math.round(val2));
        System.out.println("Rounding of  values to round and round and round two..." + " is" +Math.ceil(val2));

        //Rounding is Okay and preferable

        //If you have 2.0/6.0 = 0.333, how will you round this in 3 decimal places
        /*System.out.println("This is How to Round a number to 3 decimal places: "+Math.rq);*/



        //Special Rounding to a Specific Decimal Place
        double y = 2.0/6;
        System.out.println("The value of Y is : "+ Math.round(y*100000)/100000.0);

        // Multiply the value by 10 to the power of the Decimals
        // then use mathe.round to round it up, then
        // divide by 10 to the power of the decimals


        //JAVA MIN, MAX AND ABSOLUTE(abs) FUNCTIONS
        System.out.println(Math.min(2.023, -2.0389));
        // this Returns your Minimun of the Two,
        System.out.println(Math.max(2.023, -2.0389));
        System.out.println(Math.abs (-2.0389));


        /// WHat if THou hadth 3 values?

        System.out.println(Math.min(2.023, -2.0389));
        // Unless you find the Minimum of the first Two and then Use the Answer against the third value.

        //Examples
        System.out.println(Math.min(-2.023,Math.min(-3.78, 4.23)));


        // RANDOM NUMBER GENERATION IN JAVA

        double randomNum = Math.random();
        System.out.println("The Random Number is: "+ randomNum);
        // this Random number generation gives the random numbers in a new or next run. either within range , but not 0
        System.out.println("    ");
        System.out.println("    ");
        //just some space

        // the Random Number is from 0 to less than 1
        System.out.println("Random Number by 4 is "+ randomNum* 5);
        //cast it as an int,
        System.out.println("Random Number by 4 is "+ (int) (randomNum*4));
        // you can use Math.floor and the rest as well to cast, not only the int.


        // UNICODE AND ASCII CODE
        //Computers use binary numbers internally
        // As Encoding . There is a Unicode Scheme which were 16-bit characters to handle 65,536 something something...
        // The ASCII SCHEME is an 8-bit encoding scheme for repre
        // what is a control character? a possible Quiz Question.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Declaring a Character is similar to a string declaration
        // Char Letter = 'B:; It only takes One character at a time.....
        // escape sequencess???? ;;; Backslashh \\\

        // read about the Casting between, Methods of Camparing and Testing Character. WHy do I need to know Why? HOw and What?







    }
}
