public class TrappedRainWater {
    public static int TrappedWater(int[] height){ // O(n)
        int water = 0;
        int n = height.length;
        // leftMax 
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //rightMax
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        // trapped water loop 
        for(int i=0;i<n;i++){
            int minValue = Math.min(leftMax[i] , rightMax[i]);
            // waterlevel = min(leftmax , rightmax) - height of building
            water += minValue - height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        int result = TrappedWater(arr);
        System.out.println("the trapped water amount is " + result);
    }
}
