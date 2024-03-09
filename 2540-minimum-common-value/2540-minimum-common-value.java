class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Set<Integer> st=new HashSet<>();
        // int ans=-1;
        // for(int num:nums1){
        //     st.add(num);
        // }
        // for(int num:nums2){
        //     if(st.contains(num)){
        //         ans=num;
        //         break;
        //     }
        // }
        // return ans;
         int i=0, j=0;
        int length1=nums1.length;
        int length2= nums2.length;
        if (nums1[length1-1] < nums2[0] || nums2[length2-1] < nums1[0])
            return -1;
        while (i<length1 && j<length2) {
            if (nums1[i] == nums2[j]) return nums1[i];
            else if (nums1[i] > nums2[j]) j++;
            else i++;
        } return -1;
    }
}