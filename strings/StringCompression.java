public class StringCompression {
    public static String run(String string) {
        StringBuilder compressed = new StringBuilder();
        int counter = 1;
        char occurenceChar = string.charAt(0);
        //Compress each occurence of the string
        for (int i = 1; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            //If char changed
            if (occurenceChar != currentChar) {
                //Append occurence
                compressed.append(occurenceChar);
                compressed.append(counter);
                //Reset occurence
                 occurenceChar = currentChar;
                 counter = 1;
            } else {
                counter++;
            }   
        }
        //Add final occurente to stringBuilder
        compressed.append(occurenceChar);
        compressed.append(counter);
        //Check if compressed has become smaller than original string
        if (compressed.length() < string.length()) {
            return compressed.toString();
        } else {
            return string;
        }
    }
}