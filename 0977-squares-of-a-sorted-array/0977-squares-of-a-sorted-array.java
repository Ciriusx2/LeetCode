class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int [nums.length];
        int idx=nums.length-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(b>a){
                res[idx]=b;
                j--;
            }
            
            else{
                res[idx]=a;
                i++;
            }
            idx--;
        }
        return res;
    }
}