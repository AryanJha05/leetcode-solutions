// class Solution {
//     public boolean isPalindrome(String s) {

//         s = s.toLowerCase();

//         int left = 0;
//         int right = s.length() - 1;

//         while(left < right){
//             char l = s.charAt(left);
//             char r = s.charAt(right);

//             if(!Character.isLetterOrDigit(l)) left++;
//             else if(!Character.isLetterOrDigit(r)) right--;
//             else{
//                 if(l != r) return false;
//                 left++;
//                 right--;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean helper(String s, int l, int r){

        if(l > r) return true;

        if(!Character.isLetterOrDigit(s.charAt(l))) return helper(s, l + 1, r);
        else if(!Character.isLetterOrDigit(s.charAt(r))) return helper(s, l, r - 1);
        
        if (s.charAt(l) != s.charAt(r)) return false;

        return helper(s, l + 1, r - 1);


    }

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        return helper(s, 0, s.length() - 1);
    }
}