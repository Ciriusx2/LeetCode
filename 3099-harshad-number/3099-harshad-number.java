class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

       int sum = 0;
        String xStr = String.valueOf(x);
        for (int i = 0; i < xStr.length(); i++) {
            sum += Character.getNumericValue(xStr.charAt(i));
        }
        return (x % sum == 0) ? sum : -1;
    }
}