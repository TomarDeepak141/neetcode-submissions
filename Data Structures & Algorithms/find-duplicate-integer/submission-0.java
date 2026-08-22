class Solution {
    public int findDuplicate(int[] nums) {
        int[] hashTable=new int[10001];
        for(int i:nums){
            hashTable[i]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hashTable[i]>1)return i;
        }
        return -1;
    }
}
