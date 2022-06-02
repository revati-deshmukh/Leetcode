public class LongestPalindromeSubstring {

    public static void main(String[] args){
        LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
        var result = lps.longestPalindrome("babad");
        System.out.println(result);

        /**
         * Example 1:
         * Input: s = "babad"
         * Output: "bab"
         * Explanation: "aba" is also a valid answer.
         *
         * Example 2:
         * Input: s = "cbbd"
         * Output: "bb"
         *
         * Example 3:
         * Input: s = "gphyvqruxjmwhonjjrgumxjhfyupajxbjgthzdvrdqmdouuukeaxhjumkmmhdglqrrohydrmbvtuwstgkobyzjjtdtjroqpyusfsbjlusekghtfbdctvgmqzeybnwzlhdnhwzptgkzmujfldoiejmvxnorvbiubfflygrkedyirienybosqzrkbpcfidvkkafftgzwrcitqizelhfsruwmtrgaocjcyxdkovtdennrkmxwpdsxpxuarhgusizmwakrmhdwcgvfljhzcskclgrvvbrkesojyhofwqiwhiupujmkcvlywjtmbncurxxmpdskupyvvweuhbsnanzfioirecfxvmgcpwrpmbhmkdtckhvbxnsbcifhqwjjczfokovpqyjmbywtpaqcfjowxnmtirdsfeujyogbzjnjcmqyzciwjqxxgrxblvqbutqittroqadqlsdzihngpfpjovbkpeveidjpfjktavvwurqrgqdomiibfgqxwybcyovysydxyyymmiuwovnevzsjisdwgkcbsookbarezbhnwyqthcvzyodbcwjptvigcphawzxouixhbpezzirbhvomqhxkfdbokblqmrhhioyqubpyqhjrnwhjxsrodtblqxkhezubprqftrqcyrzwywqrgockioqdmzuqjkpmsyohtlcnesbgzqhkalwixfcgyeqdzhnnlzawrdgskurcxfbekbspupbduxqxjeczpmdvssikbivjhinaopbabrmvscthvoqqbkgekcgyrelxkwoawpbrcbszelnxlyikbulgmlwyffurimlfxurjsbzgddxbgqpcdsuutfiivjbyqzhprdqhahpgenjkbiukurvdwapuewrbehczrtswubthodv"
         * Output: "jtdtj"
         * */
    }

    public String longestPalindrome(String s) {

        String longestString = "";
        int resultLen = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                if(isPalindrome(s.substring(i,j))){
                    if(s.substring(i,j).length() > resultLen){
                        resultLen = s.substring(i,j).length();
                        longestString = s.substring(i,j);
                    }
                }
            }
        }

        return longestString;
    }

    public boolean isPalindrome(String input){
        StringBuilder original = new StringBuilder(input);
        StringBuilder reverse = original.reverse();

        return (reverse.toString()).equals(input);
    }
}
