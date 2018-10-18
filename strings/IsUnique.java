public class IsUnique {
    
    /**IsUnique**/
    public static boolean run(String string) {
        //Check only if string has more than one character
        if (string.length() < 2) { return true; }
        //Sort string
        char[] stringArray = string.toCharArray();
        Arrays.sort(stringArray);
        String sortedString = new String(stringArray);
        //Check if string has repeated elements
        for (int i = 0; i < sortedString.length() - 1; i++) {
            if (sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    } 
    
}