/*
    Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.

Constraints:
•         1 <= nums . lengtth <= 10^5
•        -10^9 <= nums [ i ] <= 10^9
*/
public class q1 {
    public static void CheckTwice(int[] arr){
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            int currCount = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    currCount++;
                }
                maxCount = Math.max(maxCount, currCount);
            }
        }
        if(maxCount >= 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1}; // true
        CheckTwice(arr1);
        int[] arr2 = {1,2,3,4}; // false
        CheckTwice(arr2);
        int[] arr3 = {1,1,1,3,3,4,3,2,4,2}; // true
        CheckTwice(arr3);
    }
}
