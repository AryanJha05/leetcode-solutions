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

        if (num == 0) return "Zero";

        return helper(num).toString().trim();
    }

    public StringBuilder helper(int num) {

        StringBuilder result = new StringBuilder();

        // Zero
        if (num == 0) return result;

        // Below 20
        if (num < 20) result.append(below20[num]);

        // Tens
        else if (num < 100) {
            result.append(tens[num / 10]);

            if (num % 10 != 0) result.append(" ").append(helper(num % 10));
        }

        // Hundred
        else if (num < 1000) {
            result.append(helper(num / 100)).append(" Hundred");

            if (num % 100 != 0) result.append(" ").append(helper(num % 100));
        }

        // Thousand
        else if (num < 1_000_000) {
            result.append(helper(num / 1000)).append(" Thousand");

            if (num % 1000 != 0) result.append(" ").append(helper(num % 1000));
        }

        // Million
        else if (num < 1_000_000_000) {
            result.append(helper(num / 1_000_000)).append(" Million");

            if (num % 1_000_000 != 0) result.append(" ").append(helper(num % 1_000_000));
        }

        // Billion
        else {
            result.append(helper(num / 1_000_000_000)).append(" Billion");

            if (num % 1_000_000_000 != 0) result.append(" ").append(helper(num % 1_000_000_000));
        }

        return result;
    }
}