// this is 2nd approach , by prefix sum which gives O(n^2)
public class MaxSubArraySum2 {
    public static void PrefixArray(int[] nums){
        int maxSum =Integer.MIN_VALUE;
        int currSum = 0;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                currSum =(i==0) ? prefix[j] :  prefix[j] - prefix[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("the maximum sum of subarray is " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        PrefixArray(arr);;
    }
}
