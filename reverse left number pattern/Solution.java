public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        nNumberTriangle(n);
    }
}