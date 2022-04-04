import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeGroupPositions {

    public static void main(String[] args){
        LargeGroupPositions lgp = new LargeGroupPositions();
        String s= "aaa";
        var result = lgp.largeGroupPositions(s);
        System.out.println(result);
    }

    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 1,j = 0; i <= s.length(); i++){
            if(i < s.length() && (s.charAt(i) == s.charAt(j))){
                continue;
            }
            if(i-j >= 3){
                result.add(Arrays.asList(j , i-1));
            }
            j = i;
        }

        return result;
    }

}
