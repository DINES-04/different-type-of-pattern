public class Solution {
    public static void nTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        int n = 5;
        Solution.nTriangle(n);
    }
}
