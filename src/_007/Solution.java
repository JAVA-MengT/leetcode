package _007;

/**
 * @author zengjinlin
 * @create 2019-07-23 22:49
 */
public class Solution {
    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(100));
        System.out.println(solution.reverse(1000000003));
    }
}
