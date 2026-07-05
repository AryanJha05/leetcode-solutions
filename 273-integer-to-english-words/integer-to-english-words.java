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

        StringBuilder result = new StringBuilder();

        // Zero
        if(num == 0) return "";

        // Below 20
        if(num < 20) return below20[num];

        // Tens
        if(num < 100) {
            result.append(tens[num / 10])
                  .append(" ")
                  .append(helper(num % 10));

            return result.toString();
        }

        // Hundred
        if(num < 1000) {
            result.append(helper(num / 100))
                  .append(" Hundred ")
                  .append(helper(num % 100));

            return result.toString();
        }

        // Thousand
        if(num < 1000000) {
            result.append(helper(num / 1000))
                  .append(" Thousand ")
                  .append(helper(num % 1000));

            return result.toString();
        }

        // Million
        if(num < 1000000000) {
            result.append(helper(num / 1000000))
                  .append(" Million ")
                  .append(helper(num % 1000000));

            return result.toString();
        }

        // Billion
        result.append(helper(num / 1_000_000_000))
              .append(" Billion ")
              .append(helper(num % 1_000_000_000));

        return result.toString();
    }
}