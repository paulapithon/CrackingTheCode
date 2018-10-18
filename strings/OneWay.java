public class OneWay {
    public static boolean run(String first, String second) {
        //Check if size different is greater than one
        if (Math.abs(first.length() - second.length()) > 1) { return false; }
        //Create index that will go through the strings
        boolean edited = false;
        int firstIndex = 0;
        int secondIndex = 0;
        //Iterate over strings
        while (firstIndex < first.length() && secondIndex < second.length()) {
            //Check if characters are different on positions
            if (first.charAt(firstIndex) != second.charAt(secondIndex)) {
                //Check if it was edited
                if (first.length() == second.length()) {
                   firstIndex++;
                    secondIndex++;
                //Check if it was removed
                } else if (first.length() > second.length()) {
                    firstIndex++;
                //Check if it was added
                } else {
                    secondIndex++;
                }
                //Check if it already has an edition
                if (edited == true) {
                    return false;
                } else {
                    edited = true;
                }
            } else {
                firstIndex++;
                secondIndex++;
            }
        }
        return true;
    }
}