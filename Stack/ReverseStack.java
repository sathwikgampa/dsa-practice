import java.util.*;
public class ReverseStack {
    public static void PushAtBottom(Stack<Integer> s ,int  data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    public static  void ReverseStack1(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        ReverseStack1(s);
        PushAtBottom(s,top);
    }
    public  static  void PrintStack(Stack<Integer> s ){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // when i print this , the order will be , 4 , 3 , 2 , 1 
        ReverseStack1(st);
        PrintStack(st);
        // 1 , 2 , 3 , 4 
    }
}
