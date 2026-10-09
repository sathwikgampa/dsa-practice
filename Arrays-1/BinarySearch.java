public class BinarySearch {
    public static int GetBinarySearch(int nums[] , int key){
        int start = 0;
        int last = nums.length - 1;
        while(start<=last){
            int mid = (start+last)/2;
            if(nums[mid]==key){
                return mid;
            }else if(nums[mid] > key){ // left side
                last = mid -1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,8,3,22,44,2,21,45};
        int key = 22;
        System.out.println("The key is at the index " + GetBinarySearch(arr, key) );
    }
}
