package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            n ^= A[i];
        }
        return n;
    }

}
