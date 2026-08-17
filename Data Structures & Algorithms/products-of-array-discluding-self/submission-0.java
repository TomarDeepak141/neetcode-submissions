class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans=1;
        int zCount=0;
        for(int i:nums){
            if(i==0){
                zCount++;
                continue;
            }
            else ans*=i;
        }
        int[] result= new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(zCount>1)return result;
            else if(zCount==1){
                if(nums[i]!=0)continue;
                else result[i]=ans;
            }
            else{
                result[i]=ans/nums[i];
            }
        }
        

        return result;
    }
}  
