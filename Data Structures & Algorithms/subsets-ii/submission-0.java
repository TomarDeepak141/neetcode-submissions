class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public void backtrack(int [] nums, int start, List<Integer> l, List<List<Integer>> ans){
        
            ans.add(new ArrayList<>(l));
            
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1])continue;
            
            l.add(nums[i]);
            backtrack(nums,i+1,l,ans);
            l.remove(l.size()-1);
        }
    }
}
