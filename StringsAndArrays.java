public class StringsAndArrays {

    public static void main(String[] args) {
        /**1**/
        System.out.println(IsUnique.run("abcdb")); //false 
        System.out.println(IsUnique.run("atrpe")); //true
        
        /**2**/
        System.out.println(CheckPermutation.run("aabcd", "abadc")); //true
        System.out.println(CheckPermutation.run("aabcd", "abc")); //false
        System.out.println(CheckPermutation.run("aabcd", "abcdd")); //false
    }
}
