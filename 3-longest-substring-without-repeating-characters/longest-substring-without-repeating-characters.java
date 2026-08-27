class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        int l = 0;

        for(int r = 0; r < s.length(); r++){


            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);

            while(window.get(s.charAt(r)) > 1){

                char remove = s.charAt(l);
                
                window.put(remove, window.get(remove) - 1);

                if(window.get(remove) == 0) window.remove(remove);

                l++;
                
            }

            maxLen = Math.max(maxLen, window.size());
        }

        return maxLen;
    }
}