class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        int mid;
        while(si<=ei){
            mid=si+(ei-si)/2;
            if(nums[mid]<target) si=mid+1;
            if(nums[mid]>target) ei=mid-1;
            if(nums[mid]==target) return mid;
        }
        return -1;
    }
}
