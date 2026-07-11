class Solution {
    public String longestPalindrome(String s) {
 
        int n = s.length();

        int max = Integer.MIN_VALUE;

        int start = 0;
        for(int i = 0; i < n; i++){
            //ODD length : 
            int l = i, r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                int len = r-l;
                if(len > max){
                    max = len;
                    start = l;
                }
                l--;
                r++;
            }

            //EVEN length : 
            l = i;
            r = i+1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                int len = r-l;
                if(len > max){
                    max = len;
                    start = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(start, start + max + 1);
    }
}