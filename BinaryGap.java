class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int startCount = -1;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (startCount != -1) {
                    maxGap = Math.max(maxGap, i - startCount - 1);
                }
                startCount = i;
            }
        }

        return maxGap;
    }
}