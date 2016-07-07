public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left= Math.max(A,E);
        int right = Math.max(Math.min(C,G),left);
        int bottom = Math.max(B,F);
        int top = Math.max(Math.min(D,H),bottom);
        
        return (C-A)*(D-B)-(top-bottom)*(right-left)+(G-E)*(H-F);
    }
}