// Конь
public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if ((Math.abs(line - toLine) == 2 && Math.abs(column - toColumn) == 1) ||
                    (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 2)) {
                return chessBoard.board[toLine][toColumn] == null ||
                        !chessBoard.board[toLine][toColumn].getColor().equals(color);
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

}
