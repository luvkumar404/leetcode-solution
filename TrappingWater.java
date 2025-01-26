import java.util.*;

class TrappingWater {

    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        int total = 0;
        int l = 0, r = height.length - 1;
        int lmax = 0, rmax = 0;

        while (l < r) {
            if (height[l] <= height[r]) {
                if (height[l] < lmax) {
                    total += lmax - height[l];
                } else {
                    lmax = height[l];
                }
                l++;
            } else {
                if (height[r] < rmax) {
                    total += rmax - height[r];
                } else {
                    rmax = height[r];
                }
                r--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        TrappingWater trapWater = new TrappingWater();
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water: " + trapWater.trap(heights));
    }
}
