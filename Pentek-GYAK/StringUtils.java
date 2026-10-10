public class StringUtils {
    public static String swapCase (String s) {
        int stringLenght = s.length();
        StringBuilder szo = new StringBuilder();
        for (int i = 0; i<stringLenght; i++) {
            if (s.charAt(i)s)
            szo.append(s.charAt(i));
        }
        return szo.toString();
    }
}
