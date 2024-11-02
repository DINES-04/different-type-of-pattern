public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            int temp=(int)'A'+(n-1);
            char ch=(char) temp;
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        int n = 5;  
        alphaTriangle(n);
    }

}