public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=n;i>0;i--){
            char num='A';
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                int temp = (int) num+1;
                num = (char) temp;
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        int n = 5;  
        nLetterTriangle(n);
    }
}
