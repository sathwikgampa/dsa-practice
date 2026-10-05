import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean IsDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // n=initially , writing the closing case , as the opening case is just push character 
            if(ch==')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // ()
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b) + (c+d))"; // returns false 
        String str1 = "(((a+b) + (c+d)))"; // returns true 
        System.out.println(IsDuplicate(str));
        System.out.println(IsDuplicate(str1));

    }
}
