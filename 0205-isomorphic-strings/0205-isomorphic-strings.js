function isIsomorphic(s, t) {
    if (s.length !== t.length) {
        return false;
    }

    const charMappingMap = new Map();

    for (let i = 0; i < s.length; i++) {
        const original = s[i];
        const replacement = t[i];

        if (!charMappingMap.has(original)) {
            if (![...charMappingMap.values()].includes(replacement))
                charMappingMap.set(original, replacement);
            else
                return false;
        } else {
            const mappedCharacter = charMappingMap.get(original);
            if (mappedCharacter !== replacement)
                return false;
        }
    }

    return true;
}
