public class LargestNumber {
    public static int GetLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,44,33,22,111,566};
        System.out.println("The largest element in the array is " + GetLargest(arr));
    }
}
