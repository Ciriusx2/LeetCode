class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=(n*(n+1))/2;
        int result=0;
        for(int i:nums){
            result+=i;
        }
        return Math.abs(total-result);
    }
}