class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        ArrayList<Integer> List=new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = a.length - 1;
        int right = a[0].length - 1;
        while (top<=bottom && left<=right) {
            // left wall
            for (int i = left;  i <= right ; i++) {
                List.add(a[top][i]);
            }
            top++;
            // bottom wall
            for (int i = top; i<= bottom ; i++) {
                List.add(a[i][right]);
            }
            right--;
            // Right wall
            if(top<=bottom){
            for (int i = right; i >= left ; i--) {
                List.add(a[bottom][i]);
            }
            bottom--;}
            // top wall
            if(left<=right){
            for (int i = bottom ; i >= top ; i--) {
                List.add(a[i][left]);
            }
            left++;}
            
        }
        return List;
    }
}