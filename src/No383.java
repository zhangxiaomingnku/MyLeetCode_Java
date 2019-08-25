import java.util.HashMap;

public class No383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0)
            return true;
        if (magazine == null || magazine.length() == 0)
            return false;

        int[] map = new int[26];
        for (char c : magazine.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (map[c - 'a'] <= 0)
                return false;
            else
                map[c - 'a']--;
        }
        return true;
    }
}
