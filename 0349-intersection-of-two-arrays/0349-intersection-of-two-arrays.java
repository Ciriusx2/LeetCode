class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int size=set2.size();
        int idx=0;
        int []ans =new int[size];
        for(int i:set2){
            ans[idx++]=i;
        }
        return ans;
        
    }
}