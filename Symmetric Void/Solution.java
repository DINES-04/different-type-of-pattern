public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        int space=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<space;j++){
                System.out.print(" "); 
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            space=space+2;
            System.out.println();
        } 
        space=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<space;j++){
                System.out.print(" "); 
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            space=space+2;
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        int n = 5;  
        symmetry(n);
    }
}