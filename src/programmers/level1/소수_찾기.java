package programmers.level1;

public class 소수_찾기 {
    public static void main(String[] args) {
        int n = 5;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (i != j && i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                answer++;
        }

        return answer;
    }
}
