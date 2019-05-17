import java.util.HashMap;
import java.util.Map;

public class No205_IsomorphicStrings {
    private static boolean isIsomorphic(String s, String t) {
        if (null == s && null == t)
            return true;
        if (null == s || null != t)
            return false;
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }

}
