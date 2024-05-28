public class Day05_03 {
    class Solution {
        public int solution(int a, int b, int c) {
            double answer = 0;
            if (a == b && b == c) {
                answer =  ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
            } else if (a == b || a == c || b == c) {
                answer =  ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
            } else {
                answer = a + b + c;
            }
            return (int)answer;
        }
    }
}
