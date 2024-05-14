public class IndexFirstOccurrenceString {
    public static void main(String[] args) {

        String haystack = "leetcode", needle = "leetco";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {

        if( haystack.contains(needle) ){
           return haystack.indexOf(needle);
        }
        return -1;
    }
}
