class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        backtrack(nums,target,0,new ArrayList<>(), ans);
        return ans;
    }
    public void backtrack(int [] nums, int target,int start,List<Integer> l, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target)continue;
            else {
                l.add(nums[i]);
                backtrack(nums,target-nums[i],i,l,ans);
                l.remove(l.size()-1);
            }
        }
    }
}
