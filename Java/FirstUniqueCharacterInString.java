/* Leetcode Problem 387.

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            int count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), count+1);
        }
        
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
