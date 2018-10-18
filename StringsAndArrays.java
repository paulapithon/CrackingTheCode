public class StringsAndArrays {

    public static void main(String[] args) {
        /**1.1**/
        System.out.println(IsUnique.run("abcdb")); //false 
        System.out.println(IsUnique.run("atrpe")); //true
        
        /**1.2**/
        System.out.println(CheckPermutation.run("aabcd", "abadc")); //true
        System.out.println(CheckPermutation.run("aabcd", "abc")); //false
        System.out.println(CheckPermutation.run("aabcd", "abcdd")); //false

        /**1.3**/
        System.out.println(OneWay.run("aaac", "caac")); //true
        System.out.println(OneWay.run("aaac", "ac")); //false
        System.out.println(OneWay.run("aac", "aaac")); //false

        /**1.4**/
        System.out.println(URLify.run("PEDRO IVO SOUSA    ".toCharArray(), 15)); //PEDRO%20IVO%20SOUSA
        System.out.println(URLify.run("PAULA BESERRA PITHON    ".toCharArray(), 20)); //PAULA%20BESERRA%20PITHON

        /**1.5**/
        System.out.println(PalindromePermutation.run("abaaab")); //true
        System.out.println(PalindromePermutation.run("abacaab")); //true
        System.out.println(PalindromePermutation.run("abacab")); //false

        /**1.6**/
        System.out.println(StringCompression.run("aaabbdccccc")); //a3b2d1c5
        System.out.println(StringCompression.run("aaabbbbbbdcefggg")); //a3b6d1c1e1f1g3
        System.out.println(StringCompression.run("aaabbdcefggg")); //aaabbdcefggg
    }
}
