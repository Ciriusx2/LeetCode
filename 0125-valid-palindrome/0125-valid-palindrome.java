class Solution {
    public boolean isPalindrome(String s) {
        char x[]=s.toCharArray();
        char ans[]=new char[s.length()];
        int c=0;
        for(char i:x)
        {
            if(i>='a' && i<='z' || i>='0' && i<='9')
            {
                ans[c++]=i;
                continue;
            }
            if(i>='A' && i<='Z')
            {
                ans[c++]=Character.toLowerCase(i);
            }
        }
        int left=0;
        int right=c-1;
        while(left<right)
        {
            if(ans[left]!=ans[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}