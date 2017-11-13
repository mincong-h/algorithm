class Solution {

    public boolean judgeCircle(String moves) {
        Position p = new Position(0, 0);
        for (char c : moves.toCharArray()) {
            p = p.moves(c);
        }
        return p.x == 0 && p.y == 0;
    }

    private static class Position {

        private int x;

        private int y;
        
        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        private Position moves(char c) {
            if (c == 'U') {
                return new Position(x, y + 1);
            }
            if (c == 'D') {
                return new Position(x, y - 1);
            }
            if (c == 'L') {
                return new Position(x - 1, y);
            }
            if (c == 'R') {
                return new Position(x + 1, y);
            }
            throw new RuntimeException("Should never happen");
        }
    }

}
