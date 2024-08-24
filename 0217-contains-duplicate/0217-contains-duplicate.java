class Solution {
    public boolean containsDuplicate(int[] a) {
     int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                return true;
            }
            else if(a[i]<a[i-1]){
                for(int j=i-1;j>=0;j--){
                    if(a[i]==a[j]){
                        return true;
                    }
                }int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        return false;}
    
}