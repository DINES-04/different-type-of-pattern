public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;  
        nNumberTriangle(n);
    }
}