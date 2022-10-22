public class NumericConversion {

    public static void main(String[] args) {
        //Numeric DATA TYPES
        int Age = 20;
        double Height = 6.78;
        String Weight = "57";
        int ConvWeightInt = Integer.parseInt(Weight);
        //CONveSions
        double ConvAge = Age;
        double ConvWeight = Double.parseDouble(Weight);
        System.out.println("Integer Age: "+ Age);
        System.out.println("Double Converted Age: " +ConvAge );
        System.out.println("String Weight: " + Weight);
        System.out.println("String Converted Weight: " + ConvWeight);
        System.out.println("Int weight: "+ ConvWeightInt);
    }
}
