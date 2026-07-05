class Solution {

    String[] below20 = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy",
        "Eighty", "Ninety"
    };

    public String numberToWords(int num) {

        if(num == 0) return "Zero";

        return helper(num).trim().replaceAll("\\s+", " ");
    }

    public String helper(int num) {

        // Zero : 
        if(num == 0) return "";

        // Below20:
        if(num < 20) return below20[num];

        //tens :
        if(num < 100) return tens[num/10] + " " + helper(num%10);

        //hundred :
        if(num < 1000) return helper(num/100) + " Hundred " + helper(num%100);

        //thoousand :
        if(num < 1000000) return helper(num/1000) + " Thousand " + helper(num%1000);

        //million
        if(num < 1000000000) return helper(num/1000000) + " Million " + helper(num%1000000);

        //billion:
        return helper(num/1_000000000) + " Billion " + helper(num%1000000000);
    }
}