public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int ans = -1;
        while(start<=n){
            int mid = start +(n-start)/2;
            if(isBadVersion (mid)){
                ans = mid ;
                n=mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        
    }
}
