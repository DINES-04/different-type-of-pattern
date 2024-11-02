public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        char ch = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            int temp= (int) ch +1;
            ch=(char) temp;
        }
    }
    public static void main(String[] args) {
        int n = 5;  
        alphaRamp(n);
    }
}