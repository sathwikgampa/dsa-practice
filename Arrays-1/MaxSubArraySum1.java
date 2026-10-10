public class MaxSubArraySum1 {
    public static void SumOfSubArrays(int nums[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i; 
            for(int j=i;j<nums.length;j++){
                currentSum = 0;
                int end = j;
                for(int k=start;k<=end;k++){ // we can even directly use indexes , but for initially using some variables
                    currentSum += nums[k];
                }
                System.out.println(currentSum);
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            System.out.println();
        }
        System.out.println("The maximum sum of subarray is " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        SumOfSubArrays(arr);
    }
}
