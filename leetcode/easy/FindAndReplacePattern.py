class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        results = []
        for word in words:
            w2p = {} # word-pattern mappings
            p2w = {} # pattern-word mappings
            matched = True;
            for i, wc in enumerate(word):
                pc = pattern[i];
                if pc not in w2p and wc not in p2w:
                    w2p[pc] = wc
                    p2w[wc] = pc
                elif not (w2p.get(pc) == wc and p2w.get(wc) == pc):
                    matched = False
                    break
            if matched:
                results.append(word)
        return results
