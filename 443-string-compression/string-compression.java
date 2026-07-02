class Solution {
    public int compress(char[] chars) {

        int n = chars.length;

        int i = 0, j = 0;

        while(i < n){
            char curr = chars[i];
            int cnt = 0;
            while(i < n && chars[i] == curr){
                cnt++;
                i++;
            }

            chars[j++] = curr;

            if(cnt > 1){
                String num = String.valueOf(cnt);
                for(char ch : num.toCharArray()) chars[j++] = ch;
            }
        }

        return j;
    }
}