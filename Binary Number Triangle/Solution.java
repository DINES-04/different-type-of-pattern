public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i=0;i<n;i++){
            int start=1;
            start = (i % 2 == 0) ? 1 : 0;

            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start= 1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        nBinaryTriangle(n);
    }
}