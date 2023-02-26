import java.util.HashMap;
import java.util.Stack;

public class ValidateParanthases {

public boolean isValid(String s) {
        
        HashMap<Character, Character> hmap = new HashMap<>();
        hmap.put(')', '(');
        hmap.put('}', '{');
        hmap.put(']', '[');

        int stringLength = s.length();

        Stack<Character> st = new Stack<>();
        for(int index=0; index < stringLength; index++){

           // for open brackets
            if((s.charAt(index) == '(') || (s.charAt(index) == '{') || (s.charAt(index) == '[')){
                st.push(s.charAt(index));
                continue;
            }

           // for closed brackets
            if((st.size() !=0) && (hmap.get(s.charAt(index)) != st.pop())){
                    return false;
                }           
            }
            // If the stack is empty, return true...
        if (st.size() == 0) {
            return true;
        }
        
		return false;
        }

}
