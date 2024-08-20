class Solution {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class main{
 public static void main(String[] args){
  Solution s= new Solution();
  int n=5;
  s.nForest(n);
 }
}