public class URLify {
    public static char[] run(char[] string, int trueLength) {
        //Save last index
        int spaceIndex = string.length - 1;
        //Scan starting from the end of the true array
        for (int i = trueLength - 1; i >= 0; i--) {
            //If it's not a space, replace last index with character
            if (string[i] != ' ') {
                string[spaceIndex] = string[i];
                spaceIndex--;
            //Replace space with 02%
            } else {
                string[spaceIndex] = '0';
                string[spaceIndex - 1] = '2';
                string[spaceIndex - 2] = '%';
                spaceIndex -= 3;
            }
        }
        return string;
    }
}