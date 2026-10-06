public class CharacterDemo {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '1';
        char ch4 = ' ';

        // isLetter() - Megnézi, hogy az adott karakter betű-e
        System.out.println("Is " + ch1 + " a letter? " + Character.isLetter(ch1)); // true
        System.out.println("Is " + ch3 + " a letter? " + Character.isLetter(ch3)); // false

        // isDigit() - Megnézi, hogy az adott karakter számjegy-e
        System.out.println("Is " + ch3 + " a digit? " + Character.isDigit(ch3)); // true
        System.out.println("Is " + ch1 + " a digit? " + Character.isDigit(ch1)); // false

        // isWhitespace() - Megnézi, hogy az adott karakter fehérhely-e (pl. szóköz)
        System.out.println("Is ' ' whitespace? " + Character.isWhitespace(ch4)); // true

        // isUpperCase() és isLowerCase() - Megnézi, hogy nagybetű vagy kisbetű-e
        System.out.println("Is " + ch1 + " uppercase? " + Character.isUpperCase(ch1)); // true
        System.out.println("Is " + ch2 + " lowercase? " + Character.isLowerCase(ch2)); // true

        // toUpperCase() és toLowerCase() - Nagybetűvé vagy kisbetűvé alakítás
        System.out.println("Lowercase version of " + ch1 + ": " + Character.toLowerCase(ch1)); // 'a'
        System.out.println("Uppercase version of " + ch2 + ": " + Character.toUpperCase(ch2)); // 'A'

        // isAlphabetic() - Megnézi, hogy az adott karakter ábécés karakter-e
        System.out.println("Is " + ch1 + " alphabetic? " + Character.isAlphabetic(ch1)); // true
        System.out.println("Is " + ch3 + " alphabetic? " + Character.isAlphabetic(ch3)); // false

       
        // getNumericValue() - Karakter számbeli értékének visszaadása (pl. '1' -> 1)
        System.out.println("Numeric value of " + ch3 + ": " + Character.getNumericValue(ch3)); // 1

        // charCoun
    }
}
