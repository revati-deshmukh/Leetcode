
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
