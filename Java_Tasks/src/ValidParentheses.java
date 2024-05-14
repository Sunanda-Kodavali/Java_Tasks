import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid(")("));
    }
    public static boolean isValid(String s) {

       Stack<Character> characterStack = new Stack<>();

        for (char c: s.toCharArray()) {

                if (c == '(' || c == '[' || c == '{') {
                    characterStack.push(c);
                } else if (c == ')' && !characterStack.isEmpty() && characterStack.peek() == '(') {
                    characterStack.pop();
                } else if (c == ']' && !characterStack.isEmpty() && characterStack.peek() == '[') {
                    characterStack.pop();
                } else if (c == '}' && !characterStack.isEmpty() && characterStack.peek() == '{') {
                    characterStack.pop();
                } else {
                    return false;
                }

        }
        return characterStack.isEmpty();
    }
}
