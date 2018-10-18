public class PalindromePermutation {
    public static boolean run(String string) {
        //If it only has one character, it's true
        if (string.length() < 2) { return true; }
        //Add counter to each character position
        int[] counter = new int[128];
        for (int i = 0; i < string.length(); i++) {
            counter[Character.getNumericValue(string.charAt(i))]++;
        }
        //Check if there are odd number whithin the counter
        boolean odd = false;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] % 2 != 0) {
                if (odd) { return false; }
                odd = true;
            }
        }
        return true;
    }
}