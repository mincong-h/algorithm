class Solution {
    public int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            squares[i] = A[i] * A[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}
