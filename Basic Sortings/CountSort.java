public class CountSort {
    
    public static void countSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }

        public static void printArray(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,3,5,4,5,6,7,8};
        countSort(arr);
        printArray(arr);
    }
}
