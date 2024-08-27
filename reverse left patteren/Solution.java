public class Solution {
    public static void seeding(int n) {
        // Write your code here
        for(int i = n; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // You can change the value of n to test with different inputs
        seeding(n);
    }
}
