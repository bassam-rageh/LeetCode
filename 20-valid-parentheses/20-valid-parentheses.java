class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char x;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i);
            if (x == '(') {
                stack.push(')');
            } else if (x == '[') {
                stack.push(']');
            } else if (x == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != x) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}