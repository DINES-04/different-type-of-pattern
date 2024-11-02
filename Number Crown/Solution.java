public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            space=space-2;
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        numberCrown(n);
    }
}