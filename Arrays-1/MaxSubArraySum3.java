// kadane's algo , results in O(n)
public class MaxSubArraySum3 {
    public static void KadanesAlgo(int[] nums){
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentSum = currentSum +  nums[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("the maximum sum of subarray is " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        KadanesAlgo(arr);
    }
}
