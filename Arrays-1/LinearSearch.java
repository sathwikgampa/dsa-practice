
public class LinearSearch {
    public static int LinearSearchFunction(String strs[], String str){
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals(str)){ // for int , or other , we can use ==
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int arr[] = {2,5,7,6,8,9,10};
        String strs[] = {"apple", "kiwi" ,"banana" , "mango"};
        String str = "kiwi";
        int findOut = LinearSearchFunction(strs, str);
        //int key  = 8;
        //int result = LinearSearchFunction(arr, key);
        System.out.println("The key  found at index " + findOut);
    }
}
