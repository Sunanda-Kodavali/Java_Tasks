public class LastWordLength {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ".trim()));
    }

    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length-1].length();
    }
}
