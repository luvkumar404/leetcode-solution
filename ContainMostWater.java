public class ContainMostWater{
    public static int maxArea(int[] height) {
        int n=height.length;
        int left=0, right=n-1;
        int max_area=0;
        while(left<right){
            max_area=Math.max(max_area,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max_area;
    }
    public static void main(String[] args){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}