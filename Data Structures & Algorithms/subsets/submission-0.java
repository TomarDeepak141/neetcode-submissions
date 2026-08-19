class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public void backtrack(int[] nums,int start,List<Integer>l, List<List<Integer>> ans){
        
        if(start==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        backtrack(nums,start+1,l,ans);
        l.add(nums[start]);
        backtrack(nums,start+1,l,ans);
        l.remove(l.size()-1);
    }
}
