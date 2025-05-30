class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();

        int current = n;
        while (current != 1 && !visited.contains(current)) {
            visited.add(current);
            current = sum(current);
        }

        return current == 1;
    }

    public int sum(int n) {
        int totalSum = 0;
        while (n > 0) { 
            int d = n % 10;
            totalSum += Math.pow(d, 2);
            n /= 10;
        }
        return totalSum;
    }
}