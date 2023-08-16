public class leastFiveStringsClassOperations
{
        public static void main(String[] args) {
// Operation 1: Creating strings
            String str1 = "Hello, ";
            String str2 = "world!";

// Operation 2: Concatenation
            String combined = str1.concat(str2);
            System.out.println("Concatenated string: " + combined);

// Operation 3: Length
            int length = combined.length();
            System.out.println("Length of the string: " + length);

// Operation 4: Substring
            String sub = combined.substring(7);
            System.out.println("Substring from index 7: " + sub);

// Operation 5: Index of
            int index = combined.indexOf("world");
            System.out.println("Index of 'world': " + index);
        }
    }
