import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/self-dividing-numbers/description/

public class SelfDividingNumber {
    public static void main(String[] args){
        SelfDividingNumber sdn = new SelfDividingNumber();
        sdn.selfDividingNumbers(11, 45);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i < right; i++){
            if(isDivisible(i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
        return ans;
    }

    public boolean isDivisible(int num){
        int temp = num;
        while(num != 0){
            int rem = num % 10;
            if(rem == 0)
                return false;
            if(temp % rem != 0){
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
