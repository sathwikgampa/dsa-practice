public class PrintSubArrays {
    public static void SubArrays(int nums[]){
        int TotalSubArrays = 0;
        for(int i=0;i<nums.length;i++){
            int start = i; 
            for(int j=i;j<nums.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ // we can even directly use indexes , but for initially using some variables
                    System.out.print(nums[k]+" ");
                }
                TotalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays are : " + TotalSubArrays);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        SubArrays(arr);
    }
}
