class Solution {
     String[] ones = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    
    public String convertToWords(int n) {
        // code here
        
             if (n == 0) {
            return "Zero";
        }

        String result = "";

        // Billion
        if (n >= 1000000000) {

            int part = n / 1000000000;

            if (part >= 100) {
                result += ones[part / 100] + " Hundred ";
                part = part % 100;
            }

            if (part >= 20) {
                result += tens[part / 10] + " ";
                part = part % 10;
            }

            if (part > 0) {
                result += ones[part] + " ";
            }

            result += "Billion ";
            n = n % 1000000000;
        }

        // Million
        if (n >= 1000000) {

            int part = n / 1000000;

            if (part >= 100) {
                result += ones[part / 100] + " Hundred ";
                part = part % 100;
            }

            if (part >= 20) {
                result += tens[part / 10] + " ";
                part = part % 10;
            }

            if (part > 0) {
                result += ones[part] + " ";
            }

            result += "Million ";
            n = n % 1000000;
        }

        // Thousand
        if (n >= 1000) {

            int part = n / 1000;

            if (part >= 100) {
                result += ones[part / 100] + " Hundred ";
                part = part % 100;
            }

            if (part >= 20) {
                result += tens[part / 10] + " ";
                part = part % 10;
            }

            if (part > 0) {
                result += ones[part] + " ";
            }

            result += "Thousand ";
            n = n % 1000;
        }

        // Remaining 0 - 999
        if (n >= 100) {
            result += ones[n / 100] + " Hundred ";
            n = n % 100;
        }

        if (n >= 20) {
            result += tens[n / 10] + " ";
            n = n % 10;
        }

        if (n > 0) {
            result += ones[n];
        }

        return result.trim();
        
    }
}