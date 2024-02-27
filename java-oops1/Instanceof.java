public class Instanceof {

    public static void main(String[] args) {
        // The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.

        String name = "Sagar";
        boolean result = name instanceof String;
        System.out.println(result);

        Instanceof obj = new Instanceof();
        boolean result2 = obj instanceof Instanceof;
        System.out.println(result2);

        // In Java, all the classes are inherited from the Object class. So, instances of all the classes are also an instance of the Object class.
    }
}
