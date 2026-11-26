class Solution {
    public boolean isHappy(int n) {
         int slow = n;
        int fast = getNext(n);

        // Loop until fast reaches 1 (happy) or slow catches up to fast (cycle)
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);              // Move 1 step
            fast = getNext(getNext(fast));     // Move 2 steps
        }

        return fast == 1;
    }

    // Helper method to calculate the sum of the squares of digits
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            totalSum += digit * digit;
        }
        return totalSum;
    }
}