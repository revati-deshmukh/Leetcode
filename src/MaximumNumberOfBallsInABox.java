import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInABox {

    public static void main(String[] arg){
        MaximumNumberOfBallsInABox maxNoOfBalls = new MaximumNumberOfBallsInABox();
        var result = maxNoOfBalls.countBalls(1, 10);
        System.out.println(result);
        /**
         Example 1:

         Input: lowLimit = 1, highLimit = 10
         Output: 2
         Explanation:
         Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
         Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
         Box 1 has the most number of balls with 2 balls.

         Example 2:

         Input: lowLimit = 5, highLimit = 15
         Output: 2
         Explanation:
         Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
         Ball Count:  1 1 1 1 2 2 1 1 1 0  0  ...
         Boxes 5 and 6 have the most number of balls with 2 balls in each.

         Example 3:

         Input: lowLimit = 19, highLimit = 28
         Output: 2
         Explanation:
         Box Number:  1 2 3 4 5 6 7 8 9 10 11 12 ...
         Ball Count:  0 1 1 1 1 1 1 1 1 2  0  0  ...
         Box 10 has the most number of balls with 2 balls.

         */
    }

    public int countBalls(int lowLimit, int highLimit) {

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(int i = lowLimit; i <= highLimit; i++){
            int j = i, sum = 0;
            while(j != 0){
                sum += j % 10;
                j = j / 10;
            }

            int count = map.containsKey(sum) ? map.get(sum) : 0;
            map.put(sum, count + 1);
        }

        for(int count : map.values()){
            max = Math.max(max, count);
        }

        return max;
    }
}
