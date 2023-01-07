import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    public static void main(String[] args){
        HappyNumber hn = new HappyNumber();
        var result = hn.isHappy(19);
        System.out.println(result);

        System.out.println(happyNumber(19));

        /**
         * Example 1:
         * Input: n = 19
         * Output: true
         * Explanation:
         * 12 + 92 = 82
         * 82 + 22 = 68
         * 62 + 82 = 100
         * 12 + 02 + 02 = 1
         *
         * Example 2:
         * Input: n = 2
         * Output: false
         * */
    }

    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int flag = 0;

        while(n > 0){
            int sum = 0;
            while(n != 0){
                int carry = n % 10;
                sum += (carry * carry);
                n = n / 10;
            }
            n = sum;
            if(map.containsKey(sum)){
                if(sum == 1)
                    flag = 1;

                break;
            } else {
                map.put(sum, 1);
            }
        }

        return flag == 1;
    }

    //Using Linked list
    public static boolean happyNumber(int n){
        int slow = n;
        int fast = n;

        do{
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        } while(slow != fast);

        if(slow == 1)
            return true;

        return false;
    }

    public static int getSumOfSquares(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }

        return sum;
    }
}
