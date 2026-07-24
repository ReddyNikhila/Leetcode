class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {

            if (N % 2 == 1) {   // if exponent is odd
                ans *= x;
            }

            x = x * x;          // square the base
            N = N / 2;          // halve the exponent
        }

        return ans;
    }
}