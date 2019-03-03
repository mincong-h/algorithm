class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        mtable = [
            '.-',
            '-...',
            '-.-.',
            '-..',
            '.',
            '..-.',
            '--.',
            '....',
            '..',
            '.---',
            '-.-',
            '.-..',
            '--',
            '-.',
            '---',
            '.--.',
            '--.-',
            '.-.',
            '...',
            '-',
            '..-',
            '...-',
            '.--',
            '-..-',
            '-.--',
            '--..'
        ]
        codes = set()
        for word in words:
            code = ''
            for c in word:
                # 97: ord('a')
                code += mtable[ord(c) - 97]
            codes.add(code)
        return len(codes)
