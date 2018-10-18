public class CheckPermutation {

    /**Check Permutation**/
    public static boolean run(String first, String second) {
        //If sizes are different, it's not a permutation
        if (first.length() != second.length()) { return false; }
        //Instantiate array with ASCII count size
        int[] counter = new int[128];
        //Increment based on first array
        for (int i = 0; i < first.length(); i++) {
            counter[Character.getNumericValue(first.charAt(i))]++;
        }
        //Decrement based on second array
        for (int i = 0; i < second.length(); i++) {
            counter[Character.getNumericValue(second.charAt(i))]--;
        }
        //Check if both arrays match
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }
        return true;   
    }

}