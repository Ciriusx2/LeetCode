class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> st=new HashSet<>();
        int ans=-1;
        for(int num:nums1){
            st.add(num);
        }
        for(int num:nums2){
            if(st.contains(num)){
                ans=num;
                break;
            }
        }
        return ans;
    }
}