import javax.xml.stream.events.Characters;

public class ConvertUppercaseoddindexes {
    public static void main(String[] args) {
        String str= "something";
        for (int i = 0; i < str.length() ; i++) System.out.print((i%2)==0? Character.toUpperCase(str.charAt(i)):str.charAt(i));
    }
}
