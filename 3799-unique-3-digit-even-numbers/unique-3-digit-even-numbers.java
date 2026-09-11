class Solution {
    public int totalNumbers(int[] digits) {
        
        int res = 0;

        int n = digits.length;

        boolean[] vis = new boolean[1000];

        for(int i = 0; i < n; i++){

            if(digits[i] == 0) continue;

            for(int j = 0; j < n; j++){

                if(i == j) continue;

                for(int k = 0; k < n; k++){

                    if(i == k || j == k || digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if(!vis[num]){
                        res++;
                        vis[num] = true;
                    }
                }
            }
        }

        return res;
    }
}