package leetCodeTest.no844;

import java.util.Stack;

public class Solution844 {

  public boolean backspaceCompare(String s, String t) {

    Stack<Character> stack1 = new Stack<>();
    Stack<Character> stack2 = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if(!stack1.empty() && s.charAt(i) == '#') stack1.pop();
      else if(s.charAt(i) != '#') stack1.push(s.charAt(i));
    }

    for (int i = 0; i < t.length(); i++) {
      if(!stack2.empty() && t.charAt(i) == '#') stack2.pop();
      else if(t.charAt(i) != '#') stack2.push(t.charAt(i));
    }

    return stack1.equals(stack2);
  }
}
