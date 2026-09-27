class Solution {

    public int maxVowels(String s, int k) {
        
        int i = 0, res = 0, cnt = 0;

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        while(i < k) if(set.contains(s.charAt(i++))) cnt++;

        res = cnt;

        for(int j = i; j < s.length(); j++){

            if(set.contains(s.charAt(j - k))) cnt--;
            if(set.contains(s.charAt(j))) cnt++;

            res = Math.max(res, cnt);
        }

        return res;
    }
}