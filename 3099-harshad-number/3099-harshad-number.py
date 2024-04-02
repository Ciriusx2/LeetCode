class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        smDigits = sum(map(int,str(x)))
        return smDigits if x % smDigits == 0 else -1