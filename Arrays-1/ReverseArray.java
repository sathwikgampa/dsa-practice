public class ReverseArray {
    public static void GetReverseArray(int[] nums){
        int first = 0, last = nums.length-1;
        while(first<last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp; 

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        GetReverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
}
