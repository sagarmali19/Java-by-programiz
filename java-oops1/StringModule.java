public class StringModule {
    public static void main(String[] args) {
        /* Strings in Java are not primitive types (like int, char, etc). Instead, all strings are objects of a predefined class named String.
        And all string variables are instances of the String class. */

        // Get length of the string
        String str1 = "Hello World";
        int length = str1.length();
        System.out.println(length);

        // Concat two strings
        String str2 = "PRogramming";
        String joinedStrig = str1.concat(str2);
        System.out.println(joinedStrig);

        // Compare two strings
        boolean result = str1.equals(str2);
        System.out.println(result);

        // Use of escape character
        String str3 = "This is \"String\" in java";
        System.out.println(str3);

        /* In Java, strings are immutable. This means once we create a string, 
        we cannot change that string. */

        // We can create a new string using new keyword as strings are objects
        String name = new String("Java language");
        System.out.println(name);

        /* In Java, the JVM maintains a string pool to store all of its strings inside the memory. The string pool helps in reusing the strings.

        1. While creating strings using string literals,

        String example = "Java";
        Here, we are directly providing the value of the string (Java). Hence, 
        the compiler first checks the string pool to see if the string already exists.

        If the string already exists, the new string is not created. Instead, 
        the new reference, example points to the already existing string (Java).
        If the string doesn't exist, a new string (Java) is created.
        2. While creating strings using the new keyword,

        String example = new String("Java");
        Here, the value of the string is not directly provided. Hence, a new "Java" 
        string is created even though "Java" is already present inside the memory pool. */
    }
}
