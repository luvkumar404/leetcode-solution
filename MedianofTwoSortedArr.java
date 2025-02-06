import java.util.Arrays;

public class MedianofTwoSortedArr{
    public static double findMedianSortedArray(int nums1[], int nums2[]){
        int n=nums1.length;
        int m=nums2.length;

        int merge[] = new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            merge[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merge[k++]=nums2[i];
        }
        Arrays.sort(merge);
    
        int tot=merge.length;
        if(tot%2==1){
            return merge[tot/2];  
        }
        else{
            return ((double)merge[tot/2-1]+(double)merge[tot/2])/2;
        }
    }
    public static void main(String[] args) {
        int nums1[]= {1,2};
        int nums2[] = {3};
        System.out.print(findMedianSortedArray(nums1, nums2));
    }
}