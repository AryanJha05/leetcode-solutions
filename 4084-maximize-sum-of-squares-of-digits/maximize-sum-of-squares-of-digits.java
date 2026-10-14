class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if(sum > 9 * num) return "";
        
        StringBuilder res = new StringBuilder();

        while(sum >= 9){
            res.append('9');
            sum -= 9;
        }

        if(sum > 0) res.append(sum);

        while(res.length() < num) res.append('0');

        return res.toString();
    }
}