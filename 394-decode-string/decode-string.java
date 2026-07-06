class Solution {
    public String decodeString(String s) {
        
        StringBuilder res = new StringBuilder();

        int n = s.length();
        int i = 0;
        int k = 0;

        while (i < n) {

            // Initialize k
            if (Character.isDigit(s.charAt(i))) {
                k = 0;

                // Handles multi-digit numbers like 12[a]
                while (i < n && Character.isDigit(s.charAt(i))) k = k * 10 + (s.charAt(i++) - '0');
            }

            // Find word to multiply
            else if (s.charAt(i) == '[') {
                i++;

                int openBracketCnt = 1;
                StringBuilder temp = new StringBuilder();

                while (i < n && openBracketCnt > 0) {

                    if (s.charAt(i) == '[') openBracketCnt++;

                    else if (s.charAt(i) == ']') {
                        openBracketCnt--;

                        if (openBracketCnt == 0) {
                            i++;
                            break;
                        }
                    }

                    temp.append(s.charAt(i++));
                }

                // Decode nested part recursively
                String decodedTemp = decodeString(temp.toString());

                for (int j = 0; j < k; j++) res.append(decodedTemp);
                k = 0;
            }

            // Normal character
            else res.append(s.charAt(i++));
        }

        return res.toString();
    }
}