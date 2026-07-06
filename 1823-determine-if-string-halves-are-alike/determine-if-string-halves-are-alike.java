class Solution {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') return true;

        return false;
    }

    public boolean halvesAreAlike(String s) {
        int n = s.length();

        int ftCnt = 0, sdCnt = 0;


        for(int i = 0; i < n / 2; i++) {
            if(isVowel(s.charAt(i))) ftCnt++;
            if(isVowel(s.charAt(i+(n/2)))) sdCnt++;
        }

        return ftCnt == sdCnt;
    }
}