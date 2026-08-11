class Solution {
    public String frequencySort(String s) {
        
        int[] freq = new int[128];

        for(char ch : s.toCharArray()) freq[ch]++;


        StringBuilder sb = new StringBuilder();

        for(int f = s.length(); f > 0; f--){
            for(int i = 0; i < 128; i++){
                if(freq[i] == f){
                    char ch = (char)i;


                    for(int j = 0; j < f; j++) sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}