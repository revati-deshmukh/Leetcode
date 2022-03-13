import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("add", "egg"));
        System.out.println(isomorphicStrings.isIsomorphic1("paper", "hello"));

        /*
        Example 1:
        Input: s = "egg", t = "add"
        Output: true

        Example 2:
        Input: s = "foo", t = "bar"
        Output: false

        Example 3:
        Input: s = "paper", t = "title"
        Output: true */
    }


    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        StringBuilder sArr = new StringBuilder();
        StringBuilder tArr = new StringBuilder();
        for(var ch: s.toCharArray()){
            sArr.append(ch);
        }

        for(var ch: t.toCharArray()){
            tArr.append(ch);
        }

        for(int i = 0; i < sArr.length(); i++){
            char sChar = sArr.charAt(i);
            char tChar = tArr.charAt(i);


            if(sArr.length() != tArr.length()){
                return false;

            }else if(!sMap.containsKey(sChar) && !tMap.containsKey(tChar)){
                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);
            } else if(sMap.containsKey(sChar) && tMap.containsKey(tChar)){
                if(sMap.get(sChar) != tChar || tMap.get(tChar) != sChar)
                    return false;
            } else if(sMap.containsKey(sChar) || tMap.containsKey(tChar)) {
                return false;
            }

        }
        return true;
    }

    //Refactored solution
    public boolean isIsomorphic1(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(!map.containsKey(sChar) && map.containsValue(tChar)) return false;
            if(map.containsKey(sChar) && map.get(sChar) != tChar) return false;

            map.put(sChar, tChar);
        }
        return true;
    }
}
