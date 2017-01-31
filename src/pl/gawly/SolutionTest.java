package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(7, s.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}
