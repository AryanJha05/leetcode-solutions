class Solution {

    public int[] distinctDifferenceArray(int[] nums) {
        
        int n = nums.length;

        int[] prefix = new int[n];
        int[] sufix = new int[n];

        //Prefix : 
        int[] freq = new int[51];
        
        int cnt = 0;
        for(int i = 0; i < n; i++){

            if(freq[nums[i]] == 0) cnt++;

            freq[nums[i]]++;

            prefix[i] = cnt;
        }

        //Suffix : 
        freq = new int[51];
        cnt = 0;
        for(int i = n-1; i >= 0; i--){
            if(freq[nums[i]] == 0) cnt++;

            freq[nums[i]]++;

            sufix[i] = cnt;
        }

        //Result : 

        int[] res = new int[n];

        for(int i = 0 ;i < n; i++){

            int right = i < n - 1 ? sufix[i+1] : 0;

            res[i] = prefix[i] - right;
        }

        return res;

    }
}

