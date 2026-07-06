class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder newWord1 = new StringBuilder();
        StringBuilder newWord2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) newWord1.append(word1[i]);

        for (int i = 0; i < word2.length; i++) newWord2.append(word2[i]);

        return newWord1.toString().equals(newWord2.toString());
    }
}