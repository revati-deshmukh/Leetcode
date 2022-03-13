
class CapitalizeTitle {

    public static void main(String[] args){
        CapitalizeTitle result = new CapitalizeTitle();
        var output = result.capitalizeTitle("i lOve leetcode");
        System.out.println(output);

        /**
         *
         * Example 1:
         * Input: title = "capiTalIze tHe titLe"
         * Output: "Capitalize The Title"
         * Explanation:
         * Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
         *
         * Example 2:
         * Input: title = "First leTTeR of EACH Word"
         * Output: "First Letter of Each Word"
         * Explanation:
         * The word "of" has length 2, so it is all lowercase.
         * The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
         *
         * Example 3:
         * Input: title = "i lOve leetcode"
         * Output: "i Love Leetcode"
         * Explanation:
         * The word "i" has length 1, so it is lowercase.
         * The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.*/
    }

    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] arr = title.split(" ");

        for (var ch : arr) {
            if (ch.length() > 2) {
                sb.append(ch.substring(0, 1).toUpperCase() + ch.substring(1).toLowerCase());
            } else {
                sb.append(ch.substring(0).toLowerCase());
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }
    
    //One more solution
    /* public String capitalizeTitle(String title) {
        String output = "";
        String[] arr = title.split(" ");

        Queue<String> queue = new ArrayDeque<>();

        for(var ch : arr){
            if(ch.length() > 2){
                queue.add(ch.substring(0, 1).toUpperCase() + ch.substring(1).toLowerCase());
            } else {
                queue.add(ch.substring(0).toLowerCase());
            }
        }
        while(queue.size() > 1){
            output += queue.remove() + " ";
        }
        output += queue.remove();

        return output;
    } */ 
}
