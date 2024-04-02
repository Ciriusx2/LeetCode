using System.Collections.Generic;

public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if (s.Length != t.Length)
            return false;

        Dictionary<char, char> charMappingMap = new Dictionary<char, char>();

        for (int i = 0; i < s.Length; i++) {
            char original = s[i];
            char replacement = t[i];

            if (!charMappingMap.ContainsKey(original)) {
                if (!charMappingMap.ContainsValue(replacement))
                    charMappingMap.Add(original, replacement);
                else
                    return false;
            } else {
                char mappedCharacter = charMappingMap[original];
                if (mappedCharacter != replacement)
                    return false;
            }
        }

        return true;
    }
}
