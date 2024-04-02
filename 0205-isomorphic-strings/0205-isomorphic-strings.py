class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        char_mapping = {}
        
        for i in range(len(s)):
            if s[i] not in char_mapping:
                if t[i] not in char_mapping.values():
                    char_mapping[s[i]] = t[i]
                else:
                    return False
            elif char_mapping[s[i]] != t[i]:
                return False
        
        return True