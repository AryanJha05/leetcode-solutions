//With StringBuilder :
// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
//         StringBuilder newWord1 = new StringBuilder();
//         StringBuilder newWord2 = new StringBuilder();

//         for (int i = 0; i < word1.length; i++) newWord1.append(word1[i]);

//         for (int i = 0; i < word2.length; i++) newWord2.append(word2[i]);

//         return newWord1.toString().equals(newWord2.toString());
//     }
// }



//With String :
// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         String s1="";String s2="";
//         for(int i=0;i<word1.length;i++) s1=s1+word1[i];
//         for(int i=0;i<word2.length;i++) s2=s2+word2[i];
//         if(s1.equals(s2)) return true;
//         return false;
//     }
// }


//With Two Pointers : 
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        int pointer1 = 0, pointer2 = 0;
        int idx1 = 0, idx2 = 0;

        while(pointer1 < word1.length && pointer2 < word2.length){

            char char1 = word1[pointer1].charAt(idx1);
            char char2 = word2[pointer2].charAt(idx2);

            if(char1 != char2) return false;

            idx1++;
            idx2++;

            if(idx1 == word1[pointer1].length()){
                idx1 = 0;
                pointer1++;
            }

            if(idx2 == word2[pointer2].length()){
                idx2 = 0;
                pointer2++;
            }

        }
        return pointer1 == word1.length && pointer2 == word2.length;
    }
}