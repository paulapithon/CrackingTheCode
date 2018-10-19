public class StringRotation {

    public static boolean run(String s1, String s2) {
        //If sizes differ, its not a rotation
        if (s1.length() != s2.length()) { return false; }
        //Concat strings and check substring
        String result = s1 + s1;
        return result.contains(s2);
    }
    
}