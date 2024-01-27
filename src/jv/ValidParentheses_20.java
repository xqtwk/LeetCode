package jv;

import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char character: s.toCharArray()) {
            if(character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if(character == ')') {
                if(stack.isEmpty() || stack.pop() != '(')
                    return false;
            } else if(character == '}') {
                if(stack.isEmpty() || stack.pop() != '{')
                    return false;
            } else if(character == ']') {
                if(stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
