import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[] arr = {6,8,0,1,3};
        int[] NextGreater = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            // while 
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            // if
            if(s.isEmpty()){
                NextGreater[i] = -1;
            }else{
                NextGreater[i] = arr[s.peek()];
            }
            // push 
            s.push(i);

        }

        for(int i=0;i<NextGreater.length;i++){
            System.out.print(NextGreater[i]+" ");
        }
    }
}
