class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r=numbers.length-1,l=0;
        while(l<r){
            int sum=numbers[r]+numbers[l];
            if(sum<target)l++;
            else if(sum>target)r--;
            else return new int[]{l+1,r+1};
            
        }
        return null;
    }
}
