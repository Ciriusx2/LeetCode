class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(heights[i]>heights[j])
                {
                    int temp=heights[j];
                    heights[j]=heights[i];
                    heights[i]=temp;
                    String s=names[j];
                    names[j]=names[i];
                    names[i]=s;
                }
            }
        }
        return names;
    }
}