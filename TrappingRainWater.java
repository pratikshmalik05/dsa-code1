public class trappingRainWater {
    public static int trappedRain(int height[]){
        // left max boundary -array
        int leftMax[] = new int[height.length];
        leftMax[0]=height[0];
        for( int i=1; i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        

        // right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }
        int trappedRain = 0;
        // loop
        for (int i=0;i<height.length;i++){
            int waterlevel = Math.min(rightMax[i], leftMax[i]);
            trappedRain += waterlevel-height[i];
            }

        // water level = min( left max ,right max)
        // trapped water = (water level-height[i])*width
     
        return trappedRain;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("trapped water:"+trappedRain(height));
        
    }
    
}
