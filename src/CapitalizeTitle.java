
class Solution {

    public static void main(String[] args){
        Solution result = new Solution();
        var output = result.capitalizeTitle("i lOve leetcode");
        System.out.println(output);
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
}