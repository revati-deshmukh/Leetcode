import java.util.HashSet;

class WordPattern {

    public static void main(String[] arg){
      WordPattern wp = new WordPattern();
      var result = wp.wordPattern("abba", "dog cat cat dog");
      
      /**
      Example 1:
      Input: pattern = "abba", s = "dog cat cat dog"
      Output: true
      
      Example 2:
      Input: pattern = "abba", s = "dog cat cat fish"
      Output: false

      Example 3:
      Input: pattern = "aaaa", s = "dog cat cat dog"
      Output: false
      
      */
    }
    
    
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length) return false;
        
        for(int i = 0; i < pattern.length(); i++){
            
            boolean ch = map1.containsKey(pattern.charAt(i));
            boolean word = map2.containsKey(words[i]);
            
            if(!ch && !word){
                map1.put(pattern.charAt(i), words[i]);
                map2.put(words[i], pattern.charAt(i));
            } else if(!ch || !word) {
                return false;
            } else if (!(map1.get(pattern.charAt(i)).equals(words[i]) && map2.get(words[i]) == pattern.charAt(i))){
                return false;
            }
        }
     
        return true;
    }
}
