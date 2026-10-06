class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') st.push('(');
            else{
                if(!st.isEmpty() && st.peek() == '(') st.pop();
                else res++;
            }
        }

        return res + st.size();
    }
}