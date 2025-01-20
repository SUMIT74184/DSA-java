package StacksProbs;
import java.util.*;

public class QuestionPro {
    int countRev (String s) {
        if (s.length() % 2 != 0) {
            return -1;
        }
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty() || st.peek() == '}') {
                    st.push(ch);
                } else {
                    st.pop();
                }
            }

        }
        int ans = 0;
        int openBracket = 0, closeBracket = 0;
        while (!st.isEmpty()) {
            char top = st.pop();
            if (top == '{') {
                openBracket++;
            } else {
                closeBracket++;
            }

        }
        ans = (int) Math.ceil((openBracket / 2.0) + Math.ceil(closeBracket / 2.0));

        return ans;
    }
        public static void main(String[] args) {
        System.out.println();
    }
}
