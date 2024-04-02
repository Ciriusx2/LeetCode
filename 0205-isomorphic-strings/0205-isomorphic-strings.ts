function isIsomorphic(s: string, t: string): boolean {
    if (s.length !== t.length) {
        return false;
    }

    const charMappingMap: Map<string, string> = new Map();

    for (let i = 0; i < s.length; i++) {
        const original: string = s[i];
        const replacement: string = t[i];

        if (!charMappingMap.has(original)) {
            if (![...charMappingMap.values()].includes(replacement))
                charMappingMap.set(original, replacement);
            else
                return false;
        } else {
            const mappedCharacter: string = charMappingMap.get(original);
            if (mappedCharacter !== replacement)
                return false;
        }
    }

    return true;
}
