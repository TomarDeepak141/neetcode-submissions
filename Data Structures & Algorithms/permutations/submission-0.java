class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans =new ArrayList<>();
        backtrack(nums,new ArrayList<>(), ans);
        return ans;
    }
    public void backtrack(int [] nums,List<Integer> l, List<List<Integer>> ans){
        if(l.size()==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i:nums){
            if(l.contains(i))continue;
                l.add(i);
                backtrack(nums,l,ans);
                l.remove(l.size()-1);
            }
        }  
    
}

