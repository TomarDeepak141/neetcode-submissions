class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> ans =new ArrayList<>();
      Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(), ans);
        return ans;
    }
    public void backtrack(int [] nums, int target,int start,List<Integer> l, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target)continue;
            else if(i>start&&nums[i]==nums[i-1])continue;
            else {
                l.add(nums[i]);
                backtrack(nums,target-nums[i],i+1,l,ans);
                l.remove(l.size()-1);
            }
        }  
    }
}
