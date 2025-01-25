import java.util.*;

class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        createSubset(nums, 0, res, subset);
        return res;
    }
    public void createSubset(int nums[],int i, List<List<Integer>>res, List<Integer>subset){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        createSubset(nums, i+1,res,subset);


        subset.remove(subset.size()-1);
        createSubset(nums, i+1,res,subset);
    }
    public static void main(String[] args) {
        Subset subsetObj = new Subset();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsetObj.subsets(nums);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
    

