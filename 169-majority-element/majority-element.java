import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int candidate = -1;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(cnt == 0){
                candidate = nums[i];
                cnt = 1;
            }else{
                if(nums[i] == candidate) cnt++;
                else cnt--;
            }
        }

        cnt = 0;
        for(int i = 0; i < n; i++) if(nums[i] == candidate) cnt++;

        return cnt > (n/2) ? candidate : -1;
    }
}