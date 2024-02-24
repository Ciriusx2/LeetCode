class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int c: nums){
            r^=c;
        }
        return r;
    }
}