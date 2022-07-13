class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int r=arr.length;
        int c=arr[0].length;
        int left=0;
        int right= r*c-1;
        while(left<=right){
            int midpoint=left+(right-left)/2;
                    int midpoint_element=arr[midpoint/c][midpoint%c];

            if(midpoint_element==target) return true;
           
            else if(target<midpoint_element) right=midpoint-1;
             else if(target>midpoint_element) left=midpoint+1;
        }
        return false;
    }
}
